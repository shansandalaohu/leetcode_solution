package LinkList;

/**
 * 删除链表的倒数第N个节点
 *
 * @author yzh
 * @Description: 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * @Date: created in 21:21 2018/12/12
 * @Version: 1.0
 */
public class DeleteNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode sur = new ListNode(-1);
        sur.next = head;
        ListNode fast = sur;
        ListNode slow = sur;
        while (fast != null && n > -1) {
            fast = fast.next;
            n--;
        }
        //定义两个指针，让快的指针先走n步，然后两个指针再一起走，当快的指针走到链表末尾时，慢的指针走到倒数第n个节点，然后跳过这个节点
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return sur.next;
    }
}

