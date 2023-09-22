package engsoft;

public class ProgressaoAritmetica extends Progressao {
    private int current;
    private int addition;

    public ProgressaoAritmetica() {
        super(0);
        this.addition = 1;
        this.current = inicia();
    }

    public ProgressaoAritmetica(int addition) {
        super(0);
        this.addition = addition;
        this.current = inicia();
    }

    public int proxTermo() {//o proximo termo da PA sempre é a soma do anterior + adição
        current += addition;
        return current;
    }

    public int iesimoTermo(int i) {
        return inicia() + (i) * addition;
    }
}