public class Dog {

    private int age;
    private String name;
    private String color;

    public Dog(int ageDog, String nameDog, String colorDog) {
        this.age = ageDog;
        this.name = nameDog;
        this.color = colorDog;
    }

    public void bark() {
        System.out.println(name+":" + " " + "Гав! Гав!");
    }

    public void move() {
        System.out.println(name+":" + " " + "Веляет хвостом!");
    }

    public void go() {
        System.out.println(name+":" + " " + "Бежит за палкой!");
    }
}
