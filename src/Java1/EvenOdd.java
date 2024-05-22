package Java1;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("Enter the number");
String number= scan.nextLine();

int i=Integer.parseInt(number);  

if(i%2==0) {
	System.out.println("The is even number");
}else {
	System.out.println("The number is Odd");
}

	}

}
