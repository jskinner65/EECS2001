
public class q2 {

	public static boolean parseLoop(String str) {
		String s = str;
		while (true) {

			if (str.equals("A")) {
				System.out.println("TRUE: "+s + " is a valid string.");
				return true;
			} else if (str.equals("Ab")) {
				System.out.println("TRUE: "+s + " is a valid string.");
				return true;
			} else if (str.length() < 2) {
				System.out.println("FALSE: "+s + " is NOT a valid String.");
				return false;
			} else if (str.substring(0, 2).equals("Aa")) {
				str = str.substring(2);
			} else {
				System.out.println("FALSE: "+s + " is NOT a valid String.");
				return false;
			}
		}
	}

	public static void main(String[] args) {
		q2.parseLoop("AaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAb");
		q2.parseLoop("AaAaAaAA");
		q2.parseLoop("AaAaAaA");
		q2.parseLoop("bb");
		q2.parseLoop("");
	}
}
