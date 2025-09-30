package avaliacao1;

public class livro {

    private String autor;
    private String descricao;

    public livro(String autor, String descricao) {
        this.autor = autor;
        this.descricao = descricao;
    }

    public String getAutor() {
        return autor;
    }

    public String getDescricao() {
        return descricao;
    }
}
