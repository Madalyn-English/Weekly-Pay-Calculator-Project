import java.util.Scanner;           //importing scanner class
import java.text.DecimalFormat;     //importing decimal formatter

public class NetPay {

    public static void main(String[] args) {
        String name;
        Scanner scan = new Scanner(System.in);
        
        //User inputs name
        System.out.println("Enter employee's full name: ");
        name = scan.nextLine();
        
        //user inputs hours worked
        System.out.println("Enter the number of hours worked in a week: ");
        double hours = scan.nextDouble();
        
        //User inputs hourly rate
        System.out.println("Enter hourly pay rate in dollars and cents "
                +          "(ex. 8.50): ");
        double payrate = scan.nextDouble();
        
        //User inputs federal tax withholding
        System.out.println("Enter the federal tax withholding rate "
                +          "(ex. 10% would be entered as 0.10): ");
        double fedtaxrate = scan.nextDouble();
        
        //User inputs state tax withholding
        System.out.println("Enter the state tax withholding rate "
                +          "(ex. 5.6% would be entered as 0.056): ");
        double statetaxrate = scan.nextDouble();
        
        //Calculating deductions from weekly wages
        double grosspay = (payrate * hours);
        double fedwithhold = (grosspay * fedtaxrate);
        double statewithhold = (grosspay * statetaxrate);
        double deduction = (fedwithhold + statewithhold);
        double netpay = (grosspay - deduction);
        
        //Printing output after calculations
        DecimalFormat df = new DecimalFormat("$#.00");
        System.out.println("**************************************");
        System.out.println("Employee name: " + name);
        System.out.println("Hours worked: " + hours);
        System.out.println("Pay rate: " + df.format(payrate));
        System.out.println("Gross pay: " + df.format(grosspay));
        System.out.println("Deduction: ");
        System.out.println("      Federal witholding (20%): " + df.format(fedwithhold));
        System.out.println("      State withholding (9%): " + df.format(statewithhold));
        System.out.println("      Total deduction: " + df.format(deduction));
        System.out.println("Net pay: " + df.format(netpay));
        System.out.println("**************************************");
    }
    
}

