package algo;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int[] cnum1 = new int[m];
        int i=0, p1=0, p2=0;
                
        for(i=0; i<m;i++){
            cnum1[i] = nums1[i];
        }
        
        i=0;
        while(p1<m && p2<n){
            if(cnum1[p1]<=nums2[p2]){
                nums1[i]=cnum1[p1];
                i++;
                p1++;
            }else{
                nums1[i] = nums2[p2];
                i++;
                p2++;
            }
        }
        
        if(i<m+n){
            if(p1<m){
                while(p1<m){
                    nums1[i]=cnum1[p1];
                    i++;
                    p1++;
                }
            }
            else if(p2<n){
                while(p2<n){
                    nums1[i] = nums2[p2];
                    i++;
                    p2++;
                }
            }
        }    
    }
}
