package lesson.recursive;

public class fakultet {

	public static void main(String[] args) {
		for (int i = 1; i< 21; i++)
		System.out.println(i + ": "+fac(i));

}



	public static long fac(int n) {
		if(n == 1) {
			return 1;
		}
		return n * fac(n-1);
	}
}