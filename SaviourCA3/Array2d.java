import java.util.Scanner;
import java.util.Arrays;

public class Array2d {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int array[][] = new int[10][10];
    for (int i = 0; i < 2; i++){
      for (int j =0; j<10; j++){
        System.out.println("input for row " + (i + 1) + " column " + (j + 1) + " is " );
        array[i][j] = scanner.nextInt();
      }
    }
    System.out.println("The arrays you inputed are; ");

    for (int i = 0; i< 2; i++){
      for (int j = 0; j<10; j++){
      System.out.println(array[i][j]);
      }
    }
  }
}