package Ex16;
public class Processador {
 private String modelo;
 private double frequencia; 
 private int nucleos;

 public Processador(String modelo, double frequencia, int nucleos) {
     this.modelo = modelo;
     this.frequencia = frequencia;
     this.nucleos = nucleos;
 }

 public void exibirDetalhes() {
     System.out.println("Processador: " + this.modelo);
     System.out.println("Frequência: " + this.frequencia + " GHz");
     System.out.println("Número de Núcleos: " + this.nucleos);
 }
}
