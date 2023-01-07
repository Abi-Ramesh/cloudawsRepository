import java.util.*;
public class Array1 {
	public static void main(String[] args) {
		int sum1=0, sum2=0;
		int []arr= new int[] {22,12,31,26,17,7,2}; //initializer
		for(int i=0; i<arr.length; i++) {
			if (arr[i]%2==0) 
			{
				sum1=sum1+arr[i];
			}
			else {
				sum2=sum2+arr[i];
			}
			
		}
		System.out.println("the sum of even is : "+ +sum1);
		System.out.println("the sum of odd is : "+ +sum2);
		}
	}

