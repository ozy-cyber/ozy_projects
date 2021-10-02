package codewars_problems;

public class AbbreviationsAlgorithm {

    public static void main(String[] args) {


        System.out.println(abbreviate("elephant-rides are really fun!"));

    }

    public static String abbreviate(String string) {

        String arrayStr[]= string.split("-|\\ ");

        String removedChars="";

        String abbreviation="";

        for (int i =0;i<arrayStr.length-1;i++){
            removedChars="";

            removedChars +=  String.valueOf(arrayStr[i].length()-2);

                String  str1[]= arrayStr[i].split("");


                abbreviation += str1[0]+""+removedChars+""+str1[str1.length-1]+" ";


        }

        return abbreviation;
    }
}
