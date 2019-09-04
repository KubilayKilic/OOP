/*Arrays in java are usually treated as objects
 * This is why they have special methods and properties
 * int [] height =new int[10] ; 
 */
public class BasicArray {

	public static void main(String a[])
	{
		final int limit=10;
		final int multiple=5;
		int list[]=new int[limit]; //declaration of an array
		for (int index=0; index<limit; index++)
			list[index]=index*multiple;
		
		for (int value:list)//classical way: for(int i=0; i<limit; i++)
			                //				    System.out.println(list[i];
			System.out.print(value + " ");
	}
}
