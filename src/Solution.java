/**
 * Created by ravikant on 1/25/2017.
 */
import java.util.Collections;
import java.util.Arrays;
public class Solution {
    public static void main(String[] args){
        String str1 = "anagram";   // anagram
        String str2 = "nagaram";  //testcase anagramz
        System.out.println(" " +isAnagram(str1,str2));
    }

    public static String sort(String str){
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    private static boolean isAnagram(String str1, String str2) {
        if(str1.length() != str2.length()){
            return false;
        }
        else{

             str1 = sort(str1);
             str2 = sort(str2);
             int i=0;
             while(i<str1.length()){
                 if(str1.charAt(i) != str2.charAt(i))
                     return false;
                 i++;
             }
             return true;
        }
    }
}
