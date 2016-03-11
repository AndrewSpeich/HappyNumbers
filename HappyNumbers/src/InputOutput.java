import java.util.Scanner;

public class InputOutput {
	Scanner input;
	Iteration math;
	public InputOutput(){
		 math = new Iteration();
		 input = new Scanner(System.in);
		
	}
	
	public int inputNumber(){
		System.out.println("how far from 1 would you like to check for happy numbers?");
		return input.nextInt();
	}
	public void outputHappiness(){
		int end = inputNumber();
		for(int i = 1; i <= end ; i++){
			System.out.print(i+", ");
			System.out.println(math.checkNumber(i));
		}
	}
}
