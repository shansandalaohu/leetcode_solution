package LinkList.Simple;

/** 删除排序链表中的重复元素
 * @author yzh
 * @Description: 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 *               输入: 1->1->2->3->3
 *               输出: 1->2->3
 * @Date: created in 19:33 2018/12/19
 * @Version: 1.0
 */
public class Solution83 {

    /**
     * 一开始不加这个造成空指针异常
     * if(head == null || head.next == null){
     *             return head;
     *  }
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {
        // ListNode temp = new ListNode(-1);
        ListNode art = head;
        if(head == null || head.next == null){
            return head;
        }
        while(head.next != null){
            if(head.val == head.next.val){
                head.next = head.next.next;
            }else{
                head = head.next;
            }
        }
        return art;
    }
}
