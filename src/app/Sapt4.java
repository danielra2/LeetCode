package app;

public class Sapt4 {

    //You are given a string s and an integer array indices of the same length.
    // The string s will be shuffled such that the
    // character at the ith position moves to indices[i] in the shuffled string.
    public static String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];
        for (int i=0; i< s.length(); i++) {
            result[indices[i]]=s.charAt(i);
        }

        return new String(result);
    }


    //You are given an array of strings words and a string pref.
    //
    //Return the number of strings in words that contain pref as a prefix.
    //
    //A prefix of a string s is any leading contiguous substring of s.

    public static int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String word:words) {
            if (word.startsWith(pref)) {
                count++;
            }
        }
        return count;
    }

    //Input: gain = [-5,1,5,0,-7]
    //Output: 1
    //Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.


    public static int largestAltitude(int[] gain) {
        int max = 0;
        int current = 0;

        for (int i =0;i<gain.length;i++) {
            current+=gain[i];
            if (current>max) {
                max=current;
            }
        }

        return max;
    }
    //Given an array of strings patterns and a string word,
    // return the number of strings in patterns that exist as a substring in word.
    //
    //A substring is a contiguous sequence of characters within a string.
    public static int numOfStrings(String[] patterns, String word) {
        int count = 0;

        for (int i=0; i<patterns.length; i++) {
            if (word.contains(patterns[i])) {
                count++;
            }
        }

        return count;
    }
}
