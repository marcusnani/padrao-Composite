package padroesestruturais.composite;

public abstract class ElementoArquivo {

    private String nome;

    public ElementoArquivo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract String getEstrutura();
}
