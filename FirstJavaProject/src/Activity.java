import java.util.Scanner;

 

public class Activity {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

 

    System.out.print("Enter a number: ");
    int num = sc.nextInt();

 

    
    for (int i = num; i < num + 6; i++) {
      System.out.println("Multiplication table for " + i + ":");
      for (int j = 1; j <= 10; j++) {
        System.out.println(i + " x " + j + " = " + (i * j));
      }
      System.out.println(); 
    }
  }
}
