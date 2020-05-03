package study.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author syw
 * @date 2020/5/3 - 11:50
 */
public class ReversePrint {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        System.out.println(Arrays.toString(reversePrint(l1)));
    }

    /**
     * 栈思想
     * @param head
     * @return
     */
    private static int[] reversePrint(ListNode head) {
        if (head == null) return new int[0];
        ArrayList<Integer> list = new ArrayList<>();

        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        int length = list.size();
        int[] res = new int[length];
        for (int i = 0; i < length; i++) {
            res[i] = list.get(length - 1 - i);
        }
        return res;
    }
}