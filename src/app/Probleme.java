package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Probleme {

    public List<Boolean>kidsWithCandies(int[]vector,int n){
        int max=-1;
        for(int i=0;i<vector.length;i++){
            if(vector[i]>max){
                max=vector[i];
            }
        }
        List<Boolean>lista=new ArrayList<>();
        for(int i=0;i<vector.length;i++){
            if(vector[i]+n>=max){
                lista.add(true);
            }
            else{
                lista.add(false);
            }
        }
        return lista;
    }



    public static int[] transformArray(int[] nums) {
        int []vector=new int[nums.length];
        int index=0;
        while(index<nums.length){
            if(nums[index]%2==0){
                vector[index]=0;
            }
            else{
                vector[index]=1;
            }
            index++;
        }

        for(int i=0;i<vector.length;i++){
            for(int j=0;j<vector.length-i-1;j++){
                if(vector[j]>vector[j+1]){
                    int temp=vector[j+1];
                    vector[j+1]=vector[j];
                    vector[j]=temp;
                }
            }
        }
        return vector;

    }


    public static void afisare(int[]a){
        int[]v=transformArray(a);
        for(int i=0;i<v.length;i++){
            System.out.print(v[i]+" " );
        }
    }



    public int minimumOperations(int[]n){
        int contor=0;
        for(int i=0;i<n.length;i++){
            if(n[i]%3!=0){
                contor++;
            }
        }
        return contor;

    }



    public static int numberOfEmployeesWhoMetTarget(int[]ore, int target){
        int nr = 0;
        for(int i = 0;i < ore.length; i++){
            if(ore[i]>=target)
                nr++;
        }
        return nr;
    }



    public static boolean contineLitera(String cuvant, char x){
        for(int i=0;i<cuvant.length();i++){
            if(cuvant.charAt(i)==x){
                return true;
            }
        }
        return false;
    }
    public static List<Integer>findWordsContaining(String[] words, char x){
        List<Integer>lista=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(contineLitera(words[i],x)){
                lista.add(i);
            }

        }
        return lista;

    }
    public static void afisare2(String[]cuvinte,char x){
        List<Integer>lista=findWordsContaining(cuvinte,x);
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i));
        }
    }



    public static int maximumWealth(int[][] accounts) {
        int max=-1;
        for(int i=0;i<accounts.length;i++){
            int suma=0;
            for (int j=0;j<accounts[i].length;j++){
                suma+=accounts[i][j];
                if(suma>max){
                    max=suma;
                }
            }
        }
        return max;
    }

    //todo:  1929.  Concatenation of array

    public static int[] getConcatenation(int[] nums) {
        int[]vector=new int[nums.length*2];
        int pos=0;
        for(int i=0;i<nums.length;i++){
            vector[pos]=nums[i];
            pos++;
        }
        for(int i=0;i<nums.length;i++){
            vector[pos]=nums[i];
            pos++;
        }
        return vector;
    }

    public static void afisareVector(int[]a){
        int[]vector=getConcatenation(a);
        for(int i=0;i<vector.length;i++){
            System.out.println(vector[i]);
        }
    }

    //todo:1920. build array from permutation

    public static int[] buildArray(int[] nums) {

        int[]vector=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=vector[vector[i]];
        }
        return nums;

    }

    //todo: 1512 number of good pairs

    public static int numIdenticalPairs(int[] nums) {

        int contor=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    contor++;
                }
            }
        }
        return contor;

    }

    //todo: shuffle the array

    public int[] shuffle(int[] nums, int n) {

        int[]vector=new int[nums.length];

        for(int i=0;i<n;i++){
            vector[2*i]=nums[i];
            vector[2*i+n]=nums[i+3];

        }
        return vector;


    }

    //todo:3289. the two sneaky numbers

    public int[] getSneakyNumbers(int[] nums) {
        int n=nums.length/2;
        int[]vector=new int[2];
        int[]frecvente=new int[n+1];
        int index=0;
        for(int i=0;i<nums.length;i++){
            frecvente[nums[i]]++;
            if(frecvente[i]==2){
                vector[index]=nums[i];
                index++;
            }
        }
        return vector;

    }
    //TODO:2824. Count pairs whose sum is less than target

    public int countPairs(List<Integer> nums, int target) {
        int perechi =0;
        for(int i=0;i<nums.size();i++){
            for(int j=0;j<nums.size();j++){
                if(nums.get(i)==nums.get(j)&&i<j){
                    perechi++;
                }
            }
        }
        return perechi;

    }
    //todo:2574:left and right sub diferences

    public static int sumaIntre2Indecsi(int[]a,int pos1,int pos2){
        int suma=0;
        if(pos1>pos2){
            return 0;
        }
        for(int i=pos1;i<=pos2;i++){
            suma+=a[i];
        }
        return suma;
    }
    public static int[] leftRightDifference(int[] nums) {
        int[]leftSum=new int[nums.length];
        int[]rightSum=new int[nums.length];
        int[]rezultat=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int sumaStanga=sumaIntre2Indecsi(nums,0,i-1);
            int sumaDreapta=sumaIntre2Indecsi(nums,i+1,nums.length-1);
            leftSum[i]=sumaStanga;
            rightSum[i]=sumaDreapta;
            rezultat[i]=Math.abs(leftSum[i]-rightSum[i]);
        }
        return rezultat;

    }
    //todo:1365:how many numbers are smaller than the current number

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[]vector=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int cnt=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    cnt++;
                }
            }
            vector[i]=cnt;
            }
        return vector;
        }
        public static void afis(int[]a){
        int[]vec=smallerNumbersThanCurrent(a);
        for(int i=0;i<vec.length;i++){
            System.out.println(vec[i]);
        }
        }


        //todo:1480: running sum of 1d array


    public int[] runningSum(int[] nums) {
        int[]rezultat=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            rezultat[i]=sum;

        }
        return rezultat;

    }

    //todo:2114:maximum words found in sentences

    public int cateCuvinteInPropozitie(String prop){
        String[]cuvinte=prop.split(" ");
        return cuvinte.length;
    }
    public int mostWordsFound(String[] sentences) {
        int max=-1;
        for(int i=0;i<sentences.length;i++){
            int cuvinte=cateCuvinteInPropozitie(sentences[i]);
            if(cuvinte>max){
                max=cuvinte;
            }

        }
        return max;









    }
