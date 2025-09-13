import java.util.Scanner;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Insert marks: ");
		double marks = input.nextDouble();

		System.out.println("Insert atendance: ");
		double att = input.nextDouble();

		if (marks>=50 | att>=85){
			System.out.println("You are aligible for the exam");
		}
		
		else{
			System.out.println("You are not aligible for the exam");
 		}
	}
}