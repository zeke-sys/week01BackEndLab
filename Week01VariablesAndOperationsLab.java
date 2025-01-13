package week01;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Create a variable to hold the quantity of 
				//		available plane seats left on a flight	

				int planeSeatsLeft;
				planeSeatsLeft = 15;
				System.out.println("Quantity of available seats left on the flight is " + planeSeatsLeft);

				
				// 2. Create a variable to hold the cost of groceries at checkout

				float groceryCost;
				groceryCost = 35.34f;
				System.out.println("Cost of groceries at checkout is " + groceryCost);
				
				// 3. Create a variable to hold a person's middle initial
				
				char middleInitial;
				middleInitial = 'W';
				System.out.println("The customer's middle initial is " + middleInitial);

			
				// 4. Create a variable to hold true if it's hot outside 
				//		and false if it's cold outside
				
				boolean isHotOutside = true;
				System.out.println("Is it hot outside? " + isHotOutside);
				

				
				// 5. Create a variable to hold a customer's first name
				
				String firstName;
				firstName = "Peter ";
				System.out.println("The customer's first name is " + firstName);

				
				// 6. Create a variable to hold a street address
				
				String streetAddress = "1558 North Star Lane, Denver, CO 80238";
				System.out.println("Mike's addres is " + streetAddress);
				

				// 7. Print all variables to the console
				
				System.out.println("All variables have already been printed.");
			

				// 8. A customer booked 2 plane seats, 
				//		remove 2 seats from the available seats variable
			
				planeSeatsLeft = planeSeatsLeft - 2; //another way to do it is availableSeatsleft -= 2;
				System.out.println("Quantity of available seats left on the flight is now " + planeSeatsLeft);
				

				// 9. Impulse candy bar purchase, add 2.15 to the grocery total
				// 		costOfGroceries = costOfGroceries + 2.15;
				
				groceryCost = groceryCost + 2.15f;
				System.out.println("New cost of groceries at checkout is " + groceryCost);


				// 10.  The birth certificate was printed incorrectly, 
				//		change the middle initial to something else
				
				middleInitial = 'B';
				System.out.println("The middle inital has been changed to: " + middleInitial);

				// 11.  The season has changed, update the hot outside 
				//			variable to be opposite of what it was

				isHotOutside = false; //another way to do it is isHotOutside = !isHotOutside;
				System.out.println("Is it hot outside? " + isHotOutside);

				// 12.  Create a new variable called full name using the customer's first name, 
				//			the middle initial, and a last name of your choice
				
				String lastName = " Pan"; //Instead of adding space to the variables to space the words out, we could add a space in the print line + " ".
				String fullName = firstName + middleInitial + lastName;
				System.out.println("The customer's full name is " + fullName);
				
			

				// 13.  Print a line to the console that introduces the customer and says they live
				// 			at the address variable
				
				System.out.println("This is our customer " + fullName + ". They live at " + streetAddress + ".");
	}

}