//todo:217. contains duplicate

    public static boolean containsDuplicate(int[] nums) {

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;

    }

    //todo:1389 create array in the given order

    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> numere=new ArrayList<>();
        int[]target=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            numere.add(index[i],nums[i]);
        }
        for(int i=0;i<numere.size();i++){
            target[i]=numere.get(i);
        }
        return target;

    }
    //todo:3427:sum of variable length subarrays

    public int subarraySum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int start=0;
            if(i-nums[i]>0){
                start=i-nums[i];
            }
            for(int j=start;j<=i;j++){
                sum+=nums[j];

            }
        }
        return sum;

    }

    //todo:1313: decompress run-length encoded list

    public static int[] decompressRLElist(int[] nums) {
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i+=2){
            int freq=nums[i];
            int val=nums[i+1];
            list.addAll(Collections.nCopies(freq,val));
        }
        int[]a=new int[list.size()];
        for(int i=0;i<list.size();i++){
            a[i]=list.get(i);

        }
        return a;
    }

    public static void af(int[]nums){
        int[]v=decompressRLElist(nums);
        for(int i=0;i<v.length;i++){
            System.out.println(v[i]);
        }
    }

    //todo:1816: truncate sentence

    public static String truncateSentence(String s, int k) {
        String[]cuvinte=s.split(" ");

        String prop="";
        for(int i=0;i<k-1;i++){
            prop+=cuvinte[i]+' ';
        }
        prop+=k-1;
        return prop;


    }

    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[]numere=new int[nums.length];
        List<Integer>list=new ArrayList<>();
        for(int i=1;i<nums.length;i+=2){
                list.add(nums[i]);
                list.add(nums[i-1]);
        }
        for(int i=0;i<list.size();i++){
            numere[i]=list.get(i);
        }
        return numere;

    }

    //todo:268. Misiing number

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return -1;

    }







    }



