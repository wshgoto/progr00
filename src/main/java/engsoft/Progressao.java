package engsoft;

import java.util.List;

public abstract class Progressao {

    public Progressao() {
    }

   
    public Progressao(int first) {
    	prog.add(first);
    }

    
    public abstract int inicia();

    
    public abstract int proxTermo();

    
    public abstract int iesimoTermo(int i);


    public abstract String imprimeProgressao(int n);
}