package task2;

import java.util.Arrays;

public class WorkingWithString {

    public static void longestWord(String str){
        String[] array = str.split("[ ,.]+");
        System.out.println(Arrays.toString(array));
        int count = 0;
        String result = "";
        for (int i = 0; i < array.length; i++) {
            if(array[i].length() >= count){
                count = array[i].length();
                result = array[i];
            }
        }
        System.out.println(result);
    }
    public static void shortestWord(String str){
        String[] array = str.split("[ ,.]+");
        System.out.println(Arrays.toString(array));
        int count = Integer.MAX_VALUE;
        String result = "";
        for (int i = 0; i < array.length; i++) {
            if(array[i].length() <= count){
                count = array[i].length();
                result = array[i];
            }
        }
        System.out.println(result);
    }

}
