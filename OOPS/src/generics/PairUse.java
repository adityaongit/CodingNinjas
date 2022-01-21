package generics;

public class PairUse {
	public static void main(String[] args) {
		Pair<String> p = new Pair<String>("ab", "cd");
		p.setFirst("def");
	}
}
