import java.util.*;
public class ForEach {
	public static void main(String[] args) {
		int []arr ={31,23,13,32,14};
		int max=0, min=arr[0];
		for(int i:arr) {
			if(i>max) {
				max=i;
			}
			if (i<min) {
				min=i;
			}
			
		}
		System.out.println("greatest num is : "+ +max);
		System.out.println("smallest num is : "+ +min);
		
	}

}
