package LinkList;

/**
 * 回文链表
 *
 * @author yzh
 * @Description: 请判断一个链表是否为回文链表。
 *               示例 1:
 *               输入: 1->2
 *               输出: false
 *               示例 2:
 *               输入: 1->2->2->1
 *               输出: true
 * @Date: created in 16:36 2018/12/21
 * @Version: 1.0
 */
public class Solution234 {
    /**
     * 解法: 要判断一个链表是否为回文链表，可以先定义两个指针:fast指针和slow指针,fast指针走两步,slow指针走一步.当fast走到链尾时,
     * slow走到链表中点.此时找到了链表中点,找到链表中点后,将链表中点往后的所有结点翻转过来，同时逐一和开头一半的结点比较,如果这些结点
     * 的值全部一一相等,则可判定这个链表是回文链表.
     * 如:1->2->2->1 变成 1->2->1->2
     *  head  slow     head  slow
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        //fast跑到链尾时，slow指针刚好跑到中点
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        //将中点以后的所有结点翻转
        slow = reverse(slow.next);

        while (slow != null) {
            if (head.val != slow.val) {
                return false;
            }
            head = head.next;
            slow = slow.next;
        }
        return true;
    }

    //将链表翻转
    private ListNode reverse(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
