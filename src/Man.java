public class Man {

    private int age;
    private String name;
    private Cat cat;

    public Man(int age, String name, Cat cat) {
        this.age = age;
        this.name = name;
        this.cat = cat;

    }

    public void voice() {
        System.out.println(name+":" + " " + "Голос");
    }

    public void eat() {
        System.out.println(name+":" + " " + "Покормил");
    }

    public void move() {
        System.out.println(name+":" + " " + "Погладил");
    }
}

