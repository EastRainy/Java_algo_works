package algo;

import java.util.Stack;

class BasballGame{

    public int calPoints(String[] ops) {
        
        Stack<Integer> st = new Stack<Integer>();
        int tmp, tmp2;

        for(int i=0; i<ops.length; i++){
            tmp=0;
            switch(ops[i].charAt(0)){

                case '+':
                    tmp += st.pop();
                    tmp2 = st.peek();
                    st.add(tmp);
                    st.add(tmp+tmp2);
                    break;
                case 'D':
                    tmp = st.peek()*2;
                    st.add(tmp);
                    break;
                case 'C':
                    st.pop();
                    break;
                default:
                    try{
                        tmp = Integer.parseInt(ops[i]);
                        st.add(tmp);
                    }
                    catch(NumberFormatException e){
                        continue;
                    }
                    break;
            }
            System.out.println(tmp);
        }
        tmp = 0;
        while(!st.isEmpty()){
            tmp+=st.pop();
        }
        return tmp;
        
    }

}