public class Woman {

    private int age;
    private String name;
    private Dog god;

    public Woman(int age, String name, Dog god) {
        this.age = age;
        this.name = name;
        this.god = god;
    }
    public void voice() {
        System.out.println(name+":" + " " + "Голос");
    }

    public void move() {
        System.out.println(name+":" + " " + "Погладила");
    }

    public void game() {
        System.out.println(name+":" + " " + "Кинула палку");
    }

}
