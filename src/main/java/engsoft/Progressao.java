package engsoft;

public abstract class Progressao {

    private int first;

    public Progressao() {
    }

    public Progressao(int first) {
        this.first = first;
    }

    
    public int inicia() {
    	return first;
    };
    
    //proxTermo e iesimoTermo serão métodos que devem ser
    // implementados nas subclasses.
    
    public abstract int proxTermo();
 
    public abstract int iesimoTermo(int i);

    public String imprimeProgressao(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(iesimoTermo(i));
            sb.append(" ");
        }
        sb.append(iesimoTermo(n)).append("\n");
        return sb.toString();
    }
}