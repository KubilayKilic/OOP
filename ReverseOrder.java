import java.util.Scanner;   //used for interactive output-input operations

public class ReverseOrder {
   
	public static void main(String a[])
	{
		//First we create a scanner object
		Scanner scan=new Scanner(System.in);
		int [] numbers=new int[10];
		System.out.println("Array Length:"+numbers.length);
		for(int index=0; index<numbers.length; index++)
		{
			System.out.print("Enter Numbers: "+(index+1) +":");
			numbers[index]=scan.nextInt();
		}
		for(int i=numbers.length-1; i>=0; i--)
			System.out.print(numbers[i]+" ");
	}
}
