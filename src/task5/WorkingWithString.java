package task5;

import java.util.Arrays;

public class WorkingWithString {

    public static void duplicate(String str){
        String[] array = str.split("");
        System.out.println(Arrays.toString(array));
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if(array[i].matches("[A-za-z]+")){
                builder.append(array[i].repeat(2));
            }
            else if(array[i].matches("[ ,.!?:;*()]+")){
                builder.append(array[i]);
            }
        }
        System.out.println(builder);
    }
}
