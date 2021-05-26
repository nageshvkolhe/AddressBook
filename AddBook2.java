package AddressBook;
import java.util.Scanner;


public class AddBook2 {
	 public static void main(String[] args) {
		  
		  Scanner sc = new Scanner(System.in);
	      AddBook1 add[] = new AddBook1[10];
          int count = 0;
          String firstname;
          String lastname;
          String address;
          String city;
          String state;
          String zip;
          String phonenumber;
          String email;
          int choice = 0;
          
          do {
         	 System.out.println("1.Add Detail 2.Update Details 3.Delete Details 4.Show all Details");
         	 System.out.println("Enter your choice");
         	 choice = sc.nextInt();
         	 
         	 switch(choice) {
         	 
         	 case 1:
         		 System.out.println("Enter how many address details you want to add");
         	     int num = sc.nextInt();
         	     for(int i = 0;i < num; i++) {
         	    	 System.out.println("Enter first and last name");
         	    	 firstname = sc.next();
         	    	 lastname = sc.next();
         	    	 System.out.println("Enter Address");
         	    	 address = sc.next();
         	    	 System.out.println("Enter City");
         	    	 city = sc.next();
         	    	 System.out.println("Enter State");
         	    	 state = sc.next();
         	    	 System.out.println("Enter ZIP");
         	    	 zip = sc.next();
         	    	 System.out.println("Enter Phone Number");
         	    	 phonenumber = sc.next();
         	    	 System.out.println("Enter Email");
         	    	 email = sc.next();
         	    	
         	    	 add[count] = new AddBook1(firstname, lastname, address, city, state, zip, phonenumber, email);
         	         }
         	         count++;
         	         System.out.println("Details added successfully");
         	         break;
             }
          }	 
         while (choice!=0);
		}       	 	
}
