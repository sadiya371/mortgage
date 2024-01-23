import java.text.NumberFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Byte month = 12;
        Byte percent = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.println("principal: ");
        int principal = scanner.nextInt();
        System.out.println("Annual rate: ");
        float AnnualRate = scanner.nextFloat();
        float MonthlyRate = AnnualRate / percent / month;
        System.out.println("period");
        byte period = scanner.nextByte();
        int NumberOfPayments = period * month;
         double mortgage = principal * (MonthlyRate * Math.pow(1 + MonthlyRate, NumberOfPayments))/(Math.pow(1 + MonthlyRate, NumberOfPayments) - 1);
          NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
          String formattedMortgage = currencyFormat.format(mortgage);
        System.out.println("Mortgage " + mortgage);






    }
}