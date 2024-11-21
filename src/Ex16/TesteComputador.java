package Ex16;

public class TesteComputador {
 public static void main(String[] args) {
     Processador processador = new Processador("Intel Core i7", 3.5, 8);
     Memoria memoria = new Memoria(16, "DDR4");
     Computador computador = new Computador(processador, memoria);

     computador.exibirDetalhes();
 }
}
