package ui;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public static void delMid(Node nodeToDel) {
        if (nodeToDel == null) {
            return;
        }
        if (nodeToDel.next != null) {
            Node nxt = nodeToDel.next;
            nodeToDel.data = nxt.data;
            nodeToDel.next = nxt.next;
        }

    }
}