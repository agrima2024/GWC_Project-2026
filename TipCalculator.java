import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TipCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the total bill amount: $");
        double totalBill = Double.parseDouble(reader.readLine());
        System.out.print("Enter the tip percentage: ");
        double tipPercentage = Double.parseDouble(reader.readLine());
        double tipAmount = totalBill * (tipPercentage / 100);
        double finalCost = totalBill + tipAmount;
        System.out.println("Tip amount: " + tipAmount);
        System.out.println("Final cost: " + finalCost);
    }
}