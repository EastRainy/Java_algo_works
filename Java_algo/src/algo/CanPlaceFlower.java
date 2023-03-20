package algo;

public class CanPlaceFlower{

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        //꽃을 심을 수 있는 화분은 양 옆이 0인 가운데 0 화분, 혹은 한쪽이 0인 양 끝
        int cnt=0;
        if(n==0) return true;
        if(flowerbed.length == 1){

            cnt = flowerbed[0]==0?1:0;

            if(cnt>=n) return true;
            else return false;
        }

        for(int i=0; i<flowerbed.length; i++){
            if(i==0){
                if(flowerbed[i]==0){
                    if(flowerbed[i+1]==0){
                        flowerbed[i] = 2;
                        cnt++;
                    }
                }
            }
            else if (i==flowerbed.length-1){
                if(flowerbed[i]==0){
                    if(flowerbed[i-1]==0){
                        flowerbed[i] = 2;
                        cnt++;
                    }
                }
            }
            else{
                if(flowerbed[i]==0){
                    if(flowerbed[i-1]==0 && flowerbed[i+1]==0){
                        flowerbed[i] = 2;
                        cnt++;
                    }
                }
            }
        }

        if(cnt>=n) return true;
        else return false;

    }
}