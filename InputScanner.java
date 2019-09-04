import java.util.*;  //to call scanner class for inputting purposes
public class InputScanner {
    public static void main(String s[])
    {
    	int a,b;
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Enter two integers:");
    	a=scan.nextInt();
    	b=scan.nextInt();
    	System.out.println("a="+a + "  a*a="+a*a);
    	System.out.println("b="+b + "  b*b="+b*b);
    }
}
