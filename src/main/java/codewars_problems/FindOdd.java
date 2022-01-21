package codewars_problems;

public class FindOdd {


    public static void main(String[] args) {

        int a[] = new int[]{1,2,3,3,4,4,5,5,5};

        System.out.println(findIt(a));

    }

    public static int findIt(int[] a) {

        int odd=0;

        int counter =0;

        for (int i =0;i<a.length-1;i++)
        {
            for (int k=a.length;k+1>0;k--){

                if(a[i]==a[k]){
                    counter++;
                }
                if(counter%2!=0){

                    odd = a[i];

                }
            }

        }
        return odd;
    }
}
