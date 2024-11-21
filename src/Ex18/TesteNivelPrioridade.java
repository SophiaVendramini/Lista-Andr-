package Ex18;

public class TesteNivelPrioridade {
 public static void main(String[] args) {
 
     for (NivelPrioridade prioridade : NivelPrioridade.values()) {
         prioridade.exibirDetalhes();
     }
 }
}
