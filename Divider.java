public class Divider {
	
	public static void main(String[] args) {
		System.out.println("Please enter numbers to divide:");
		String a = System.console().readLine();
		String b = System.console().readLine();
		int x = Integer.parseInt(a);
		int y = Integer.parseInt(b);
		int z = 0;
		int w = 0;
		int v = x;
		while (v > 0) {
			if (v >= y ) {
				v -= y;
				w++;
			} else {
				z = v;
				break;
			}
		}
		System.out.println(x + " divided by " + y + " is " + w + " remainder " + v);
	}
	
}