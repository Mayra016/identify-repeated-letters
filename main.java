public class Main {
	public static void main(String[] args) {
		System.out.println(firstNonRepeatingLetter("streSS"));
	}
	
	public static String firstNonRepeatingLetter(String s){
        for (char letter : s.toCharArray()) {
          String withOutDoubles = s.replace(String.valueOf(letter).toLowerCase(), "");
          withOutDoubles = withOutDoubles.replace(String.valueOf(letter).toUpperCase(), "");
          if (withOutDoubles.length() == s.length() - 1) {
            return String.valueOf(letter);
          }
        }
        return "";
    }
}
