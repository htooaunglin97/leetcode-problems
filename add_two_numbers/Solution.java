public class Solution {
   
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      int carrier = 0;
      ListNode dummy = new ListNode(0);
      ListNode current = dummy;
      while (l1 != null || l2 != null || carrier != 0) {
        int x = (l1 != null) ? l1.val : 0;
        int y = (l2 != null) ? l2.val : 0;

        int sum = x + y + carrier;
        carrier = sum / 10;

        current.next = new ListNode(sum % 10);
        current = current.next;

        if (l1 != null) {
            l1 = l1.next;
        }

        if (l2 != null) {
            l2 = l2.next;
        } 
        
      }
      return dummy.next;
    }


    void main() {
        IO.println(addTwoNumbers(new ListNode(2, new ListNode(4, new ListNode(3))), new ListNode(5, new ListNode(6, new ListNode(4)))));
    }
}

class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            ListNode current = this;
            while (current != null) {
                sb.append(current.val);
                if (current.next != null) {
                    sb.append(" -> ");
                }
                current = current.next;
            }
            return sb.toString();
        }
        
 }
