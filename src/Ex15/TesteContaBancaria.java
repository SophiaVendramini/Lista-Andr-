package Ex15;

public class TesteContaBancaria {
    public static void main(String[] args) {
    
        ContaBancaria conta = new ContaBancaria("123", 2000.00);
        System.out.println("Saldo inicial da conta " + conta.getNumero() + ": R$" + conta.getSaldo());
        conta.depositar(500.00); 
        System.out.println("Saldo após depósito: R$" + conta.getSaldo());
        
    }
}