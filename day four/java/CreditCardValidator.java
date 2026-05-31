//point noted: (1) a credit card must have 13 - 16 digit and it must start with the following(this also determines the type of card it is):  4 - visa card; 5 - mastercard; 37 - american express card; 6 - discover card
// using the mod10 check to validate the credit card: (1). double every second digit from right to left (e.g the number * 2) and if any number result to a two digit number, add the number to turn to a single number(e.g 12 = 1 + 2 == 3)......(2). now add all the digit together(the result from multiplying by 2).......(3). now add all the numbers in the odd indexes......(4). add step 2 qnd 3 together.........(5). if the number in step 4 is divided by 10, the card number is valid else it is invalid


// what are we returning?...{the credit card type
//card number
//length
// and validity status}

// pseudocode: collect input from user
// store each character in an array
// create a variable for each card type
// first edge case: if the number at the first index = 4, 5, 6 and 37 it should print the card type

// print the card number .... gotten

// second edge case: print the length of   the array ....gotten

// third edge case: checking the validity
// create a variable to hold the sum of the result
// create a variable to hold the sum of the odd indexes
// loop through the array and multiply each index by two and sum it up in a variable
//loop through the array and sum up the digit in the odd indexes and add it to the variable created for it
// add the two variable 
// if the sum is divided by ten it should print valid else invalid

public class CreditCardValidator{

public static String cardType(long usernumber){
    
    String message = "";

    int counter = 0;

    String user = "" + usernumber;

    for(int count = 1; count <= user.length(); count++){
    counter++;
    }


    char [] card = new char[counter];
    int [] collector = new int[card.length];
    int checker = 0;
 
    for(int num = 0; num < user.length(); num++){
    card[checker] = user.charAt(num);
    checker++;
    }

    for(int number = 0; number < card.length; number++){
    collector[number] = (int) card[number] - 48;    
    }

    if(collector[0] == 4 ){
    message = "Visa Card";
    } else if(collector[0] == 5){
   message = "MasterCard";
    } else if (collector[0] == 6){
    message = "Discover Card";
    } else if (collector[0] == 3 && collector[1] == 7) {
    message = "American Express";
    } else{
    message = "invalid card";    
    }

    return message;

    }

public static long cardNumber(long usernumber){

    return usernumber;

    }    
    
public static int cardLength(long usernumber){

    String length = "" + usernumber;

    int num = length.length();

    return num;
    
    }

public static String cardValidation(long usernumber){
    String message = "";
    int total = 0;
    int firsttotal = 0;
    int secondtotal = 0;

    String length = "" + usernumber;

    char [] card = new char[length.length()];
    int [] collector = new int[card.length];
    
    for(int count = 0; count < card.length; count++){
    card[count] = length.charAt(count); 
    }

    // how do i convert char to int? i typecast!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!..with a trick, lol
    for(int counter = 0; counter < collector.length; counter++){
    collector[counter] = (int) card[counter] - 48;
    }

    for(int value = 0; value < collector.length; value++){
    collector[value] = collector[value] * 2;
        if(collector[value] >= 10){
            int digit = collector[value] % 10;
            int original = collector[value] / 10;
            collector[value] = digit + original;
        }
    firsttotal += collector[value];
    }

    for(int digit = 0; digit < collector.length - 1; digit+=2){
    collector[digit] = collector[digit] * 2;
        if(collector[digit] >= 10){
            int secdigit = collector[digit] % 10;
            int original = collector[digit] / 10;
            collector[digit] = secdigit + original;
        }
    secondtotal += collector[digit];
    }

    total = firsttotal + secondtotal;
    if(total % 10 == 0){
        message = "valid";
    } else{
        message = "invalid";    
    }
        
    return message;
    }

}



