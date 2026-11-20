package padroesestruturais.composite;

import java.util.ArrayList;
import java.util.List;

public class Pasta extends ElementoArquivo {

    private List<ElementoArquivo> elementos;

    public Pasta(String nome) {
        super(nome);
        this.elementos = new ArrayList<ElementoArquivo>();
    }

    public void addElemento(ElementoArquivo elemento) {
        this.elementos.add(elemento);
    }

    public String getEstrutura() {
        String saida = "";
        saida = "Pasta: " + this.getNome() + "\n";
        for (ElementoArquivo elemento : elementos) {
            saida += elemento.getEstrutura();
        }
        return saida;
    }
}
