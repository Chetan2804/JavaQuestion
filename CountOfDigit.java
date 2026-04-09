import java.util.Scanner;

public class CountOfDigit {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number :");

		int num = s.nextInt();

		int count = 0;

		while (num > 0) {

			num = num / 10;
			count++;

		}

		System.out.println("Number of digit is : " + count );
		System.out.println("HI");
		System.out.println("Hi Chetan");
	}

}
