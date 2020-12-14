package main;

public class Test {

    public static void main(String[] args) {
//        placeZeroesToEnd(new int[]{0, 1, 2, 3, 0, 4, 5, 6});
//        System.out.println(isPalindrome("rotoR"));
        Matrix matrix = new Matrix();
        matrix.set(1,1,2);
        matrix.set(5,5,1);
        matrix.set(15,2,9);
        matrix.set(1500,2000,9);
        matrix.printMatrix(15,15);
        System.out.println(matrix.sum(5,5));
    }

    /**
     * Takes array and places all zeros to the end.
     * Sequence of non-zero elements stays the same.
     * Algorithmic complexity is O(n)
     * @param numbersArray the array to be sorted
     * @return the sorted array
     */
    public static int[] placeZeroesToEnd(int[] numbersArray) {
        int[] newArray = new int[numbersArray.length];
        int newArrayIndex = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            int currentNumber = numbersArray[i];
            if (currentNumber != 0) {
                newArray[newArrayIndex++] = currentNumber;
            }
        }
        return newArray;
    }

    /**
     * Checks if word is palindrome
     * Algorithmic complexity is O(n)
     * @param text word to check
     * @return true if word is palindrome
     */
    public static boolean isPalindrome(String text){
        int wordLength = text.length();
        int lastIndex = wordLength - 1;
        if (wordLength <= 1){
            return false;
        }
        for(int i = 0; i < wordLength; i++){
            if(i >= wordLength/2){
                return true;
            }
            else if(text.charAt(i) != text.charAt(lastIndex - i)){
                break;
            }
        }
        return false;
    }

}
