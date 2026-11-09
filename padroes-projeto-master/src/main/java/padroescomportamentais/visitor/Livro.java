package padroescomportamentais.visitor;

public class Livro implements Produto {

    private int codigo;
    private String titulo;
    private Categoria categoria;

    public Livro(int codigo, String titulo, Categoria categoria) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getNomeCategoria() {
        return this.categoria.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirLivro(this);
    }

}
