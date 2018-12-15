package LinkList;

/**
 * @author yzh
 * @Description:
 * @Date: created in 19:56 2018/10/20
 * @Version: 1.0
 */
public class Partition {
    public static void main(String[] args) {
        ListNode partition = partition(createLinkList(), 3);
        printLinkList(partition);
    }

    private static void printLinkList(ListNode head){
        while (head.next != null){
            System.out.print(head.data + "-->");
            head = head.next;
        }
        System.out.print(head.data);
    }

    public static ListNode partition(ListNode head, int data){
        ListNode root = createLinkList();
        if (head == null || head.next == null){
            return head;
        }

        ListNode lessNode = new ListNode(-1);
        ListNode greaterNode = new ListNode(-1);
        ListNode cur1 = lessNode;
        ListNode cur2 = greaterNode;

        ListNode cur = head;
        while (cur != null){
            ListNode temp = new ListNode(cur.data);
            if (cur.data < data){
                cur1.next = temp;   //存储着比data小的节点
                cur1 = cur1.next;
            }else {
                cur2.next = temp;
                cur2 = cur2.next;   //存储着比data大的节点
            }
            cur = cur.next; //遍历原链表
        }
        cur1.next = greaterNode.next;
        return lessNode.next;
    }

    public static ListNode  createLinkList(){
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(2);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;
        return head;
    }

    static class ListNode{
        int data;   //节点值
        ListNode next; //下一个节点

        public ListNode(int data) {
            this.data = data;
        }
    }
}
