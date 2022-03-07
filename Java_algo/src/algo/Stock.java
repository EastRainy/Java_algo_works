package algo;


public class Stock {

    /* 자기 가격보다 떨어지지 않을 때 까지 걸린 시간 문제*/

    
    public static void Stock() {
        

        int[] prices = {1, 2, 3, 2, 3};
        int[] answer = new int[prices.length];
       
        int cnt=0;
        for(int i=0; i<prices.length; i++){

            cnt=0;

            if(i==prices.length-1){
                answer[i] = cnt;
                break;
            }

            for(int j=i+1; j<prices.length;j++){
                cnt++;
                if(prices[j]-prices[i]<0){
                    break;
                }
            }
            answer[i] = cnt;
        }

        for(int i=0; i<answer.length;i++){
            System.out.print(answer[i]+ " ");
        }
    }
}
