package Ex13;

class Animal {
    public void fazerSom() {
        System.out.println("O animal faz um som.");
    }
}
class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("O cachorro faz: AuAu");
    }
}
class Gato extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("O gato faz: Miau");
    }
}