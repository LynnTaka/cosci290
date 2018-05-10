//Lynn Takahashi
//CoSci

/*


Be sure to create a custom function that returns whether a number is even or odd.  

Create two new arrays, one called even and the other called odd, each of these arrays will have the array size of 
their respective counters from above.

Fill the odd array with the odd numbers and then fill the even array with even numbers. 
Then iterate through each array and output the values
*/


  //class
  public class Lab_19{
    //main method
    public static void main(String[] args){

      //array that's the length of 4
      int[] array1 = new int[4];
      //array that's the length of 4
      int[] array2 = new int[4];

      //int r will be random
      int r = 0;
      //count even
      int evenCount = 0;
      //count odd
      int oddCount = 0;

      //array that's length of odd count
      int[] oddArray;
      //array length of even count
      int[] evenArray;



      //array 1
      array1[0] = random(r);
      array1[1] = random(r);
      array1[2] = random(r);
      array1[3] = random(r);

      //array 2
      array2[0] = random(r);
      array2[1] = random(r);
      array2[2] = random(r);
      array2[3] = random(r);

      //print outs array1
      for(int i = 0; i < array1.length; i++){
        System.out.print(array1[i] + " ");

        //counts even and odd
        if(array1[i] % 2 == 0){
          evenCount++;
        }
        else{
          oddCount++;
        }
      }//end of for

      //space between the arrays
      System.out.println("\n");

      //print out array2
      for(int j = 0; j < array2.length; j++){
        System.out.print(array2[j] + " ");

        //counts even and odd
        if(array2[j] % 2 == 0){
          evenCount++;
        }
        else{
          oddCount++;
        }
      }//end of for

      //prints out number of even and odd numbers in the arrays
      System.out.println("\nNow here is an array filled with only even numbers with " + evenCount + " numbers, and \n"
                       + "an array with only odd numbers with " + oddCount + " numbers included.");

      //updated amount
      oddArray = new int[oddCount];
      evenArray = new int[evenCount];


      for(int y = 0; y < evenArray.length; y++){   
        int even = random (r) * 2; 
        System.out.print(even + " ");
      }

      //space between the arrays
      System.out.println("\n");

      for(int k = 0; k < oddArray.length; k++){
        int odd = random(r);
        if(random(r)%2 == 0){
          System.out.print(random(r) + 1 + " ");
        }
        else {
          System.out.print(random(r) + " ");
        }
      }


    }// end of main method


    //random integer generator from 1-10
    public static int random(int r){    
      r = 1 + (int)(Math.random() * ((10 - 1) + 1));
      return r;

    }


  }//end of class