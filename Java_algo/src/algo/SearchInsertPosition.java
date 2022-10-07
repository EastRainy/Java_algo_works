package algo;

public class SearchInsertPosition {
    
    public int searchInsert(int[] nums, int target) {
        
        //어떤 원소가 주어졌을 때 오름차순 정렬 된 배열에서 들어갈 인덱스 구하기
        //Binary Search 사용
        //(문제 조건상으로 Complexity O(logN)으로 구현하라 하였으니 당연히 한번순회하는 풀이(O(n))는 안됨)
        
        int front = 0, end = nums.length-1, x;
        while(front<=end){
            x = front+(end-front)/2;
            if(nums[x]==target){
                return x;
            }
            else if(nums[x]>target){
                end = x-1;
            }
            else{
                front = x+1;
            }
        }
        return front;
    }
    
}
