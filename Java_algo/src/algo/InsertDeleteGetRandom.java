package algo;

import java.util.ArrayList;
import java.util.HashMap;



public class InsertDeleteGetRandom {
    
    HashMap<Integer, Integer> map;
    ArrayList<Integer> list;
    java.util.Random rand = new java.util.Random ();
    public InsertDeleteGetRandom() {

        map = new HashMap<Integer, Integer>();
        list = new ArrayList<Integer>();

    }
    
    public boolean insert(int val) {

        if(map.containsKey(val)) return false;

        map.put(val, list.size());
        list.add(val);
        return true;

    }
    
    public boolean remove(int val) {
        
        if(!map.containsKey(val)) return false;


        int targetIdx = map.get(val);
        if(targetIdx != list.size()){
            list.set(targetIdx, list.get(list.size()-1));
            map.put(list.get(targetIdx), targetIdx);
        }
        map.remove(val);
        list.remove(list.size()-1);


        return true;

    }
    
    public int getRandom() {
        
        return list.get(rand.nextInt(list.size()));


    }
    
}
/*
 * Set을 구현하여 되도록 모든 기능이 평균 O(1) time complexity로 작동되게 구현하는 문제
 * 
 * 1. 초기화 2. 삽입 3. 삭제 4. 원소중 랜덤하게 하나 반환
 * (이때 랜덤추출은 모든 원소에서 동일 확률이여야 함)
 * 
 * HashMap -> O(1)시간에 원소에 접근 가능하도록 (val,index)로 데이터 저장
 * ArrayList -> 실제 val값 저장 장소
 * 
 * 풀때 생긴 문제 : 다른 부분은 쉬웠으나 remove쪽에 문제가 있었다. 
 * 
 * 단순히 HashMap, ArrayList의 데이터를 삭제하기만 하면 ArrayList의 index 변경으로 오류 발생 => Hashtable의 index값이 최신화가 필요
 * 이때 전체 갱신은 O(n)이기 떄문에 조건상 불가능 => 먼저 삭제원소를 찾고 맨 뒤와 위치 교체한 후 hashtable 두 값 swap, 이후 맨 뒤 삭제하는 방법으로 변경(O(1)방법)
 * 
 */