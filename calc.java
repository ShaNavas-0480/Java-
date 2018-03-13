import java.util.*;
class calc
{
public static void main(String [] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int x=s.nextInt();

	if (x%3==0 && x%5==0)
	{
	System.out.println("Hello World");
	}
	else if(x%3==0)
	{
	System.out.println("Hello");
	}
	else if(x%5==0)
	{
	System.out.println("World");
	}
	

}
}