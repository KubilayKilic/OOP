/*This class uses an arrayList which is a class in java. ArrayList class
 * is designed to accept references to the object class as  parameter.
 * Thus it allows a reference to any kind object to be passed to it
 */
import java.util.ArrayList;
public class Beatles {
	public static void main(String a[])
	{
		ArrayList band=new ArrayList();
		band.add("Paul McCharty");
		band.add("John Lennon");
		band.add("Pete");
		band.add("George Harrison" );
		
		System.out.println(band);
		int x=band.indexOf("Pete");
		band.remove(x);
		System.out.println(band);
		band.add(x,"Ringo Star");
		System.out.println(band);
		
		System.out.println("Size of band:"+ band.size());
	}

}
