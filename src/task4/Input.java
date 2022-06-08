package task4;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void input(String str){
        String[] array = str.split("[ ,.]+");
        System.out.println(Arrays.toString(array));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of word to check");
        int number = scanner.nextInt();
        if(number > array.length){
            System.out.println("String dont have so many words");
        }
        else if(number <= 0){
            System.out.println("String is not empty");
        }
        else WorkingWithString.isPalindrome(number ,str);
    }
}
