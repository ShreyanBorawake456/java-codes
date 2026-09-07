
public class ReversingNumber1 {
    public static void main(String[] args) {
        int a= 452006;
         while(a>0)
         {
            int lastDigit = a%10;
            System.out.print(lastDigit);
            a=a/10;
         }
    }
}