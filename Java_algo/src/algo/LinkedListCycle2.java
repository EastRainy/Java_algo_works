package algo;

public class LinkedListCycle2 {

     /*
    //Using O(n) Space complexity solve

    public ListNode detectCycle(ListNode head) {
        
        int cnt = 0;
        HashSet<ListNode> h = new HashSet<>();
        ListNode crr = head;

        if(head==null){return null;}

        h.add(head);
        while(crr.next!=null){

            if(!h.contains(crr.next)){
                h.add(crr.next);
            }
            else{
                return crr.next;
            }

            crr = crr.next;
        }

        return null;

    }

     */
    //나중에 O(1) 공간복잡도 사용으로 풀 예정

    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    
}
