package study.LinkedList;

/**
 * @author syw
 * @date 2020/5/2 - 20:01
 */

/**
 * 删除链表的节点
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 * 返回删除后的链表的头结点
 */
public class DelNode {
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

        System.out.println(ListNode.toString(deleteNode(l1,3)));
    }

    private static ListNode deleteNode(ListNode head,int val){
        if(head.val == val){
            return head.next;
        }
        ListNode cur = head;
        while(cur.next.val != val){
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return head;
    }
}
