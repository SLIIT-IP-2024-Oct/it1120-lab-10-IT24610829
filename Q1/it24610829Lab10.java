import java.util.Scanner;
public class it24610829Lab10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println();
		System.out.print("Enter the mark (0-100):");
		int mark = input.nextInt();

		assert (mark >= 0 && mark <= 100) : "Invalid Mark";

		System.out.println();
		System.out.println("Mark is Validated");

		char grade ;
		if(mark >= 75) {
		grade = 'A';
		} else if (mark >= 60) {
		grade = 'B';
		} else if (mark >= 50) {
		grade = 'C';
		} else if (mark >= 40) {
		grade = 'D';
		} else{
		grade = 'F';
		}

		assert (mark>=75 && grade == 'A') ||
			(mark<75 && mark>=60 && grade == 'B')||
			(mark<60 && mark>50 && grade == 'C')||
			(mark<40 && grade == 'F') :"Incorrect Grade Assigned";
			
		System.out.println();
		System.out.println("Mark is Validate");
		System.out.println("The Grade For Enter Mark Is :"+grade);
	}
}
		
		
