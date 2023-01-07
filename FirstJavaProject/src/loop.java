import java.util.*;

public class loop {

	public static void main(String[] args) {
		
				int num,i,f=1;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the number : ");
				num= sc.nextInt();
				for (i=1; i<=num; i++) {
				    f=f*i;
				}
				System.out.println("Factorial is "+ +f);
				
	}
}
