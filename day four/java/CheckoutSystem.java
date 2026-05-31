//1. Enter each product details in the user’s cart - Product and
//quantity purchased.
//2. Displays customers invoice.
//3. Computes total, discount and VAT of 7.5% of total price
// when user bring thier stuff the cashier put in the the name of the goods and the price with the amount bought
// print out the invoice then recipt
// CREATE AN ARRAY FOR EACH OF THE USER INPUT AND STORE THEM THERE
import java.util.Scanner;
public class CheckoutSystem{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    String[] customer = new String[100];
    String[] goods = new String[100];
    int[] amount = new int[100];
    double[] price = new double[100];
    

    System.out.print("what is the customer's name:  ");
    customer = input.nextLine();

    while(userinput.equals("yes")){
    System.out.print("what did the user buy:  ");
    String userinput = input.nextLine();

    System.out.print("how many piece:  ");
    amount = input.nextInt();

    System.out.print("how much per unit:  ");
    price = input.nextDouble();

    System.out.print("add more items?:  ");
    String userinput = input.nextLine();

    if(!userinput.equals("yes")){
        break;    
        }
    }


    }

}
