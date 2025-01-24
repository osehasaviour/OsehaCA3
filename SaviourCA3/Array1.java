import java.util.Scanner;
import java.util.Arrays;

public class Array1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int array[] = new int[10];
    for (int i = 0; i < 10; i++){
      System.out.println("The array for index " + i + " is ");
      array[i] = scanner.nextInt();
    }
    System.out.println("The arrays you inputed are; ");

    for (int i = 0; i< 10; i++){
      System.out.print(array[i] + ", ");
    }
  }
}