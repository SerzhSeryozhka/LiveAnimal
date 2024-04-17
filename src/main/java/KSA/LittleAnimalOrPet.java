package KSA;

public abstract class LittleAnimalOrPet {
    String name;

    public LittleAnimalOrPet(String name) {
        this.name = name;
    }

    public abstract String avoid();
    public abstract String say();
    public void fear(){
        System.out.println("Ух тыжЪ, эво как!!! Всплыла мысль. ");
        System.out.println("Бежит сверкая пятками!!! ");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "LittleAnimalOrPet{" +
                "name='" + name + '\'' +
                '}';
    }
}
