package LinkList;

/**
 * 题目：合并两个有序链表
 * @author yzh
 * @Description: 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *               示例：
 *               输入：1->2->4, 1->3->4
 *               输出：1->1->2->3->4->4
 * @Date: created in 16:16 2018/12/19
 * @Version: 1.0
 */
public class Solution21 {
    /**
     * 思路：将两个链表的结点逐一比较值的大小，数值小的放到新的链表中，注意：l1或者l2可能有一个还没遍历完
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newList = new ListNode(-1);
        ListNode temp = newList;

        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                newList.next = l1;
                l1 = l1.next;
            }else{
                newList.next = l2;
                l2 = l2.next;
            }
            newList = newList.next;
        }

        //l1或者l2可能有一个还没遍历完
        if(l1 == null){
            newList.next = l2;
        }
        if(l2 == null){
            newList.next = l1;
        }

        return temp.next;
    }

    /**
     * 思路2：使用递归，将两个链表的结点逐一比较值的大小，数值小的结点为新的链表的结点，然后将剩下的结点继续比较，找出下一个节点
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists02(ListNode l1, ListNode l2) {

        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }

        ListNode newList;
        if(l1.val <= l2.val){
            newList = l1;
            newList.next = mergeTwoLists02(l1.next,l2);
        }else{
            newList = l2;
            newList.next = mergeTwoLists02(l1,l2.next);
        }
        return newList;
    }
}
