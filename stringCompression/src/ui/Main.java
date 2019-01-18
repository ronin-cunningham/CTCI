package ui;

public class Main {

    public static void main(String[] args) {
        System.out.println(strComp("aaaabbbbbcccbbbssssksj"));
        System.out.println(strComp("sample"));
    }

    public static String strComp(String str) {
        char[] charArr = str.toCharArray();
        int charCount = 1;
        String finalString = "";

        for (int i = 0; i < charArr.length; i++) {
            if (i + 1 == charArr.length) {
                finalString += charArr[i];
                finalString += charCount;
            } else if (charArr[i] == charArr[i + 1]) {
                charCount++;
            } else {
                finalString += charArr[i];
                finalString += charCount;
                charCount = 1;
            }
        }
        if (finalString.length() > str.length()) {
            return str;
        }
        return finalString;
    }
}
