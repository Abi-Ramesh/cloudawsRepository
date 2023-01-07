import java.util.*;
public class TableActivity {
	public static void main(String[] args) {
		int i,j, num, t=1, x=0;
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number : ");
		num=sc.nextInt();
	//	x=num+5;
		
		
	//	while(num<=x) { //using while
		for(j=num;j<num+6;j++) {
			System.out.println("the next table is" );
			for(i=1;i<=10;i++) {
			t=j*i;
			System.out.println(+j +" * " +i +" = " +t);
			
		}
		System.out.println();	
	//	num+=1;
		}
		
	}

}
