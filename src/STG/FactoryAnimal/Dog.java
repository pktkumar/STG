package STG.FactoryAnimal;

public class Dog extends Animal {

    public Dog() {
        super(true, false);
    }

    @Override
    public String getGreeting(){
        return "ruff";
    }

}
