import java.util.Scanner;

public class ATM
{
public static void main(String rgs[])
{
 final int CORRECT_PIN = 1234; // change as needed
 int balance = 5000;           // string  balance
  int withdraw,deposit;
Scanner sc = new Scanner(System.in);

//PIN Authentication (max 3 attempts)
int attempts = 0;
boolean authenticated = false;
while (attempts<3)
{
System.out.println("Enter your PIN:");
int enteredPin = sc.nextInt();
if(enteredPin == CORRECT_PIN)
{
 authenticated=true;
 break;
}
 else
{
 attempts++;
System.out.println("Incorrect PIN.Attempts left:"+(3-attempts));
}
}

if(!authenticated)
{
 System.out.println("Card blocked due too many incorrect attempts.Exiting.");
}

//Main ATM operations 
while(true){
  System.out.println("\n===Welcome to SBI ATM ==");
  System.out.println("1.Withdraw");
  System.out.println("2.Deposit");
  System.out.println("3.Check Balance");
  System.out.println("4.EXIT");
  System.out.println("Choose an operation:");

System.out.println("Choose an operations:");

int choice = sc.nextInt();
 switch(choice){
  case 1:
    System.out.println("Enter amount to withdraw:");
    withdraw = sc.nextInt();
    if(withdraw > 0 && withdraw <= balance)
{
balance = withdraw;
System.out.println("please collect your cash.");
}
else
{
 System.out.println("Insufficient balance or invalid amount.");
}
break;

case 2:
 System.out.println("Enter amount to deposit:");
 deposit = sc.nextInt();
if(deposit>0)
{
 balance += deposit;
System.out.println("deposit successful.");
}
else
{
System.out.println("Invalid deposit amount:");
}
break;
 case 3:
System.out.println("Current Balance:"+balance);
break;

case 4:
System.out.println("Thank you for using the ATM.Goodbye!");

break;

default:
 System.out.println("Invalid choice.please try again.");
}
}
}
}





















  
