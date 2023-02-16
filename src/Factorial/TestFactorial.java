package Factorial;

public class TestFactorial {
    public static void main(String[] args) {
        int base = 2, power = 9;
        int result = myPowrecursive(base, power);//Expected 512
        System.out.println(result);



        String word= "Hello!";
        String word1 = wordReverse(word);
        System.out.println(word1);//!elloH

        String



        int ArrayofNums[]= {1,2,3,4,5,6,7};

       // int arraySum


    }


    public static int myPowrecursive(int base, int power) {
        if (power != 0) {
            return (base * myPowrecursive(base, power - 1));
        } else return 1;
    }


    public static String wordReverse(String word){
        if (word.length() >0){
        return wordReverse(word.substring(1))+ word.charAt(0);
    }
        return "";

    }


    public static int arraySum(int ArrayofNum){


        return 1;
    }
}











