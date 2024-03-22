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
    public boolean isPalindrome(ListNode head) {
      if(head==null && head.next==null){
          return true;
      } 
      ListNode slow=head;
      ListNode fast=head;

      while(fast!=null && fast.next!=null){
          slow=slow.next;
          fast=fast.next.next;
      }

      ListNode reversedList=reverse(slow);

      while(reversedList!=null){
          if(head.val!=reversedList.val){
              return false;
          }
          head=head.next;
          reversedList=reversedList.next;
      }
      return true;
    }

    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode temp=head;

        while(temp!=null){
            ListNode newNode=temp.next;
            temp.next=prev;
            prev=temp;
            temp=newNode;
        }

        return prev;
    }
}