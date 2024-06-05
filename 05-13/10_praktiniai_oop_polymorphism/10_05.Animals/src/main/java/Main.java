
public class Main {

    public static void main(String[] args) {
        // you can test how your classes work here

        Cat car = new Cat();
        car.eat();
        car.sleep();
        Dog dor = new Dog("dor");
        dor.sleep();
        dor.eat();

    NoiseCapable dog = new Dog();
    dog.makeNoise();

    NoiseCapable cat = new Cat("Garfield");
    cat.makeNoise();
    Cat c = new Cat();
    c.purr();
    }

}
