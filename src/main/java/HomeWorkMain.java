import java.util.Arrays;

public class HomeWorkMain {
    public static void main(String[] args) {

        printCharIndex("hello world", 'l');// 1
        System.out.println(isPalindrome("EVE"));// 2
        printSentenceReverse1("Hello course QA 84");// 3
        PrintSentenceReverse2("Hello course QA 84");// 4



    }
//1
    public static void printCharIndex(String str, char sym) {

        for (int i = 0; i < str.length(); i++) {

            System.out.println(
                   "  I  : " + i +
                   "  Symbol : " + str.charAt(i)
            );

            if (str.charAt(i) == sym) {

            System.out.println(" Index = " + i);

            }
        }


    }
 //2
public static boolean isPalindrome(String str) {
     for (int i = 0; i < str.length() / 2; i++) {
         if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
             return false;
         }
     }
     return true;


}
 //3
       public static void printSentenceReverse1(String sentence){
        String [] ar =sentence.split(" ");
        for(int i= ar.length-1;i>=0;i--){
            System.out.println(ar[i]+" ");
        };
        System.out.println();
        }
//4
        public static  void PrintSentenceReverse2(String sentence){
        String [] ar =sentence.split(" ");
        for(int i= ar.length-1;i>=0;i--){
                   String str= ar[i];
           for(int j =str.length()-1;j>=0;j--){
        System.out.print(str.charAt(j));
           }
         System.out.println();
        }

        }

    }




