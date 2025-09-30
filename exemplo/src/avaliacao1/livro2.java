package avaliacao1;

public class livro2 {
    public static void main(String[] args) {
        
        livro meuLivro = new livro("Machado de Assis", "Dom Casmurro é um romance brasileiro clássico.");

        System.out.println("Autor: " + meuLivro.getAutor());
        System.out.println("Descrição: " + meuLivro.getDescricao());
    }
}
