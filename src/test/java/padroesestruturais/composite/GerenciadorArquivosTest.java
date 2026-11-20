package padroesestruturais.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GerenciadorArquivosTest {

    @Test
    void deveRetornarEstruturaArquivos() {
        Pasta imagens = new Pasta("Imagens");

        Pasta documentos = new Pasta("Documentos");
        Arquivo contrato = new Arquivo("contrato.pdf", 250);
        documentos.addElemento(contrato);

        Pasta jogos = new Pasta("Jogos");
        Arquivo save1 = new Arquivo("save1.dat", 120);
        Arquivo save2 = new Arquivo("save2.dat", 90);
        jogos.addElemento(save1);
        jogos.addElemento(save2);

        Pasta principal = new Pasta("Meu Computador");
        principal.addElemento(imagens);
        principal.addElemento(documentos);
        principal.addElemento(jogos);

        GerenciadorArquivos gerenciador = new GerenciadorArquivos();
        gerenciador.setPastaPrincipal(principal);

        assertEquals("Pasta: Meu Computador\n" +
                "Pasta: Imagens\n" +
                "Pasta: Documentos\n" +
                "Arquivo: contrato.pdf - tamanho: 250 KB\n" +
                "Pasta: Jogos\n" +
                "Arquivo: save1.dat - tamanho: 120 KB\n" +
                "Arquivo: save2.dat - tamanho: 90 KB\n", gerenciador.getEstrutura());
    }

    @Test
    void deveRetornarExcecaoGerenciadorSemPastaPrincipal() {
        try {
            GerenciadorArquivos gerenciador = new GerenciadorArquivos();
            gerenciador.getEstrutura();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Gerenciador sem pasta principal", e.getMessage());
        }
    }
}
