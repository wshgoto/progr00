package engsoft;

public class ProgressaoAritmetica extends Progressao {
    private int first;
    private int current;
    private int addition;

    public ProgressaoAritmetica() {
        this.first = 0;
        this.addition = 1;
        current = first;
    }

    public ProgressaoAritmetica(int addition) {
        this.first = 0;
        this.addition = addition;
        current = first;
    }

    public int inicia() {
        return first;
    }

    public int proxTermo() {
        current += addition;
        return current;
    }

    public int iesimoTermo(int i) {
        return first + (i) * addition;
    }

    public String imprimeProgressao(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(first + i * addition);
            sb.append(" ");
        }
        sb.append(first + n * addition).append("\n");
        return sb.toString();
    }
}