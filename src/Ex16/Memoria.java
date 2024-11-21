package Ex16;
public class Memoria {
 private int capacidade;  
 private String tipo;

 public Memoria(int capacidade, String tipo) {
     this.capacidade = capacidade;
     this.tipo = tipo;
 }

 public void exibirDetalhes() {
     System.out.println("Memória: " + this.capacidade + " GB");
     System.out.println("Tipo de Memória: " + this.tipo);
 }
}
