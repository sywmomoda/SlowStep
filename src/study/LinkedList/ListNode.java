package study.LinkedList;


/**
 * @author syw
 * @date 2020/4/11 - 17:49
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }

    public static String toString(ListNode listNode) {
        if(listNode == null){
            return "null";
        }
        StringBuffer sb = new StringBuffer();
        while(listNode.next != null){
            sb.append(listNode.val);
            sb.append(" -> ");
            listNode = listNode.next;
        }
        sb.append(listNode.val);
        return sb.toString();
    }
}
