import java.util.Arrays;

public class HomeWorkMain {
    public static void main(String[] args) {

        printCharIndex("hello world", 'l');// 1
        System.out.println("------------------------");
        boolean res = isPalindrome("eve");
        System.out.println(res); // 2
        System.out.println("-------------------------");
        printSentenceReverse1("Hello course QA 84");// 3
        System.out.println("--------------------------");
        PrintSentenceReverse2("Hello course QA 84");// 4
        System.out.println("--------------------------");
        System.out.println(isPalindrome("EvE"));// 5
    }
//1
 static void printCharIndex(String str, char sym) {
 for (int i = 0; i < str.length(); i++) {
  System.out.println("  I  : " + i + "  Symbol : " + str.charAt(i));
            if (str.charAt(i) == sym) {
            System.out.println(" Index = " + i);
            }
        }
    }
 //2-4
  static boolean isPalindrome(String str) {
     for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
          str = str.toLowerCase();
          char ci = str.charAt(i);
          char cj = str.charAt(j);
          if (ci == cj)

          {
              return true;
          }
      }
    return false;
}
 //3
        static void printSentenceReverse1(String sentence){
        String [] ar =sentence.split(" ");
        for(int i= ar.length-1;i>=0;i--){
            System.out.println(ar[i]+" ");
        };
        System.out.println();
        }
//4
         static  void PrintSentenceReverse2(String sentence){
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










/*

  static boolean isPalindrome(String str) {
  for (int i = 0; i < str.length() / 2; i++) {
         if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
             return false;
          }
      }
    return true;
}

 */
