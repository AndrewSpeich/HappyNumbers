import java.util.ArrayList;

public class Iteration {

	public ArrayList<Integer> separate(int happynumber){
		ArrayList<Integer> numba = new ArrayList<>();
		String number = String.valueOf(happynumber);
		for(int i = 0; i< number.length(); i++ ){
			
			numba.add( (happynumber % 10));
			happynumber /= 10;
		}
		return numba;
	}
	public int performMath(ArrayList<Integer> numbers){
		int total = 0;
		for(int i = 0; numbers.size()> i; i++){
			
			total += numbers.get(i)*numbers.get(i); 
	
		}
		return total;
	}	
	public boolean checkForUnhappiness(int number){
		int[] unhappy = {4,16,37,58,89,145,42,20};
		boolean nosmile = false;
			for(int i: unhappy ){
				if(i == number){
					nosmile = true;
				}
			
			
		}
		return nosmile;
	}
	public boolean checkNumber(int number){
		return checkIterations(number);
	}
	private boolean checkIterations(int number) {
		boolean nosmile = false;
		int numberafter = number;
			while( !(numberafter == 1) && !nosmile){
				
				numberafter = performMath(separate(numberafter));
				nosmile = checkForUnhappiness(numberafter);
		}
		return !nosmile;
	}
}
