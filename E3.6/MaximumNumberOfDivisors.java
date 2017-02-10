import java.util.ArrayList;

public class MaximumNumberOfDivisors {

	public static void main(String[] args) {
		System.out.println("Among integers between 1 and 10000,");
		System.out.print("The maximum number of divisors was ");
		ArrayList<Integer> result = arrayOfNumbersWithTheMaxDivisors();
		System.out.println("Numbers with that many divisors includes :");
		for(int i=0; i<result.size();i++){
			System.out.println(result.get(i));
		}
	}
	
	public static int countDivisors(int n){
		int counter = 0;
		for (int number = 1; number <= n; number++){
			if (n % number == 0) counter++;
		}
		return counter;
	}
	
	public static ArrayList<Integer> arrayOfNumbersWithTheMaxDivisors(){
		ArrayList<Integer> liste = new ArrayList<Integer>();
		int max = 0;
		for (int number = 0; number <= 10000; number++){
			int numberDivisors = countDivisors(number);
			if (numberDivisors > max){
				max=numberDivisors;
				liste = new ArrayList<Integer>();
				liste.add(number);
			} else if(numberDivisors==max){
				liste.add(number);
			}
		}
		System.out.println(max);
		return liste;
	}	
	
}
