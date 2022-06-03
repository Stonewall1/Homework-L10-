package task3;

import java.util.Arrays;

public class WorkingWithString {
    public static void minUniqueSymbolInWordCount(String str){
        String[] arrayOfWords = str.split("[ ,.]+");
        System.out.println(Arrays.toString(arrayOfWords));
        String result = "";
        int count = Integer.MAX_VALUE;
        for (int i = 0; i < arrayOfWords.length; i++) {
            char[] wordChars = arrayOfWords[i].toCharArray();
            int uniqueCharsCount = arrayOfWords[i].length();
            for (int j = 0; j < wordChars.length; j++) {
                if(j != arrayOfWords[i].indexOf(wordChars[j])){
                    uniqueCharsCount--;
                }
            }
            if(uniqueCharsCount < count){
                count = uniqueCharsCount;
                result = arrayOfWords[i];
            }
        }
        System.out.println(result);
    }
}
