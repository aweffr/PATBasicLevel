package reader;

public class ArrayToString {
	public static String toString(int[] a) {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < a.length; i++) {
			s.append(a[i]+" ");
		}
		s.deleteCharAt(s.length()-1);
		return s.toString();
	}
	
	public static void main(String[] args) {
		int[] a = new int[20];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (100*Math.random());
		}
		System.out.print(toString(a));
	}
}
