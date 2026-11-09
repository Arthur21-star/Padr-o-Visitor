package padroescomportamentais.visitor;

public class ProdutoVisitor implements Visitor {

    public String exibir(Produto produto) {
        return produto.aceitar(this);
    }

    @Override
    public String exibirLivro(Livro livro) {
        return "Livro{" +
                "codigo=" + livro.getCodigo() +
                ", titulo='" + livro.getTitulo() + '\'' +
                ", categoria=" + livro.getNomeCategoria() +
                '}';
    }

    @Override
    public String exibirEletronico(Eletronico eletronico) {
        return "Eletronico{" +
                "codigo=" + eletronico.getCodigo() +
                ", nome='" + eletronico.getNome() + '\'' +
                ", marca='" + eletronico.getMarca() + '\'' +
                '}';
    }

    @Override
    public String exibirAlimento(Alimento alimento) {
        return "Alimento{" +
                "codigo=" + alimento.getCodigo() +
                ", nome='" + alimento.getNome() + '\'' +
                ", preco=" + alimento.getPreco() +
                '}';
    }
}
