package study.LinkedList;

/**
 * @author syw
 * @date 2020/4/11 - 17:54
 */

/**
 * 链表中倒数第 k 个节点
 * 输入一个链表，输出该链表中倒数第 k 个节点。（k从1开始计数，即尾节点为倒数第一个节点）
 */
public class TheLastK {

    /**
     * 从头结点开始，依次对链表的每个节点进行测试，遍历k个元素，查看是否到达链表尾。
     * 时间复杂度：O(k*n)， 空间复杂度：O(1)
     * @param head
     * @param k
     * @return
     */
    public static ListNode getKthFromEnd(ListNode head,int k){
        if(head == null) return null;

        ListNode p1 = head;
        ListNode p2 = head;
        ListNode ans = null;

        while(p2.next != null){
            for (int i = 0; i < k - 1; i++) {
                p1 = p2.next;
            }
            if(p1.next == null) ans = p2;
            p2 = p2.next;
        }

        return ans;
    }


    /**
     * 双指针，p1 先走 k-1 步，然后 p1、p2 同时前进，p1 指向最后一个元素时，p2 即为所求。
     * 时间复杂度 O(n），空间复杂度 O(1)
     * @param head
     * @param k
     * @return
     */
    public static ListNode getKthFromEnd2(ListNode head,int k){
        if(head == null) return null;

        ListNode p1 = head;
        ListNode p2 = head;

        for (int i = 0; i < k - 1; i++) {
            p1 = p1.next;
        }
        while(p1.next != null){
            p1 = p1.next;
            p2 = p2.next;
        }

        return p2;
    }

    /**
     * 打印链表
     * @param listNode
     */
    public static void print(ListNode listNode){
        ListNode list = listNode;
        while(list != null){
            System.out.print(list.toString());
            list = list.next;
        }
    }

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

        ListNode list = l1;
        print(list);
        System.out.println();

        print(getKthFromEnd(l1,2));
        System.out.println();

        print(getKthFromEnd2(l1,2));

    }
}
