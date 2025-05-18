package app;

import java.util.*;

public class sapt3 {
    //todo: 1913 Given an integer array nums, choose four distinct indices w, x, y,
    // and z such that the product difference between pairs
    // (nums[w], nums[x]) and (nums[y], nums[z]) is maximized.
    //
    //Return the maximum such product difference.

    public static int maxProductDifference(int[] nums) {
        int max1=nums[0];
        int max2=nums[1];
        int min1=nums[0];
        int min2=nums[1];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]*nums[j]>max1*max2){
                    max1=nums[i];
                    max2=nums[j];
                }
                if (nums[i] * nums[j] < min1 * min2) {

                    min1=nums[i];
                    min2=nums[j];
                }
            }

        }
        int rezultat=(max1*max2)-(min1*min2);
        return rezultat;

    }
    //todo: cmmdc

    public static int cmmdc(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;

        }
        return a;
    }
    public static int smallestEvenMultiple(int a, int b) {
        return (a * b) / cmmdc(a, b);
    }
    //todo 1281: diferenta dintre produsul si suma cifrelor
    public int subtractProductAndSum(int n) {
        int produs=1;
        int suma =0;

        while(n>0){
            int nr=n%10;
            produs*=nr;
            suma+=nr;
            n/=10;
        }
        return produs-suma;

    }

    //todo:1688
    public int numberOfMatches(int n) {
        int meciuri=0;
        while(n>0){
            if(n%2==1){
                meciuri+=(n-1)/2+1;
                n=(n-1)/2;

            }
            else if(n%2==0){
                meciuri+=n/2;
                n=n/2;


            }
        }
        return meciuri;

    }
    //todo:1588 suma subvectorilor de lungime impara
    public int sumOddLengthSubarrays(int[] arr) {
        int suma=0;
        for(int i=0;i< arr.length;i++){
            for(int j=i;j< arr.length;j++){
                if((j-i)%2!=0){
                    for(int k=i;k<=j;k++){
                        suma+=arr[k];
                    }
                }
            }
        }
        return suma;

    }

    public static boolean isPrime(int nr){
        if(nr<2){
            return false;
        }
        for(int i=2;i<=nr/2;i++){
            if(nr%i==0){
                return false;
            }
        }
        return true;
    }
    //todo 1684: numarul de cuvinte care au doar literele respective

    public static boolean contineCaracterul(char a,String cuvant){
        char[]caractere=new char[cuvant.length()];
        for(int i=0;i<cuvant.length();i++){
            caractere[i]=cuvant.charAt(i);
        }
        for(int i=0;i<caractere.length;i++){
            if(caractere[i]==a){
                return true;
            }
        }
        return false;

    }

    public static boolean auToateLitereleLaFel(String cuvant1,String cuvant2){
        for(int i=0;i<cuvant1.length();i++){
            if(!contineCaracterul(cuvant1.charAt(i),cuvant2)){
                return false;
            }
        }
        return true;


    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int contor=0;
        for(int i=0;i< words.length;i++){
            if(auToateLitereleLaFel(words[i],allowed)){
                contor++;

            }
        }
        return contor;

    }
    //todo 2000: reverse prefix of a word

    public static String reversePrefix(String word, char ch) {
        String cuvantnou="";
        int index=0;
        if(!word.contains(Character.toString(ch))){
            return null;
        }
        else{
             index=word.indexOf(ch);
             for(int i=index;i>=0;i--){
                 cuvantnou+=word.charAt(i);
             }
             for(int i=index+1;i<word.length();i++){
                 cuvantnou+=word.charAt(i);
             }
        }
        return cuvantnou;
    }
    //todo:442
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer>set=new HashSet<>();
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])) {
                if (!list.contains(nums[i])) {
                    list.add(nums[i]);
                }
                }
            }
        return list;

    }
    //todo 281: move zeroes

    public void moveZeroes(int[] nums) {
        int left=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]!=0){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
            }
        }

    }
    //todo 11: container with most water

    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxArea=0;
        while(left<=right){
            int width=right-left;
            int minHeight=Math.min(height[left],height[right]);
            int area=width*minHeight;
            maxArea=Math.max(area,maxArea);

            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;

    }
    //todo:167 two sum, array is sorted

    public int[] twoSum(int[] numbers, int target) {

        int l = 0;
        int r = numbers.length - 1;
        
        while (l < r) {
            int sum=numbers[l]+numbers[r];
            if (sum == target) {
                return new int[]{l + 1, r + 1};
            } else if (sum <= target) {
                l++;
            } else {
                r--;
            }


        }
        return new int[2];


    }
    //todo:2367 numbers of arithmetic triplets
    public int arithmeticTriplets(int[] nums, int diff) {
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                for(int k=j;k<nums.length;k++){
                    if(nums[j]-nums[i]==diff&&nums[k]-nums[j]==diff){
                        cnt++;
                    }
                }
            }
        }
        return cnt;

    }
    //todo:3194 minimum average of smallest and largest numbers

    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        List<Double> list = new ArrayList<>();
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int minElement = nums[l];
            int maxElement = nums[r];
            double average = (maxElement + minElement) / 2.0;
            list.add(average);
            l++;
            r--;
        }
        return Collections.min(list);


    }
    //todo:2465 : distinct averages
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        Set<Double> set = new HashSet<>();
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int minElement = nums[l];
            int maxElement = nums[r];
            double average = (maxElement + minElement) / 2.0;
            set.add(average);
            l++;
            r--;
        }
        return set.size();


    }
    //todo:2108 : primul cuvant palindrom din string

    public static boolean isPalindrome(String word){
        String newWord="";
        for(int i=word.length()-1;i>=0;i--){
            newWord+=word.charAt(i);
        }
        if(word.equals(newWord)){
            return true;
        }
        return false;
    }
    public String firstPalindrome(String[] words) {
        String searchedWord="";
        for(int i=0;i<words.length;i++){
            if(isPalindrome(words[i])){
                searchedWord=words[i];
                break;
            }
        }


return searchedWord;
    }
    //todo:557 : reverse word in a string 3

    public String reverseWords(String s) {
        String word="";
        String[]words=s.split(" ");
        for(int i=0;i<words.length-1;i++){
            word+=reverseWord(words[i]);
            if(i!=words.length-1){
                word+=" ";
            }
        }
        word+=reverseWord(words[words.length-1]);
        return word;


    }


    public String reverseWord(String word){
        String newWord="";
        for(int i=word.length()-1;i>=0;i--){
            newWord+=word.charAt(i);
        }
        return newWord;

    }
}
