package padroescomportamentais.visitor;

public interface Visitor {

    String exibirLivro(Livro livro);
    String exibirEletronico(Eletronico eletronico);
    String exibirAlimento(Alimento alimento);

}
