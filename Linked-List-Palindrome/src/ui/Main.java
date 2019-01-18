package ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {
	Node n1 = new Node(1);
	Node n2 = new Node(2);
	Node n3 = new Node(6);
	Node n4 = new Node( 2);
	Node n5 = new Node(1);

	n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;
    n5.next = null;

    System.out.println(isPal(n1));
    }

    public static boolean isPal(Node n) {
        Node follow = n;
        ArrayList<Integer> lst = new ArrayList<Integer>();

        while (n != null) {
            lst.add(n.data);
            n = n.next;
        }
        for (int i = 0; i < lst.size(); i++) {
            if (follow.data != lst.get(lst.size() - i - 1)) {
                return false;
            }
            follow = follow.next;
        }
        return true;
    }
}
