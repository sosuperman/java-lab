import java.util.Scanner;

public class Sum {
	int add(int a, int b){
		return a+b;
	}
	float add(int a, float b){
		return ((float)a+b);
	}
	float add(float a, int b){
		return (a+(float)b);
	}
	double add(int a, float b, double c){
		return ((double)a+ (double)b+ c);
	}
}

class SumMain{
	public static void main(String...args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your choice.");
		System.out.println("1. To add two integers.");
		System.out.println("2. To add one integer and one float.");
		System.out.println("3. To add one float and integer.");
		System.out.println("4. To add one integer, one float and one double.");
		int choice = in.nextInt();
		Sum ob = new Sum();
		switch(choice){
		case 1: System.out.println("Enter two integer.");
				int a = in.nextInt();
				int b = in.nextInt();
				System.out.println(ob.add(a, b));
				break;
		case 2: System.out.println("Enter one integer and one float.");
				int a1 = in.nextInt();
				float b1 = in.nextFloat();
				System.out.println(ob.add(a1, b1));
				break;
		case 3: System.out.println("Enter one float and one integer.");
				float b2 = in.nextFloat();
				int a2 = in.nextInt();
				System.out.println(ob.add(a2, b2));
				break;
		case 4: System.out.println("Enter one integer, one float and one double.");
				int a3 = in.nextInt();
				float b3 = in.nextFloat();
				double c3 = in.nextDouble();
				System.out.println(ob.add(a3, b3, c3));
				break;
		}
		in.close();
	}
}
