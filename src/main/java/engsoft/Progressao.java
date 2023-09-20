package engsoft;

import java.util.List;

public abstract class Progressao {

    private int first;
    private int current;

    public Progressao() {
    	current = first;
    }

   
    public Progressao(int first) {
        this.first = 0;
        this.current = first;
    }

    
    public abstract int inicia();

    
    public abstract int proxTermo();

    
    public abstract int iesimoTermo(int i);


    public abstract String imprimeProgressao(int n);
}