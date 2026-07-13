package loops;

public class alpha_ascii {

	public static void main(String[] args) {
		// question is print alphabets with ASCII values
		int n=65;
		for (n=65;n<=90;n++) {
			char ch = (char)n;
					System.out.println(ch + " " + n);
		}
	}

}
