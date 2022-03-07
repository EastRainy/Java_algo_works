package algo;

import java.util.ArrayList;
import java.util.HashMap;

/*
카카오톡 오픈채팅방 문제

닉네임을 바꿀때 1. 새로 들어와서 바꾸는 경우 2. 안에서 바꾸는 경우

결국 최종적으로 보여지는 채팅창의 모습을 스트링으로 출력하므로

UID/닉네임 해시로 관리하면서 최종출력시 기록된 UID를 닉네임으로 replace하는 방식으로 해결함

*/
class Openchat{


    public static void Openchat() {
        
        String[] recode = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        ArrayList<String> pre_ans = new ArrayList<String>();
        String[] answer;
     
        HashMap<String, String> userData = new HashMap<String, String>();

        for(int i=0; i<recode.length; i++){
            String[] parse = recode[i].split(" ");

            if(parse[0].equals("Enter")){
                enter(parse[1],parse[2],userData,pre_ans);
            }
            else if(parse[0].equals("Leave")){
                leave(parse[1],userData,pre_ans);
            }
            else if(parse[0].equals("Change")){
                change(parse[1], parse[2], userData, pre_ans);
            }
        }      
        System.out.println(pre_ans.toString());
        answer = pre_ans.toArray(new String[pre_ans.size()]);
             
        for(int i=0; i<answer.length;i++){
           String id = (answer[i].split("님"))[0];
           answer[i] = answer[i].replace(id, userData.get(id));
           System.out.println(answer[i]);
        }
    }
    static void enter(String uid, String nickname, HashMap<String,String> userData, ArrayList<String> pre_ans){

        if(userData.get(uid)==null){
            userData.put(uid, nickname);
        }
        else{
            userData.replace(uid, nickname);
        }
        pre_ans.add(uid+"님이 들어왔습니다.");
    }
    static void leave(String uid, HashMap<String,String> userData, ArrayList<String> pre_ans){
        pre_ans.add(uid+"님이 나갔습니다.");
    }
    static void change(String uid, String nickname, HashMap<String,String> userData, ArrayList<String> pre_ans){
        userData.replace(uid, nickname);
    }

}