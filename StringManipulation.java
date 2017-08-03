import java.util.Scanner;
public class StringManipulation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int noOfChar = s.replaceAll(" ", "").length();
		System.out.println("The String Contains: "+noOfChar+" Characters");
		int len = s.length();
		System.out.println("Reversed String is: ");
		for(int i = len-1; i>=0; i--)
			System.out.print(s.charAt(i));
		System.out.println();
		int no = 1;
		for(int i = 0; i< len; i++){
			if(s.charAt(i)==' ')
				no++;
		}
		System.out.println("The String Contains "+no+" Words");
		String[] words = s.split(" ");

		for (String word : words) {
		  System.out.println("Length of "+word + " is: " + word.length());
		}
		in.close();
	}

}
