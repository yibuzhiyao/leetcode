package 链表;

/**
 * https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 * @author yudan
 * 2019-11-19
 */
public class _237_删除链表中的节点 {

    public void deleteNode(ListNode node) {
        //思路是将要删掉的节点的val和next替换为下一个节点的val和next
        //由于是单连表 如果是正常的删除需要遍历连表然后拿到这个节点的前一个节点 指向这个节点的后一个节点
        //比较麻烦 所以另辟蹊径
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
