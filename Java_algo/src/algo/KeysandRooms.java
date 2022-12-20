package algo;

import java.util.List;
import java.util.Iterator;


public class KeysandRooms {

    /*
     * 방 안에 다른방에 들어갈 수 있는 열쇠가 있다 => 이를 이용하여 다른 모든 방을 순회 가능한가?
     * 이미 들어간 방인지 판단하는 roomVisited를 이용, 들어간 방에 있는 열쇠가 있는 방을 체크
     * 이미 들어갔던 방이면 그대로 리턴, 처음 들어가는 방이면 체크 후 안의 열쇠로 다시 순회
     */
    
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        int[] roomVisited = new int[rooms.size()];
        
        roomCheck(rooms, roomVisited, 0);


        for(int i=0; i<roomVisited.length; i++){
            if(roomVisited[i] != 1) return false;
        }
        return true;

    }
    public void roomCheck(List<List<Integer>> rooms, int[] roomVisited, int index){

        if(roomVisited[index]!=0) return;
        
        List<Integer> crrRoom = rooms.get(index);
        roomVisited[index] = 1;

        Iterator<Integer> it = crrRoom.iterator();

        while(it.hasNext()){
            Integer x = it.next();
            roomCheck(rooms, roomVisited, x.intValue());
        }
        return;
    }

}
