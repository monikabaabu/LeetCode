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
        HashSet<Integer> visited = new HashSet<>();
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null){
            if(visited.contains(curr.val)){
                prev.next = curr.next;
            }
            else{
                visited.add(curr.val);
                prev = curr;
            }
            curr=curr.next;
        }
        return head;
    }
}