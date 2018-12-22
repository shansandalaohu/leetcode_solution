package LinkList.Simple;

/**
 * 翻转链表
 *
 * @author yzh
 * @Description: 反转一个单链表。
 * 示例:
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * @Date: created in 15:13 2018/12/20
 * @Version: 1.0
 */
public class Solution206 {
    /**
     * 使用递归，逐层确定是否还有下一个结点，如果没有，则认定递归到最深的元素。需要注意：需要将该层的结点指向父节点，才能实现反转
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        } else {
            ListNode nextNode = reverseList(head.next);
            head.next.next = head; //将当前结点的下一个的next指针指向当前结点，即 3->4 变成 3->4->3
            head.next = null;
            return nextNode;
        }
    }

    /**
     * 解法二：遍历法
     * @param head
     * @return
     */
    public ListNode reverseList1(ListNode head) {
        ListNode previousNode = null;
        ListNode currentNode = head;
        ListNode headNode = null;
        while (currentNode != null) {
            ListNode nextNode = currentNode.next;
            if (nextNode == null) {
                headNode = currentNode;
            }
            //以下三行是反转结点的操作
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        return headNode;
    }
}
