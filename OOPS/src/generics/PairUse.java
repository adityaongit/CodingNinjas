package generics;

public class PairUse {
    Pair<String> p = new Pair<String>("ab", "cd");
    p.setFirst("def");
    String s = p.getFirst();
}
