package icici;

import java.util.Scanner;

public class icici1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		System.out.println("firstname   ");
		String fname = sc.nextLine();
		System.out.println("lastname   ");
		String lname = sc.nextLine();
		System.out.println("email   ");
		String email = sc.nextLine();
		System.out.println("mobile no   ");
		long mob = sc.nextLong();
		System.out.println("aadhar no "  );
		long aadhar = sc.nextLong();
		System.out.println("pin code   ");
		int pincode = sc.nextInt();
		System.out.println(" Select the account type - ");
		System.out.println("1.) SB A/c ");
		System.out.println("2.) FD A/c ");
		System.out.println("3.) Loan A/c upto rs-1,00,000 without any security");
		int acc = sc.nextInt();
		String type = "";
		switch(acc) {
		case 1 : type = "SB A/c" ;
		break;
		case 2 : type = "FD A/c";
		break;
		case 3 : type = "Loan A/c upto rs-1,00,000 without any security";
		break;		
		default : System.out.println("invalid selection");
				
			
		}
		
		System.out.println("firstname - "+ fname);
		System.out.println("lastname - "+ lname);
		System.out.println("email - "+ email);
		System.out.println("mob no - "+ mob);
		System.out.println("aadhar no - "+ aadhar);
		System.out.println("pin code - "+ pincode);
		System.out.println("Account type = "+ type);
		String greeting = "Dear "+fname+lname+", \n Congrats on opening a I";
		System.out.println("");
		sc.close();

	}

}
