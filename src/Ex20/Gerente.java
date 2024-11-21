package Ex20;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase); 
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + this.bonus; 
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Gerente: " + getNome()); 
        System.out.println("Salário: R$ " + calcularSalario());
    }
}
