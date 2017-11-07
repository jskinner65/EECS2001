
public class Parsing {

	public static boolean getTerm(String s) {
		if (s.length()==0) {
			System.out.println("ERROR! END OF STRING");
		}
		for (int i = 0; i<s.length(); i++){
			if (s.charAt(i)==("+".charAt(0))){
				getFactor(s.substring(0, i));
				getFactor(s.substring(i+1));
				
			}
			else if (s.charAt(i)==("*".charAt(0))){
				getTerm(s.substring(0, i));
				getTerm(s.substring(i+1));
				
			}
		
		}
		System.out.println(s);
		return true;
	}

	public static boolean getFactor(String s) {
		for (int i = 0; i<s.length(); i++){
			if (s.charAt(i)==("*".charAt(0))){
				getTerm(s.substring(0, i));
				getTerm(s.substring(i+1));
				
			}
		}
		return true;
	}

	public static boolean getExp(String s) {
		if (s.length()==0) {
			System.out.println("ERROR! END OF STRING");
		}
		for (int i = 0; i<s.length(); i++){
			if (s.charAt(i)==("+".charAt(0))){
				getFactor(s.substring(0, i));
				getFactor(s.substring(i+1));
				
			}
		}
		return true;
	}

	public static void main(String[] args) {

		String s = "6*8+5*12+987*655+7*123+15*54";
		System.out.println(getExp(s));

	}
}
