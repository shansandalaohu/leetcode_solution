package LinkList.Simple;

/**
 * @author yzh
 * @Description: 给定一个链表，判断链表中是否有环。
 *               为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从0
 *               开始）。 如果 pos 是 -1，则在该链表中没有环。
 *               输入：head = [3,2,0,-4], pos = 1
 *               输出：true
 *               解释：链表中有一个环，其尾部连接到第二个节点。
 *
 *              示例 2：
 *              输入：head = [1,2], pos = 0
 *              输出：true
 *              解释：链表中有一个环，其尾部连接到第一个节点。
 *
 *              示例 3:
 *              输入：head = [1], pos = -1
 *              输出：false
 *              解释：链表中没有环。
 * @Date: created in 20:16 2018/12/19
 * @Version: 1.0
 */
public class Solution141 {

    /**
     * 定义两个指针，让一个走两步，一个走一步，如果有环，则两个指针一定会相遇
     * 加while(second != null && second.next != null)这个条件的目的是防止
     * second = second.next.next;出现空指针异常
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        ListNode first = head;
        ListNode second = head;

        while(second != null && second.next != null){
            first = first.next;
            second = second.next.next;
            if(first == second){
                return true;
            }
        }
        return false;
    }
}
