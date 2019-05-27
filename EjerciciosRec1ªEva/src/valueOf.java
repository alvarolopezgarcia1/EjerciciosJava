
public class valueOf {

	public static void main(String[] args) {

		Integer k = Integer.valueOf(Integer.parseInt("123"));
		//valueOf (String) devuelve un nuevo objeto Integer 
		Integer n = Integer.valueOf("321");
		//
		//parseInt (String) devuelve un int primitivo.
		Integer a = Integer.parseInt("123");
		
		System.out.println("k " + k + " a: " + a + " n: " + n);
		

	}
}