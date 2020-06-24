/**
 * Generate a good hash function for a String
 * 
 * @author Sri
 *
 */
public class HashFunction {
	public static int hash(String str) {
		char[] ch = str.toCharArray();
		int hash = 0, x = 53;
		for (int i = 0; i < ch.length; i++) {
			hash = hash * x + ch[i];
		}
		return hash;
	}

	public static void main(String[] args) {
		String test = "goat";
		System.out.println(hash(test));
	}
}