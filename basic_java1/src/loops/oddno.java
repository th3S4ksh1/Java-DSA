package loops;

public class oddno {

	public static void main(String[] args) {
		// print all odd no. divisible by 3 between 1 to 100
		
		for (int i =1;i<=100;i++) {
			if(i%3==0 && i%2==1) {
				System.out.println(i);
			}
		}

	}
	

}
