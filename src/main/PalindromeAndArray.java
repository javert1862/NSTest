package main;

import java.util.Arrays;

public class PalindromeAndArray {

    /**
     * Takes array and places all zeroes to the end.
     * Sequence of non-zero elements stays the same.
     * Complexity is O(n)
     * @param numbersArray the array to be sorted
     * @return the sorted array
     */
    public static int[] placeZeroesToEnd(int[] numbersArray) {
        int[] newArray = Arrays.stream(numbersArray).filter(num -> num != 0).toArray();
        return Arrays.copyOf(newArray,numbersArray.length);
    }

    /**
     * Checks if word is palindrome
     * Complexity is O(n)
     * @param text word to check
     * @return true if word is palindrome
     */
    public static boolean isPalindrome(String text){
        int wordLength = text.length();
        int lastIndex = wordLength - 1;
        int halfOfWord = wordLength / 2;
        if (wordLength < 1){
            return false;
        }
        for(int i = 0; i < wordLength; i++){
            if(i >= halfOfWord){
                return true;
            }
            else if(text.charAt(i) != text.charAt(lastIndex - i)){
                break;
            }
        }
        return false;
    }

}
