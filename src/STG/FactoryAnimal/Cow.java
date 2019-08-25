package STG.FactoryAnimal;

public class Cow extends Animal {

    public Cow() {
        super(true, false);
    }

    public String getGreeting(){

        return "moo";

    }
}
