package 链表;

/**
 * 206. 反转链表
 * https://leetcode-cn.com/problems/reverse-linked-list/
 * 2019/11/23 9:50 AM
 * @author :yd
 */
public class _206_反转链表 {
    //迭代
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        while (head !=null){
            //记录下下一个节点 因为下面要把当前节点指向前一个节点 不记录的话会得不到下一个节点
            ListNode temp = head.next;
            //核心 把当前的节点指向上一个节点
            head.next = pre;
            //head和pre都移动一位去迭代
            pre = head;
            head = temp;

        }
        return pre;
    }


    //递归
}
