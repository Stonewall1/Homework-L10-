package task1;

public class Main {
    public static void main(String[] args) {
        String document = "1234-ABC-5678-Def-9h0K";
        System.out.println("Document number : " + document);

        WorkingWithString.blockOfNumbers(document);
        WorkingWithString.letterReplacement(document);
        WorkingWithString.onlyLettersInLowerCase(document);
        WorkingWithString.onlyLettersInUpperCase(document);
        WorkingWithString.checkLetters(document);
        WorkingWithString.checkNumbers(document);
        WorkingWithString.checkNumbersEnd(document);
    }
}
