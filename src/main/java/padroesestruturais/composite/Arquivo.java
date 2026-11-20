package padroesestruturais.composite;

public class Arquivo extends ElementoArquivo {

    private int tamanhoKB;

    public Arquivo(String nome, int tamanhoKB) {
        super(nome);
        this.tamanhoKB = tamanhoKB;
    }

    public int getTamanhoKB() {
        return tamanhoKB;
    }

    public void setTamanhoKB(int tamanhoKB) {
        this.tamanhoKB = tamanhoKB;
    }

    public String getEstrutura() {
        return "Arquivo: " + this.getNome() + " - tamanho: " + this.tamanhoKB + " KB\n";
    }
}
