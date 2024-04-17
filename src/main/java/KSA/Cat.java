package KSA;

public class Cat extends LittleAnimalOrPet implements ILoud{
    public Cat(String name) {
        super(name);
    }

    @Override
    public String avoid() {
        System.out.println("Ловко перебирает лапками! ");
        return null;
    }

    @Override
    public void say() {
        System.out.println("Мр-р-р, мя-а-а! ");
    }

    @Override
    public void setName(String name) {
        super.setName("Чижик");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
    @Override
    public void loud() {
        ILoud.super.loud();
    }
}
