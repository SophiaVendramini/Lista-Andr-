package Ex16;

public class Computador {
 private Processador processador;
 private Memoria memoria;

 public Computador(Processador processador, Memoria memoria) {
     this.processador = processador;
     this.memoria = memoria;
 }

 public void exibirDetalhes() {
     System.out.println("Características do Computador:");
     this.processador.exibirDetalhes();  
     this.memoria.exibirDetalhes();    
 }
}
