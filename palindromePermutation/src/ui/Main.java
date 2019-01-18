package ui;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPermutationOfPalindrome("racecar"));
        System.out.println(isPermutationOfPalindrome("rrcceaa"));
    }



    public static boolean isPermutationOfPalindrome(String str) {
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        char[] charArr = str.toCharArray();
        int oddCount = 0;

        for (char c : charArr) {
            int x = getTableValue(c);

            if (x != -1){
                table[x]++;

                if (table[x] % 2 == 1) {
                    oddCount++;
                } else{
                    oddCount--;
                }
            }

        }
        if (oddCount <= 1) {
            return true;
        } else {
            return false;
        }
    }

    //Sets table index value of character, or -1 if not in lower case alphabet.
    public static int getTableValue(char c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if (a <= val && val <= z) {
            return (val - a);
        } else {
            return -1;
        }
    }
}
