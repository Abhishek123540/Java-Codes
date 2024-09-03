class Animal{
    public void makeSound(){
        System.out.println("Animal sound");
    }
}
class Dog extends Animal{
    public void makeSound(){
        System.out.println("WOOF!");
    }
}
public class RuntimePolymorphismMethodOverriding {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Dog dog = new Dog();
        animal.makeSound();
        dog.makeSound();
        Animal animale = new Animal();
        animale.makeSound();
    }
}
