package study.LinkedList;

/**
 * @author syw
 * @date 2020/5/1 - 20:40
 */

import java.util.List;

/**
 * 反转链表
 * 定义一个函数，输入一个链表的头结点，反转该链表并输出反转后的链表的头结点
 */
public class ReverseList {
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


        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        //ListNode n1 = l1;//n1引用，都指向l1 ，所以l1改变，n1也改变

        System.out.println(ListNode.toString(reverse(l1)));
        System.out.println(ListNode.toString(reverse2(n1)));
    }

    /**
     * 双指针 ，pre 在前，cur 在后，依次前进并调整元素指针指向
     * @param head
     * @return
     */
    private static ListNode reverse(ListNode head){
        ListNode cur = head;
        ListNode pre = null;
        ListNode temp;

        while(cur != null){
            temp = cur.next;//因为调整指针指向后，链表会断裂，所以要将 cur.next 存储起来
            cur.next = pre; //调整指针指向前一个节点
            pre = cur;//pre 向前走
            cur = temp;//cur 向前走
        }
        return pre;//跳出循环后，链表断裂，即当前 cur 节点孤立
    }

    /**
     * 递归 ， 递归找到到尾节点即为反转后的头结点，然后返回至上一层递归，实现局部反转,
     * 并不断将当前递归结点添加到新头结点之后。
     * @param head
     * @return
     */
    private static ListNode reverse2(ListNode head){
        if(head == null || head.next == null){
            return head;
        }

        ListNode tail = reverse2(head.next); //原尾节点即反转后的头结点

        head.next.next = head; //将当前指针的下一个节点指向当前结点，实现局部反转

        //防止链表循环，需要将head.next 置空，如1->2->3，反转后实现 1->2<->3 即出现循环，
        //所以需要将 2->3断开。
        head.next = null;

        return tail;
    }

}
