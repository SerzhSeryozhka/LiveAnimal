package KSA;

public class Dog extends LittleAnimalOrPet implements ILoud{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void loud() {
        ILoud.super.loud();
    }

    @Override
    public String avoid() {
        return "Расхаживает виляя хвостом! ";
    }

    @Override
    public String say() {
        return "Гр-р-р-р, гав! ";

    }

    @Override
    public String toString() {
        return "Dog{" + name + '}';
    }
}
