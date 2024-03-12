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
    public ListNode removeZeroSumSublists(ListNode head) {
        HashMap<Integer,ListNode> mp =new HashMap<>();
        int sum=0;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        for(ListNode temp=dummy;temp!=null ;temp=temp.next){
            sum+=temp.val;
            mp.put(sum, temp);
        }
        
        sum=0;
        
       
        for(ListNode temp=dummy;temp!=null ;temp=temp.next){
            
            sum+=temp.val;
            
            temp.next=mp.get(sum).next;
        }
        return dummy.next;
    }
}