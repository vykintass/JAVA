package lt.techin.oop;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("blaxck", 11, false);
        System.out.println(animal.getDescription());

        Bird bird =new Bird();
        System.out.println(bird.getDescription());

        Dog dog = new Dog();
        System.out.println(dog.getDescription());
    }
}
