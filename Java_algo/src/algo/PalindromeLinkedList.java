package algo;

public class PalindromeLinkedList {

    private class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    ListNode front;
    public boolean isPalindrome(ListNode head) {
        
        front = head;
        return checkNode(head);

    }
    boolean checkNode(ListNode crr){

        if(crr==null){return true;}
        boolean checkIn = checkNode(crr.next);
        boolean isEq = (crr.val==front.val)?true:false;

        front = front.next;
        return checkIn && isEq;

    }
}

/*
 * Time O(n), Space O(n) - recursion
 * 재귀를 이용해서 문제 해결 => Space O(1)를 위해서는 다른 방법이 필요함
 * 
 * 전역변수 front 및 재귀로 끝까지 이동하여 둘을 비교하면서 List를 비교
 */