package LinkList.Simple;

/**
 * @author yzh
 * @Description: 相交链表 -- 判断两个链表是否相交
 * 思路：两个链表分别遍历，当倒数第二个节点仍然相同时，则两个链表相交.
 * @Date: created in 20:48 2018/10/20
 * @Version: 1.0
 */
public class IntersectList {

    public static void main(String[] args) {
        System.out.print(getIntersectionNode(createLinkList1(),createLinkList2()));
    }

    public static int getIntersectionNode(ListNode headA, ListNode headB) {
        headA = createLinkList1();
        headB = createLinkList2();
        int i=1,j=1;
        while (headA.next != null){
            i++;
            headA = headA.next;
        }
        while (headB.next != null){
            j++;
            headB = headB.next;
        }

        if (i<=j){
            int count = j-i;
            while (count>0){
                headB = headB.next;
                count--;
            }
            while (headA != headB && headA.next != null && headB.next != null){
                headA = headA.next;
                headB = headB.next;
            }
            if (headA.next != null && headB.next != null){
                return headA.data;
            }
        }else {
            int count = i-j;
            while (count>0){
                headA = headA.next;
                count--;
            }
            while (headA != headB && headA.next != null && headB.next != null){
                headA = headA.next;
                headB = headB.next;
            }
            if (headA.next != null && headB.next != null){
                return headA.data;
            }
        }
        return 0;
    }

    //创建第一个链表
    public static ListNode createLinkList1(){
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(5);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;
        return head;
    }
    //创建第二个链表
    public static ListNode createLinkList2(){
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(8);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(5);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;
        return head;
    }

    private static class ListNode {
        ListNode next;
        int data;

        public ListNode(int data) {
            this.data = data;
        }
    }
}
