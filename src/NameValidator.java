//Matt Lynn
import java.util.Scanner;
import java.util.regex.Pattern;

public class NameValidator
{

	public static void main(String[] args)
	{
		String name = "Matt";
		String email ="matthewchristopherlynn@yahoo.com";
		String phone ="586-747-3592";
		String date = "12/30/1991";
		Boolean check;
		//input
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a name (Capitalize first letter): ");
		name=scan.nextLine();
		System.out.print("Please enter an email address: ");
		email=scan.nextLine();
		System.out.print("Please enter a phone number (###-###-####): ");
		phone=scan.nextLine();
		System.out.print("Please enter a date (mm/dd/yyyy): ");
		date=scan.nextLine();
		
		//name check
		check = Pattern.matches("[A-Z][A-Za-z]{0,29}", name);
		System.out.println("The name " + name + " qualifies: " + check);
		//email check
		check = Pattern.matches("[A-Za-z\\d]{5,30}[@][A-Za-z\\d]{5,10}[.][A-Za-z\\d]{2,3}", email);
		System.out.println("The email " +email + " qualifies: " + check);
		//phone # check
		check = Pattern.matches("[\\d]{3}[-][\\d]{3}[-][\\d]{4}", phone);
		System.out.println("The phone number " + phone +" qualifies: " + check);
		//date check
		check = Pattern.matches("[01][\\d][/][123][\\d][/][\\d]{4}", date);
		System.out.println("The date " + date + " qualifies: " + check);
		
		scan.close();
	}
	
	

}
