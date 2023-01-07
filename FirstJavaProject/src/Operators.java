import java.util.*;

public class Operators {
	public static void main(String[] args)
	{
		System.out.println("Enter number of days ");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int x=n/7;
		int y=n%7;
		System.out.println("Number of weeks : " +x);
		System.out.println("Number of remaining days : " +y);
		
	}

}
