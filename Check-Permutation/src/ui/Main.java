package ui;

public class Main {

    public static void main(String[] args) {
        System.out.println(checkPerm("he", "eh"));

    }

    public static boolean checkPerm(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] arr = new int[128];
        for (Character c : str1.toCharArray()) {
            int charIndex = Character.valueOf(c);
            arr[charIndex]++;
        }

        for (Character c : str2.toCharArray()) {
            int charIndex = Character.valueOf(c);
            arr[charIndex]--;
            if (arr[charIndex] < 0) {
                return false;
            }
        }
        return true;
    }
}
