import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int x=26;
		int y=4;
		// System.out.println("The values of x and y = " +x  +" and "  +y); //The values of x and y = 3 and 4
        x%=y;
        int z=++x;
        System.out.println("x= " +x  +" and z= " +z);
        System.out.println(x);
       
	}

}
