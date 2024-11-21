package Ex11;

public class TesteLivro {
    public static void main(String[] args) {
   
        Livro livro1 = new Livro("Bananas de Pijamas", "Helen Harris", 500);
        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis", 500);

        System.out.println("Detalhes do Livro 1:");
        livro1.exibirDetalhes();
        System.out.println();

        System.out.println("Detalhes do Livro 2:");
        livro2.exibirDetalhes();
    }
}