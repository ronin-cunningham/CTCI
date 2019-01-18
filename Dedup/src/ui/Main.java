package ui;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

    }

    public static void deDupe(Node n) {
        while (n != null) {
            Node curr = n;
            while (curr.next != null) {
                if (curr.next.data == n.data) {
                    curr.next = curr.next.next;
                } else {
                    curr = curr.next;
                }
            }
            n = n.next;
        }
    }
}

