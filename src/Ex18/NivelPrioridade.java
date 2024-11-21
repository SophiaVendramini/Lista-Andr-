package Ex18;

public enum NivelPrioridade {
 BAIXO(1),   
 MEDIO(2),    
 ALTO(3),     
 URGENTE(4);  

 private final int codigo;

 NivelPrioridade(int codigo) {
     this.codigo = codigo;
 }
 public int getCodigo() {
     return this.codigo;
 }
 public void exibirDetalhes() {
     System.out.println("Nível de Prioridade: " + this.name() + ", Código: " + this.codigo);
 }
}
