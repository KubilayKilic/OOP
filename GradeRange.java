
public class GradeRange {
	public static void main(String a[])
	{
		Grade [] grades= {new Grade("AA",90),new Grade("BA",80),
                          new Grade("BB",70), new Grade("FF",60)};
		
		for(Grade letterGrade:grades)
			System.out.println(letterGrade);
	}
}
