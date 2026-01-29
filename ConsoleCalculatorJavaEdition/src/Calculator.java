import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public Calculator() {
        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("=======================================================================");
            System.out.println("Enter the First Number:");
            double a = sc.nextDouble();

            sc.nextLine();
            System.out.println("Now enter your Operator! and make sure your use only:  +  -  *  /    :)");
            String operator = sc.nextLine();


            System.out.println("Alright! now enter your second number! :D");
            double b = sc.nextDouble();
            double resultPlus = a + b;
            double resultMinus = a - b;
            double resultMultiply = a * b;
            double resultDivide = a / b;


            switch (operator) {

                case ("+") -> System.out.println("NICE! \n" + a + " + " + b + " is equal to " + resultPlus);
                case ("-") -> System.out.println("NICE! \n" + a + " - " + b + " is equal to " + resultMinus);
                case ("*") -> System.out.println("NICE! \n" + a + " × " + b + " is equal to " + resultMultiply);
                case ("/") -> System.out.println("NICE! \n" + a + " ÷ " + b + " is equal to " + resultDivide);
                default -> {System.out.println( a + " " + operator + " " + b + " is equal to... \nWait a minute... what the hell " + "\"" +  operator + "\"" +" is doing here?!");
                    break;
                }

            }
        } catch (InputMismatchException e) {
            System.out.println("HOW AM I SUPPOSED TO SOLVE THIS?! >:(");
        }
    }
}
