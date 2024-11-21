package Ex13;

public class TesteAnimal {
    public static void main(String[] args) {
        Animal animal1 = new Cachorro(); 
        Animal animal2 = new Gato();      
        
        System.out.println("Som do animal 1:");
        animal1.fazerSom();  
        System.out.println();

        System.out.println("Som do animal 2:");
        animal2.fazerSom(); 
    }
}