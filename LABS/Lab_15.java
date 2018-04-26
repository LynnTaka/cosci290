//Lynn Takahashi
//CoSci 290

/*

5.13 (Find the largest n such that n^3 < 12,000) Use a while loop to find the largest integer n such that n^3 is less than 12,000

*/

public class Lab_15{
public static void main(String[] args){
  
  int n = 0; //int starts at 0

  while(Math.pow(n + 1, 3) < 12000){
  
    n++; //increment n
  
  }
  
  System.out.println("The largest int n of n^3 that is less than 12,000 is " + n);
  
  }
}