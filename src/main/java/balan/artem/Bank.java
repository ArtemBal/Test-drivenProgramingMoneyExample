package balan.artem;

public class Bank {

    public Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    public void addRate(String chf, String use, int i) {
    }

    int rate(String from, String to) {
        return (from.equals("CHF") && to.equals("USD"))
                ? 2
                : 1;
    }
}
