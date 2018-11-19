import java.util.Scanner;
import java.util.ArrayList;

public class PerfectNumbers {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		int loop = 0;
		
		while (loop != 1) {
		
			System.out.println("Enter 10 positive numbers please:");
			
			if (sc.hasNextInt()) {
				
				for (int n = 1; n <= 10; n++) {
				
					numbers.add(sc.nextInt());
				
				}	
				
				System.out.println(numbers);
				
				System.out.println("Do you want to enter another 10 numbers?");
				System.out.println("Enter 0 to finish the program or enter another number to continue:");
				
				int finish = sc.nextInt();
				
				if (finish < 1) {
					
					loop = 1;
					
				}
				
			}
			
			else {
				
				System.out.println("Wrong, enter a positive number please:");
				
				sc.nextLine();
				
			}
		
		}
		
	}
	
}