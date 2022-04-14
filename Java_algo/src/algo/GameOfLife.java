package algo;

public class GameOfLife {

    //시간복잡도 : O(n) -> board의 갯수만큼만
    //공간복잡도 : O(n) -> memory 배열을 이용하므로 O(n)


    public void gameOfLife(int[][] board) {
        
        int ver = board.length, hor = board[0].length;
        
        int[][] memory = new int[ver][hor];
        
        for(int i=0; i<ver; i++){
            for(int j=0; j<hor;j++){
                memory[i][j] = calStatus(board, hor, ver, i,j);
                System.out.print(memory[i][j]+" ");
            }
            System.out.println();
        }
        
        for(int i=0; i<ver; i++){
            for(int j=0; j<hor; j++){
                
                if(board[i][j]==1){
                    switch(memory[i][j]){
                        case 2,3 : board[i][j] = 1; break;
                        default : board[i][j] = 0; break;
                    }
                }
                else{
                    switch(memory[i][j]){
                        case 3 : board[i][j] = 1; break;
                        default : board[i][j] = 0; break;
                    }
                }
            }
        }
    }
    int calStatus(int[][] board, int hor, int ver, int i, int j){
        
        int sum=0;
        
        for(int k=-1;k<2;k++){
            for(int l=-1; l<2; l++){
                if(!(k+i>=0) || !(k+i<ver)){
                    continue;
                }
                else if(!(l+j>=0) || !(l+j<hor)){
                    continue;
                }
                sum+=board[i+k][j+l];
            }
        }
        if(board[i][j]==1){
            sum--;
        }
        return sum;
    }

}
