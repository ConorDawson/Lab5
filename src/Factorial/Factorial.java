package Factorial;// Recursive factorial method

public class Factorial {
   
   // Recursive definition of method factorial
   public static double factorial(int n )
   {      
      if ( n == 1 || n == 0 )  // base case
         return 1;
      else {
         int result1 = (int) factorial(n-1);
         int result = n * result1;
         return result;
      }




   }

   public static double myPow(double x, int y){
      double result =y;
      double k;
      for(int i =1; i<x; i++){

         k= result*y;
         result= k;
      }
      return result;
   }


}

