package LinkList.Simple;

/**
 * 相交链表
 *
 * @author yzh
 * @Description: 编写一个程序，找到两个单链表相交的起始节点。
 * @Date: created in 11:22 2018/12/20
 * @Version: 1.0
 */
public class Solution160 {


    /** 先分别遍历两个链表，求出各自的长度，然后求出长度差，让长的链表先走长度差个单位，然后短的链表开始走，当两个结点相等时，即是相交的结点
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }
        ListNode ANode = headA;
        ListNode BNode = headB;
        int countA = 0, countB = 0;
        //计算A，B链表的长度
        while (ANode.next != null) {
            ++countA;
            ANode = ANode.next;
        }
        while (BNode.next != null) {
            ++countB;
            BNode = BNode.next;
        }
        if (countB > countA) {
            int temp = countB - countA;
            while (temp > 0 && headB != null) {
                headB = headB.next;
                temp--;
            }
        } else {
            int temp = countA - countB;
            while (temp > 0 && headA != null) {
                headA = headA.next;
                temp--;
            }
        }


        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    /**解法二：
     * 定义两个指针，分别遍历这两个链表，当短的链表走到链尾时，长的链表还没走完，此时就是长度差,这样就不必求出具体的长度
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB){
        if (headA == null || headB == null) {
            return null;
        }
        ListNode ANode = headA;
        ListNode BNode = headB;
        while (ANode != null && BNode != null){
            ANode = ANode.next;
            BNode = BNode.next;
        }
        while (ANode != null){
            ANode = ANode.next;
            headA = headA.next;
        }
        while (BNode != null){
            BNode = BNode.next;
            headB = headB.next;
        }

        while (headA != null && headB != null){
            if (headA == headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
