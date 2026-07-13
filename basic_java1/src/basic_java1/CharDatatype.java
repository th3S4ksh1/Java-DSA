package basic_java1;

public class CharDatatype {

	public static void main(String[] args) {
	  char sakshi = 's';
	  System.out.println(sakshi);
	  char abc = '+';
	  System.out.println(abc);

	  
	  //TYPECASTING
	  
	  //small to big(automatic)
	  char ch = 'a';
	  int b = ch;
	  System.out.println(b);  //implicit
	  //o/p = 97
	  
	  //big to small(manually)
	  double a = 1.2; // explicit
	  int c = (int)a;
	  System.out.println(c);
	  
	  char x = '3';
	  System.out.println((int)x);
	  
	  double q = 1.2;
	  System.out.println((int)q);
	  
	  int m = 48;
	  char n = (char) m;
	  System.out.println(n);
	  
	  char h = 'A';
	  System.out.println(h+0);
	  
	}

}
