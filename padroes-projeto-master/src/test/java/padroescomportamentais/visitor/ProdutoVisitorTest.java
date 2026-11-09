package padroescomportamentais.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoVisitorTest {

    @Test
    void deveExibirLivro() {
        Livro livro = new Livro(1, "Clean Code", new Categoria("Programação"));

        ProdutoVisitor visitor = new ProdutoVisitor();
        assertEquals("Livro{codigo=1, titulo='Clean Code', categoria=Programação}", visitor.exibir(livro));
    }

    @Test
    void deveExibirEletronico() {
        Eletronico eletronico = new Eletronico(1, "Notebook", "Dell");

        ProdutoVisitor visitor = new ProdutoVisitor();
        assertEquals("Eletronico{codigo=1, nome='Notebook', marca='Dell'}", visitor.exibir(eletronico));
    }

    @Test
    void deveExibirAlimento() {
        Alimento alimento = new Alimento(1, "Arroz", 25.5f);

        ProdutoVisitor visitor = new ProdutoVisitor();
        assertEquals("Alimento{codigo=1, nome='Arroz', preco=25.5}", visitor.exibir(alimento));
    }

}