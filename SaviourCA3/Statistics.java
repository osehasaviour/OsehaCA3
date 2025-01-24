import java.util.Arrays;
public class Statistics {

  public static void main(String[] args) {
    int [] data = {2,5,5,9,4,7,0,9,6,11,12};
    double average = data.length;
    int sum = 0;
    for(int i = 0; i < data.length; i++){
      sum = sum + data[i];
    }
    double mean = sum/average;
    System.out.println("Mean = " + mean); // TO GET THE MEAN

    Arrays.sort(data);
    int n = data.length;
    int median = data[n/2];
    System.out.println("Median = "+median); // TO GET THE MEDIAN

    

  }
}