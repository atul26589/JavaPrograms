package programs;

public class ConvertStringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="9";
int x=46782;
System.out.println(str+1);
int num=Integer.parseInt(str);
System.out.println(num+1);

int number=Integer.valueOf(str);
System.out.println(number+100);

String s=Integer.toString(x);
int len=s.length();
System.out.println(len);
System.out.println(s.indexOf("5"));
	}

}
