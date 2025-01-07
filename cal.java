import java.util.*;

class Calculator {

<<<<<<< HEAD
static int add(int k, int y){
	return k+y;}
public static void main(String args[]) {
     int k, i;
        Scanner sc = new Scanner(System.in);

               System.out.print("Enter Your 1st number: ");
        k = sc.nextInt();

        
        System.out.print("Enter Your 2nd number: ");
        i = sc.nextInt();

               sc.nextLine();

               System.out.print("Enter the operation (+, -, *, /): ");
        String p = sc.nextLine();
   switch (p) {
            case "+":
                System.out.println("The sum of " + k + " and " + i + " is " + add(k,i);
                break;

            case "-":
                System.out.println("The difference of " + k + " and " + i + " is " + sub(k,i);
                break;

            case "*":
                System.out.println("The multiplication of " + k + " and " + i + " is " + mul(k,i);
                break;

            case "/":
                if (i != 0) {
                    System.out.println("The division of " + k + " and " + i + " is " + div(k,i);
                } else {
                    System.out.println("Error: Division by zero is not allowed!");
                }
                break;

            default:
                System.out.println("Please enter a valid operation (+, -, *, /).");
                break;
 
               
=======
static int div(int k, int y){
        return k/y;}
public static void main(String args[]) {

>>>>>>> div
   }}
~     