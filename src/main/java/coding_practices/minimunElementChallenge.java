package coding_practices;

import java.util.Scanner;

public class minimunElementChallenge {

    public static void main(String[] args) {


        System.out.println("Enter The 6 number of integers: ");

        System.out.println(finMin(readIntegers(6)));


    }
    public static int []readIntegers(int count){

        Scanner input = new Scanner(System.in);

        int array[]=new int[count];

        for (int index=0;index<array.length;index++){

           array[index] = input.nextInt();

        }
        return array ;
    }


    static int  finMin(int array[]){
        int min =array[0];

        for (int i=0;i<array.length;i++){

            if (array[i]<min){

                min = array[i];

            }
        }
        return  min;
    }




}
