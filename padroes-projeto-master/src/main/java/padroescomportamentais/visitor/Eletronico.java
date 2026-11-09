package padroescomportamentais.visitor;

public class Eletronico implements Produto {

    private int codigo;
    private String nome;
    private String marca;

    public Eletronico(int codigo, String nome, String marca) {
        this.codigo = codigo;
        this.nome = nome;
        this.marca = marca;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirEletronico(this);
    }

}
