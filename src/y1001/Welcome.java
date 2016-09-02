package y1001;

public class Welcome {
	public static void main(String[] args) {
		String greeting = "Are you OK?";
		System.out.println(greeting);
		
		for (int i = 0; i < greeting.length(); i++) {
			System.out.print("=");
		}
	}
}
