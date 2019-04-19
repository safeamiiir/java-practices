package new3;

import java.util.*;
public class newClass {

  public static void main(String[] args) {
    int m;
    Scanner input = new Scanner(System.in);
    
    m=input.nextInt();
    int[][] mat= new int [m][m];
    boolean [][] matStar =new boolean[m][m];
    
    for(int i=0;i<m;i++)
    {
      int j=0;
      String temp=input.next();
      while(j<m)
      {
        if(Integer.valueOf(temp.toCharArray()[j])==49){mat[i][j]=1;}
        else{mat[i][j]=0;}
        j++;
      }
    }
    
    
    int finalInt=0;
    
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<m;j++)
      {
        int temp=0;
        if(mat[i][j]==1 && matStar[i][j]==false){temp=neighborFinder(mat, matStar, i, j,m);}
        if(finalInt<temp){finalInt=temp;}
      }
      
    }
    
    System.out.println(finalInt);
  }
  
  
  
  public static int neighborFinder(int mat[][],boolean matStar[][],int i,int j,int m)
  {
    matStar[i][j]=true;
    int finalInt=1;
    
    if(i-1>0 && j-1>0 && mat[i-1][j-1]==1 && matStar[i-1][j-1]==false){finalInt+=neighborFinder(mat, matStar, i-1, j-1,m);}
    if(j-1>0 && mat[i][j-1]==1   && matStar[i][j-1]==false)        {finalInt+=neighborFinder(mat, matStar, i, j-1,m);}
    if(i+1<m && j-1>0 && mat[i+1][j-1]==1 && matStar[i+1][j-1]==false){finalInt+=neighborFinder(mat, matStar, i+1, j-1,m);}
    if(i-1>0 && mat[i-1][j]==1   && matStar[i-1][j]==false)           {finalInt+=neighborFinder(mat, matStar, i-1, j,m);}
    if(i+1<m && mat[i+1][j]==1   && matStar[i+1][j]==false)           {finalInt+=neighborFinder(mat, matStar, i+1, j,m);}
    if(i-1>0 && j+1<m && mat[i-1][j+1]==1 && matStar[i-1][j+1]==false){finalInt+=neighborFinder(mat, matStar, i-1, j+1,m);}
    if(j+1<m && mat[i][j+1]==1   && matStar[i][j+1]==false)           {finalInt+=neighborFinder(mat, matStar, i, j+1,m);}
    if(i+1<m && j+1<m && mat[i+1][j+1]==1 && matStar[i+1][j+1]==false){finalInt+=neighborFinder(mat, matStar, i+1, j+1,m);}
    
    return finalInt;
  }

}