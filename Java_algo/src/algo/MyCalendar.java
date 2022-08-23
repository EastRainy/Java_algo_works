package algo;

import java.util.TreeSet;

public class MyCalendar {
    
    TreeSet<int[]> ts;
    

    public MyCalendar() {

        ts = new TreeSet<int[]>((int[] a, int[] b)-> a[0]-b[0]);

        //TreeSet을 이용
        //TreeSet(compare => 해당 compare로 정렬되는 TreeSet)
        //==>자신에 대하여 바로 큰/작은 값을 floor, celling으로 추출 가능
    }
    
    public boolean book(int start, int end) {
        
        int[] input = new int[] {start, end};
        int[] floor = ts.floor(input), celling = ts.ceiling(input);

        //floor => input보다 start가 작은 값들 중 가장 큰 값
        //celling => input보다 start가 큰 값들 중 가장 작은 값
        
        if(floor!=null && start<floor[1]){//start가 floor의 end보다 작다면  이미 점유한 곳에 overbooking됨
            return false;
        }


        if(celling!=null && end>celling[0]){//end가 celling의 start보다 크다면 이미 점유한 곳에 overbooking됨
            return false;
        }
        
        //만약 어느것도 해당되지 않는다면 값을 넣고 true 리턴
        ts.add(input);
        return true;
    }

}
