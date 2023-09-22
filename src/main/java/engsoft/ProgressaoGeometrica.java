package engsoft;

public class ProgressaoGeometrica extends Progressao {
    private int first;
    private int current;
    private int addition;

    public ProgressaoGeometrica() {
        this.first = 1;
        this.addition = 2;
        this.current = first;
    }

    public ProgressaoGeometrica (int addition) {
        this.first = 1;
        this.addition = addition;
        this.current = first;
    }

    public int inicia() {
        return first;
    }

    public int proxTermo() {
        current = addition * current;
        return current;
    }

    public int iesimoTermo(int i) {
        return first * potenciamento(i);
    }
    
    private int potenciamento(int i) {
    	int Result = (int) Math.pow(addition, i);
    	return Result;
    }

    public String imprimeProgressao(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(first * potenciamento(i));
            sb.append(" ");
        }
        sb.append(first * potenciamento(n)).append("\n");
        return sb.toString();
    }
}