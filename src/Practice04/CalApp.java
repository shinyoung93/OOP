package Practice04;

import java.util.Scanner;

public class CalApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print(">> ");
			String cal = sc.nextLine();
			if ("/q".equals(cal)) {
				System.out.println("종료 합니다.");
				break;
			} else {

				String[] calnum = cal.split(" ");

				int a = Integer.parseInt(calnum[0]);
				int b = Integer.parseInt(calnum[2]);

				if (("+".equals(calnum[1]))) {
					Add.setValue(a, b);
					Add.calculate();
				} else if (("-".equals(calnum[1]))) {
					Sub sb = new Sub();
					sb.setValue(a, b);
					sb.calculate();
				} else if (("*".equals(calnum[1]))) {
					Mul ml = new Mul();
					ml.setValue(a, b);
					ml.calculate();

				} else if (("/".equals(calnum[1]))) {
					Div dv = new Div();
					dv.setValue(a, b);
					dv.calculate();

				} else {
					System.out.println("알 수 없는 연산입니다.");
				}
			}
		}
		sc.close();
	}
}
