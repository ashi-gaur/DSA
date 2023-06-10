/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        // while(head==head.next){
        //     head=head.next.next;
         
        // }
        ListNode slow=new ListNode();
        slow.next=head;
        ListNode fast=slow;
        while(head!=null){
            if(head.next!=null && head.val==head.next.val){
                while(head.next!=null && head.val==head.next.val){
                    head=head.next;
                }
                slow.next=head.next;
            }
            else{
                slow=slow.next;
            }
            head=head.next;
        }
        return fast.next;
    }
}
