import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Kelimeninizi Giriniz :");
        String word=scanner.nextLine();
        isPalindromik(word);

    }
    static void isPalindromik(String input){
        char[] wordChar=input.toCharArray();
        System.out.println("Char Dizi Elemanları Şu Şekildedir.");
        for (char i:wordChar){
            System.out.print(i+", ");
        }
        char[] wordCharReverse=new char[wordChar.length];
        System.out.println();
       for (int i=0;i<wordChar.length;i++){
           wordCharReverse[wordChar.length-1-i]=wordChar[i];
       }
       for (char i:wordCharReverse){
           System.out.print(i+", ");
       }
        System.out.println();
       String w1=String.valueOf(wordChar);
       String w2=String.valueOf(wordCharReverse);
        System.out.println(w1+"    "+w2);
       if (w1.equals(w2)){
           System.out.println("Palindromiktir.");
       }else {
           System.out.println("Palindromik değildir.");
       }
    }
}