package STG.FactoryAnimal;

public class AnimalDemo {

    public static void main(String[] agrs){

        Animal dog = new Dog();
        dog.printAnimal("dog");

        Animal cow = new Cow();
        cow.printAnimal("cow");
        Animal duck = new Duck();
        duck.printAnimal("duck");


    }

}
