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
        System.out.println("--------------------------");
        PrintSentenceReverse3("Hello course QA 84");// 6
        System.out.println("--------------------------");
        System.out.println(isPalindrome("Name now one man"));// 7
        System.out.println("--------------------------");
        int res1 = substringIndex("abcdeffgh","fgh");
        System.out.println(res1);

    }
    public static int substringIndex(String s, String sub) {
       System.out.println( "String: "+ s.length()+" sym" + " sub: "+ sub.length()+" sym");
        for (int i = 0; i <= s.length() - sub.length(); i++) {
                 int count = 0;
            for (int j = 0; j < sub.length(); j++) {
                if (s.charAt(i + j) == sub.charAt(j)) {
                    count++;
                } else {
                    System.out.println("Index: "+i+
                            " String : " + s.charAt( i)+" sub string : " + sub.charAt(j));
                }
            }
            // если совпали все символы
            if (count == sub.length()) {
               return i;
            }
        }
        return -1;
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
 //2-4-6
  static boolean isPalindrome(String str) {
      str = str.toLowerCase();
      str = str.replace(" ", "");
     for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
          char ci = str.charAt(i);
          char cj = str.charAt(j);
          if (ci != cj)

          {
              return false;
          }
      }
    return true;
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
      static  void PrintSentenceReverse3(String sentence){
        String [] ar =sentence.split(" ");
        for(int i= ar.length-1;i>=0;i--){
            String reversed = new StringBuilder(ar[i]).reverse().toString();
            System.out.println(reversed);
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
