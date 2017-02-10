import java.util.Scanner;

/**
 * @author lejema160
 *
 */
public class BreakYourWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String a = getInput();
		breakWords(a);
	}
	
	/**
	 * @return str
	 */
	public static String getInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir des mots :");
		String str = sc.nextLine();
		return str;
	}
	
	/**
	 * @param str
	 */
	public static void breakWords(String str){
		String[] parts = str.split(" ");
		int n = parts.length;
		for(int i=0; i<n; i++){
			System.out.println(parts[i]);
		}
	}

}
