package seri2Problem3;

import java.util.*;
public class island {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int m = scanner.nextInt();
    int[][] matrix = new int [m][m];
    boolean [][] matrixrixSeen = new boolean[m][m];
    
    for(int i=0;i<m;i++)
    {
      int j = 0;
      String tmp = scanner.next();
      while(j < m)
      {
        if(Integer.valueOf(tmp.toCharArray()[j]) == 49)
        	matrix[i][j] = 1;
        else
        	matrix[i][j] = 0;
        j++;
      }
    }
    
    
    int score = 0;
    
    for(int i=0; i<m; i++)
    {
      for(int j=0; j<m; j++)
      {
        int tmp = 0;
        if(matrix[i][j]==1 && matrixrixSeen[i][j]==false){
        	tmp = neighborFinder(matrix, matrixrixSeen, i, j,m);
        }
        if(score < tmp)
        	score = tmp;
      }
      
    }
    
    System.out.println(score);
  }
  
  
  
  public static int neighborFinder(int matrix[][],boolean matrixrixSeen[][],int i,int j,int m)
  {
    matrixrixSeen[i][j] = true;
    int score = 1;
    
    if(i-1>0 && j-1>0 && matrix[i-1][j-1]==1 && matrixrixSeen[i-1][j-1]==false){
    	score += neighborFinder(matrix, matrixrixSeen, i-1, j-1,m);
    	}
    if(j-1>0 && matrix[i][j-1]==1   && matrixrixSeen[i][j-1]==false){
    	score += neighborFinder(matrix, matrixrixSeen, i, j-1,m);
    }
    if(i+1<m && j-1>0 && matrix[i+1][j-1]==1 && matrixrixSeen[i+1][j-1]==false){
    	score += neighborFinder(matrix, matrixrixSeen, i+1, j-1,m);
    }
    if(i-1>0 && matrix[i-1][j]==1   && matrixrixSeen[i-1][j]==false){
    	score += neighborFinder(matrix, matrixrixSeen, i-1, j,m);
    }
    if(i+1<m && matrix[i+1][j]==1   && matrixrixSeen[i+1][j]==false){
    	score += neighborFinder(matrix, matrixrixSeen, i+1, j,m);
    }
    if(i-1>0 && j+1<m && matrix[i-1][j+1]==1 && matrixrixSeen[i-1][j+1]==false){
    	score += neighborFinder(matrix, matrixrixSeen, i-1, j+1,m);
    }
    if(j+1<m && matrix[i][j+1]==1   && matrixrixSeen[i][j+1]==false){
    	score  +=  neighborFinder(matrix, matrixrixSeen, i, j+1,m);
    }
    if(i+1<m && j+1<m && matrix[i+1][j+1]==1 && matrixrixSeen[i+1][j+1]==false){
    	score  +=  neighborFinder(matrix, matrixrixSeen, i+1, j+1,m);
    }
    
    return score;
  }

}