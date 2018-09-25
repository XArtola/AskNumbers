import java.util.Scanner;

public class AskNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int Sum = 0;
		int Number;
		
		while(Sum <100) {
			
			System.out.println("Type a number");
			Number = scan.nextInt();
			Sum = Sum + Number;
			
				
						}
		System.out.println("You reached 100!!");

	}

}
