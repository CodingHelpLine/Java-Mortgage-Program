// Scanner to read keyboard 

import java.util.Scanner; 

public class Mortgage {
    
    /**
     * Entry point of the program. 
     * 
     * @param args
     */
    public static void main(String [] args) {

        // Keyboard reader
        Scanner keyboard = new Scanner(System.in); 

        // Prompt the user to enter the inptus
        System.out.print("Enter the Loan Amount: ");
        double amount = keyboard.nextDouble();

        System.out.print("Enter the Interest Rate: ");
        double interestRate = keyboard.nextDouble();

        // Read the Years in loan term
        System.out.print("Enter Loan Term in Years: ");
        int years = keyboard.nextInt();

        // Convert Years to Months
        int months = years * 12; 

        // Convert yearly interest rate to monthly interest rate
        double monthlyIR = interestRate / 100.0 / 12; // Consider user enter 5.5% 

        // We call the Amotrization method
        displayAmortizationTable(amount, monthlyIR, months);

        // Close the Scanner
        keyboard.close();
    }

    /**
     * This function will calculate the monthly payment based on the parameters passed to the function. 
     * 
     * @param amount capital amount
     * @param rate monthly interest rate
     * @param months of the loan term
     * @return monthly payment
     */
    public static double calcMonthlyPayment(double amount, double rate, int months) {
        return (rate * amount) / (1 - Math.pow(1 + rate, -months)); 
    }

    /**
     * Function to dislay the Mortgage Amortization Table. 
     *  
     * @param amount capital amount
     * @param rate monthly interest rate
     * @param months of the loan term
     * @return monthly payment
     */
    public static void displayAmortizationTable(double amount, double rate, int months) {

        double balance = amount; 
        double payment = calcMonthlyPayment(amount, rate, months);
        double irPaid, amountPaid, newBalance;

        // Displpay the Header Row
        System.out.printf("%12s %12s %12s %12s %12s %12s%n", "Month", 
           "Old Balance", "Payment", "Interest", "Principal", "New Balance");
        System.out.printf("%12s %12s %12s %12s %12s %12s%n", "============", 
           "============", "============", "============", "============", "============");
        
        for(int month = 1; month <= months; month++) {
            irPaid = balance * rate;
            amountPaid = payment - irPaid;
            newBalance = balance - amountPaid;

            // Display the Table row
            System.out.printf("%12d %12.2f %12.2f %12.2f %12.2f %12.2f%n", month, 
           balance, payment, irPaid, amountPaid, newBalance);
        
            // update balance
            balance = newBalance;
        }
    }
    
}
