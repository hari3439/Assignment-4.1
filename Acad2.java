import java.util.Scanner;
class Acad2
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number:");
		a=sc.nextInt();
		System.out.println("enter the second number:");
		b=sc.nextInt();
		c=sum(a,b);
		System.out.println("the sum is:"+c);
	}
	public static int sum(int a,int b)
	{
		int result=a+b;
		return result;
	}
}