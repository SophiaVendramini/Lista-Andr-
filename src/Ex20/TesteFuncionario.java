package Ex20;

public class TesteFuncionario {
 public static void main(String[] args) {

     Funcionario funcionario = new Funcionario("João", 3000);
     funcionario.exibirInformacoes();  

     System.out.println();
     Gerente gerente = new Gerente("Maria", 5000, 1500);
     gerente.exibirInformacoes();  
 }
}
