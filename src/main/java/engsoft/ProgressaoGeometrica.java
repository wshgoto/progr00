package engsoft;

public class ProgressaoGeometrica extends Progressao {
    private int current;
    private int addition;

    public ProgressaoGeometrica() {
    	super(1);
        this.addition = 2;
        this.current = inicia();
    }

    public ProgressaoGeometrica (int addition) {
        super(1);
        this.addition = addition;
        this.current = inicia();
    }

    public int proxTermo() {
        current = addition * current;
        return current;
    }

    public int iesimoTermo(int i) {
        return inicia() * potenciamento(i);
    }
    
    private int potenciamento(int i) {
    	int Result = (int) Math.pow(addition, i);
    	return Result;
    }
}