public class Main {

    // 1. parenthesesCheck
    public static boolean parenthesesCheck(String str) {
        int openParantheses = 0;
        int closeParantheses = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals("(")) {
                openParantheses++;
            }
            if (str.substring(i, i + 1).equals(")")) {
                closeParantheses++;
            }
        }
        if (openParantheses == closeParantheses) {
            return true;
        }
        return false;
    }

    // 2. reverseInteger
    public static String reverseInteger(int Int) {
        String intToString = Int + "";
        if (intToString.length() <= 1) {
            return intToString;
        }
        String result = "";
        for (int i = intToString.length(); i > 0; i--) {
            result = result + intToString.charAt(i - 1);
        }
        return result;
    }

    // 3. encryptThis
    public static String encryptThis(String coded) {
        String [] words = coded.split(" ");
        String encrypted = "";

        for (String word : words){
            char firstChar = word.charAt(0);
            String letterToInt = (int) firstChar + "";

            if (word.length() > 1) {
                char second = word.charAt(1);
                char last = word.charAt(word.length() - 1);

                if (word.length() > 2) {
                    String mid = word.substring(2, word.length() - 1);
                    letterToInt += last + mid + second;
                } else {
                    letterToInt += last;
                }
            }

            encrypted += letterToInt + " ";
            }
        return encrypted.trim();
    }
    // 4. decipherThis
    public static String decipherThis(String encrypted) {
        String[] words = encrypted.split(" ");
        String deciphered = "";

        for (String word : words) {
            int firstLetter = 0;
            while (firstLetter < word.length() && Character.isDigit(word.charAt(firstLetter))) {
                firstLetter++;
            }

            int num = Integer.parseInt(word.substring(0, firstLetter));
            char first = (char) num;

            String restOfWord = word.substring(firstLetter);

            if (restOfWord.length() > 1) {
                char second = restOfWord.charAt(0);
                char last = restOfWord.charAt(restOfWord.length() - 1);
                restOfWord = last + restOfWord.substring(1, restOfWord.length() - 1) + second;
            }

            deciphered += first + restOfWord + " ";
        }
        return deciphered.trim();
    }
}