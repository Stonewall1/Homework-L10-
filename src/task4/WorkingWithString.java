package task4;

public class WorkingWithString {

    public static void isPalindrome(int number, String str) {
        String[] array = str.split("[ ,.]+");
        String wordToCheck = array[number - 1];
        boolean isPalindrome = true;
        System.out.println(wordToCheck);
        if(wordToCheck.length() < 3){
            System.out.println(!isPalindrome);
            return;
        }
        StringBuilder SB = new StringBuilder(wordToCheck);
        String reversedWord = String.valueOf(SB.reverse());
        if(wordToCheck.equals(reversedWord)){
            System.out.println(isPalindrome);
        }
        else System.out.println(!isPalindrome);

    }
}
