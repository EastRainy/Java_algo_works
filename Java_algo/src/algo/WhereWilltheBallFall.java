package algo;

public class WhereWilltheBallFall {

    //위에서 공을 굴리면 막대기 사이로 마지막까지 도착한 위치, 혹은 불가능한지 여부를 푸는 문제
    
    public int[] findBall(int[][] grid) {
            
        int[] ans = new int[grid[0].length];
        
        for(int i=0; i<ans.length; i++){
            ans[i] = rFind(grid, i, 0, grid[0].length, grid.length);
        }
        
        return ans;
        
    }
    private int rFind(int[][] grid, int x, int y, int maxX, int maxY){
        
        
        if(y>=maxY){
            return x;
        }
        
        switch(grid[y][x]){
                
            case 1:
                if(x+1>maxX-1){
                    return -1;
                }
                else if(grid[y][x+1]==-1){
                    return -1;
                }
                else{
                    return rFind(grid, x+1, y+1, maxX, maxY);
                }
            case -1:
                if(x-1<0){
                    return -1;
                }
                else if(grid[y][x-1]==1){
                    return -1;
                }
                else{
                    return rFind(grid, x-1, y+1, maxX, maxY);
                }

            default:
                return -1;
        }
        
    }
}
