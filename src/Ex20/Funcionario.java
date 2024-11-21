package Ex20;

public class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return this.nome;
    }

    public double calcularSalario() {
        return this.salarioBase;
    }

    public void exibirInformacoes() {
        System.out.println("Funcionário: " + this.nome);
        System.out.println("Salário: R$ " + calcularSalario());
    }
}
