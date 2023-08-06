package strings;

public class LengthOfLastWord {
	public static int lengthOfLastWord(String s) {
		String palabras[] = s.split(" ");
        return palabras[palabras.length-1].length();
    }
}
