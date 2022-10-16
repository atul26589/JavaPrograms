package programs;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
   s.roll=1;
   s.course="PCM";
   s.name="John";
   s.m1=92;
   s.m2=97;
   s.m3=88;
   System.out.println(s.total());
   System.out.println(s.average());
   System.out.println(s.details());
	}

}
