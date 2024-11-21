package Ex19;

public class TesteLoja {
 public static void main(String[] args) {
     Loja loja = new Loja();
     double precoSemDesconto = loja.calcularPreco(100, 3);  
     System.out.println("Preço sem desconto: R$" + precoSemDesconto);
     double precoComDesconto = loja.calcularPreco(100, 3, 10);  
     System.out.println("Preço com desconto de 10%: R$" + precoComDesconto);
 }
}
