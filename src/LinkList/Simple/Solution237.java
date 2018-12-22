package LinkList.Simple;

/** 删除链表中的节点
 * @author yzh
 * @Description: 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。
 *               现有一个链表 -- head = [4,5,1,9]，它可以表示为:
 *               4 -> 5 -> 1 -> 9
 *               示例 1:
 *               输入: head = [4,5,1,9], node = 5
 *               输出: [4,1,9]
 *               解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
 *
 *               示例 2:
 *               输入: head = [4,5,1,9], node = 1
 *               输出: [4,5,9]
 *               解释: 给定你链表中值为 1 的第三个节点，那么在调用了你的函数之后，该链表应变为 4 -> 5 -> 9.
 * @Date: created in 13:00 2018/12/21
 * @Version: 1.0
 */
public class Solution237 {
    /**
     * node是要删除的结点，用下一个结点的值替换当前要删除的结点的值，然后删除下一个结点，就相当于删除了当前结点
     * 比如输入: head = [4,5,1,9], node = 5 要删除5，可以用node的下一个结点的值(1)替换node，得 4->1->1->9,
     * 然后删除第二个1，得到4->1->9
     * @param node
     */
    public void deleteNode(ListNode node) {
        if(node.next != null){
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}
