package ui;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {


    }

    public static Node kthToLast(Node n, int k) {
        Node curr = n;
        Node follow = n;

        for (int i = 0; i < k; i++) {
            if (curr == null) {
                return null;
            }
            curr = curr.next;
        }
        while (curr.next != null) {
            curr = curr.next;
            follow = follow.next;
        }
        return follow;
    }

}
