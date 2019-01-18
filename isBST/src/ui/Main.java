package ui;

public class Main {

    public static void main(String[] args) {
    }

    public static boolean isBST(Node n) {
        return isBST(n, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static boolean isBST(Node n, int min, int max) {
        if (n == null) {
            return true;
        }
        if (n.data < min || n.data > max) {
            return false;
        }
        return isBST(n.left, min, n.data) && isBST(n.right, n.data + 1, max);
    }
}
