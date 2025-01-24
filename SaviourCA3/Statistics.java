import java.util.Arrays;

public class New {
    public static void main(String[] args) {
        // Given array
        int[] numbers = {2, 5, 9, 4, 7, 0, 9, 6, 11, 12};

        // Calculate and print mean
        double mean = calculateMean(numbers);
        System.out.println("Mean: " + mean);

        // Calculate and print median
        double median = calculateMedian(numbers);
        System.out.println("Median: " + median);

        // Calculate and print standard deviation
        double stdDev = calculateStandardDeviation(numbers, mean);
        System.out.println("Standard Deviation: " + stdDev);
    }

    // Method to calculate mean
    public static double calculateMean(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    // Method to calculate median
    public static double calculateMedian(int[] numbers) {
        Arrays.sort(numbers); // Sort the array
        int n = numbers.length;
        if (n % 2 == 0) {
            // Even length: average of two middle elements
            return (numbers[n / 2 - 1] + numbers[n / 2]) / 2.0;
        } else {
            // Odd length: middle element
            return numbers[n / 2];
        }
    }

    // Method to calculate standard deviation
    public static double calculateStandardDeviation(int[] numbers, double mean) {
        double sumSquaredDifferences = 0.0;
        for (int num : numbers) {
            sumSquaredDifferences += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sumSquaredDifferences / numbers.length);
    }
}
