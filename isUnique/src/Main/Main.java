package Main;
import java.util.ArrayList;
import java.util.HashSet;


public class Main {

    public static void main(String[] args) {

        System.out.println(isUnique("helol"));


    }

    public static boolean isUnique(String str) {
        int[] arr = new int[128];
        for (Character c : str.toCharArray()) {
            int charIndex = Character.valueOf(c);
            arr[charIndex]++;
            if (arr[charIndex] > 1) {
                return false;
            }
        }
        return true;
    }

}
