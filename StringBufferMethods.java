package String_Programs;

public class StringBufferMethods 
{

	public static void main(String[] args) 
	{
		StringBuffer sb1=new StringBuffer("0123456789");
		System.out.println(sb1.toString());
		System.out.println(sb1.replace(2, 9, "0"));
		System.out.println(sb1);
		System.out.println();

	}

}
