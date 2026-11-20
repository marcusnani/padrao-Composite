package padroesestruturais.composite;

public class GerenciadorArquivos {

    private ElementoArquivo pastaPrincipal;

    public void setPastaPrincipal(ElementoArquivo pastaPrincipal) {
        this.pastaPrincipal = pastaPrincipal;
    }

    public String getEstrutura() {
        if (this.pastaPrincipal == null) {
            throw new NullPointerException("Gerenciador sem pasta principal");
        }
        return this.pastaPrincipal.getEstrutura();
    }
}
