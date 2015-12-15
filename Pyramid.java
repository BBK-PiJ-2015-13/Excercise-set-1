public class Pyramid {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			System.out.println(Pyraprint(i));
		}
	}
	
	public static String Pyraprint(int y) {
		String z = "";
		for (int x = 0; x < y; x++) {
			z += Integer.toString(y);
			}
		return z;
	}

}