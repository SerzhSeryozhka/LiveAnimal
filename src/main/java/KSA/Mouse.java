package KSA;

public class Mouse extends LittleAnimalOrPet{
    public Mouse(String name) {
        super(name);
    }

    @Override
    public String avoid() {
        System.out.println("Передвигается перебежками ");
        return null;
    }

    @Override
    public void say() {
        System.out.println("Пи-пи-пи!"+" Дай еды!");
    }

    @Override
    public void setName(String name) {
        super.setName("Норушка");
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void fear() {
        super.fear();
    }
}
