import java.util.Scanner;
public class Calc {
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			System.out.println("Which method would you like");
			String x = scanner.nextLine();

			System.out.println("Input numbers");
			int a = scanner.nextInt();
			int b = scanner.nextInt();


			if(x.equals("multiplication")) {
				System.out.println(mult(a,b));
			}
			else if (x.equals("division")){
				System.out.println(div(a,b));
			}
			else if (x.equals("subtraction")) {
				System.out.println(sub(a,b));
			}
			else {
				System.out.println(add(a,b));
			}			
		}
		public static double mult(int a,int b) {

			double mult = (a * b);
			return mult;
		}
		public static double div(int a, int b) {

			double div = (a / b);
			return div;
		}
		public static double sub(int a, int b) {

			double sub = (a - b);
			return sub;
		}
		public static double add(int a, int b) {

			double add = (a + b);
			return add;
		}
	}


