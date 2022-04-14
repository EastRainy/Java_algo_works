package algo;

import java.util.Arrays;

public class Main{
    
    public static void main(String[] args){

      int[][] board = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};

      new GameOfLife().gameOfLife(board);

      for(int i=0; i<board.length;i++){
          System.out.println(Arrays.toString(board[i]));
      }
    }

}
