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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev=null;
        ListNode current=head;
        ListNode Next=null;
        int size=0;
        int i=0;
        while(current!=null)
        {
            size++;
            current=current.next;
        }
        current=head; //current = head;
        if(size==1&&n==1)
        {
            return null;
        }
        else{
            if(n==0)
            {
                return head;
            }
        }
    if(n==1)
    {
        while(current.next.next!=null)
        {
            current=current.next;
        }
        current.next=null;
        return head;
    }
   
    else if(n==size)
    {
        return current.next;
    }
     else if (size==3)
    {
        current.next=current.next.next;
        return head;
    }
    else if(size==2&&n==1){
        current.next=null;
        return head;
    }
else{
    int k=0;
    current = head;

for( k = 1; k < size - n; k++)
{
    current = current.next;
}

current.next = current.next.next;
    return head;
}

    }
}
