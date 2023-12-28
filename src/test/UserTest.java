package test;

public class UserTest {

	public static void main(String[] args) {
		new UserTest().compare();
	}

	private void compare() {
		User a = new User("j", "Lee");
		User b = new User("j", "Lee");
		User c = a;
		//System.out.println(a);
		//System.out.println(b);
		
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a.equals(b));

	}

	public class User {
		private String firstNam;
		private String lastName;

		public User(String firstName, String lastName) {
			this.firstNam = new String(firstName);
			this.lastName = new String(lastName);
		}

		public boolean equals(User o) {
			System.out.println("여기");
			
			//System.out.println(match(firstNam, o.firstNam));
			//System.out.println(match(lastName, o.lastName));
			
			return match(firstNam, o.firstNam) || match(lastName, o.lastName);
		}

		private boolean match(String p1, String p2) {
			System.out.println(p1 == p2);
			System.out.println(p1);

			//System.out.println("불리언" + p1.equals(p2));
			
			
			return p1 == p2 && p1.equals(p2);
		}
	}

}
