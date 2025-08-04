package app;

//import java.util.Scanner;

import static app.Sapt1.*;
import static app.sapt2.*;
import static app.sapt3.*;
import static app.Sapt4.*;
public class Main {
    public static void main(String[] args) {
        int[]a={-5, 1, 5, 0, -7};

//        System.out.println(fact(6));
//       // Scanner scanner=new Scanner(System.in);
//        //int[]a=new int[5];
//        //for(int i=0;i<a.length;i++){
//          //  a[i]=scanner.nextInt();
//
//        //System.out.println(celMaiMare(a));
//
//        System.out.println(isPrime(12));
//        System.out.println(isPalindrome("racecar"));
//
//
//        int[]v={1,5,11,12,13,17};
//        System.out.println(sumaNrPrime(v));
        //suma2(12,13);

//        List<Integer>list=new ArrayList<>();
//        list.add(5);
//        list.add(4);
//        list.add(1000);

//        afisare(a);
//        System.out.println(numberOfEmployeesWhoMetTarget(a,1));
//        String[]cuvinte={"mere","pere","banane","plapuma"};
//        afisare2(cuvinte,'e');
//        int[][] matrice = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        System.out.println(maximumWealth(matrice));

       // afisareVector(a);
        //leftRightDifference(a);
        //afis(a);
        //containsDuplicate(a);
       // af(a);
       // System.out.println(truncateSentence("ana are mere si banane foarte multe",4));
        //System.out.println(missingNumber(a));
        //System.out.println(thirdMax(a));
        //System.out.println(findDisappearedNumbers(a));
        //System.out.println(scoreOfString("zaz"));

       // System.out.println(minOperations(a,5));
       // System.out.println(maxProductDifference(a));
        //System.out.println(reversePrefix("banana",'n'));
        //System.out.println(isPalindrome("racecar"));
       // System.out.println(cateCuvinte(""));

        String s = "code";
        int[] indices = {3, 1, 2, 0};

        String shuffled = restoreString(s, indices);
        System.out.println(shuffled);

        String[] words1 = {"pay","attention","practice","attend"};
        String pref1 = "at";
        System.out.println(prefixCount(words1, pref1));
        System.out.println(largestAltitude(a));
        String[] patterns = {"a","abc","bc","d"};
        String word = "abc";

        System.out.println(numOfStrings(patterns, word));



//






    }
}