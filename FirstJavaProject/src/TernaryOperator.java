import java.util.*;
public class TernaryOperator {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name : ");
		String name=sc.next();
		System.out.println("Enter customer Id : ");
		int id=sc.nextInt();
		System.out.println("Enter Account Number : ");
		int acc=sc.nextInt();
		System.out.println("Enter the amount to be withdrawn : ");
		int n=sc.nextInt();
		int balance= 50000;
		int newbal= balance-n;
		int b=(balance>n)?newbal:balance;
		System.out.println(newbal);
		
		
	}

}
