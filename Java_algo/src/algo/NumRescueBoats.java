package algo;

import java.util.Arrays;

public class NumRescueBoats {

    public int numRescueBoats(int[] people, int limit) {
        
        //만약 for문을 이용해 모든 케이스를 단순히 찾는다면 시간복잡도는 O(n^2)이 될 것
        //(최악의 경우 n번 배를 태울동안 n번 찾기 반복)
        
        //그러나 크기순으로 배열을 정렬하여 원소를 제외해 나가면 시간복잡도는
        //O(nlogn) -> 최악의 경우 정렬할때 걸리는 시간, 순회는 1번만
        
        //따라서 배열을 정렬 후 조건을 정해 배 수를 세는것이 좋다
        
        int ans = 0, tmp;


        Arrays.sort(people);

        
        for(int i=0, j=people.length-1;i<=j; j--, ans++){

            tmp = people[j];
            if(tmp+people[i]<=limit && i!=j){
                tmp +=people[i];
                i++;
            }

        }

        return ans;
    }

    
}
