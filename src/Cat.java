public class Cat {

    private int age;
    private String name;
    private String color;

    public Cat(int ageCat, String nameCat, String colorCat) {
        this.age = ageCat;
        this.name = nameCat;
        this.color = colorCat;
    }

    public void bark() {
        System.out.println(name + ":" + " " + "Мяу! Мяу!");
    }

    public void move() {
        System.out.println(name + ":" + " " + "Трется об ноги!");
    }

    public void go() {
        System.out.println(name + ":" + " " + "Свернулся клубочком и мурчит!");
    }
}
