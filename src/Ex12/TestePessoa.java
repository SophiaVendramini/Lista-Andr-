package Ex12;

public class TestePessoa {
    public static void main(String[] args) {
 
        Pessoa pessoa1 = new Pessoa("João", 25);
        Pessoa pessoa2 = new Pessoa("Maria", 30);

        System.out.println("Detalhes da Pessoa 1:");
        pessoa1.exibirDetalhes();
        System.out.println();

        System.out.println("Detalhes da Pessoa 2:");
        pessoa2.exibirDetalhes();
    }
}