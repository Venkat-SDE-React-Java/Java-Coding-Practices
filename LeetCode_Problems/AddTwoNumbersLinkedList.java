///**
// * Definition for singly-linked list.
// * public class ListNode {
// * int val;
// * ListNode next;
// * ListNode() {}
// * ListNode(int val) { this.val = val; }
// * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// * }
// */
//class Solution {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//
//        ListNode resultNode = null;
//        ListNode currentNode = null;
//
//        int carry = 0;
//
//        while(l1 != null || l2 != null) {
//
//            int sum = carry;
//
//            if(l1 != null){
//                sum = sum + l1.val;
//                l1 = l1.next;
//            }
//
//            if(l2 != null){
//                sum = sum + l2.val;
//                l2 = l2.next;
//            }
//
//            carry = sum / 10;
//            sum = sum % 10;
//
//            if (resultNode == null) {
//                resultNode = new ListNode(sum);
//                currentNode = resultNode;
//            } else {
//                currentNode.next = new ListNode(sum);
//                currentNode = currentNode.next;
//            }
//        }
//
//        if(carry == 1) {
//            currentNode.next = new ListNode(1);
//        }
//
//        return resultNode;
//    }
//}
