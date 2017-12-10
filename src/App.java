public class App {

    public static void main(String[] args) {
        Dog dog = new Dog(4,"Барсик", "Серый");
        Cat cat = new Cat(2, "Мурка", "Белый");
        Man man = new Man(23,"Коля", cat);
        Woman woman = new Woman(17, "Вика", dog);

        man.voice();
        cat.bark();
        woman.voice();
        dog.bark();
        man.eat();
        cat.move();
        woman.move();
        dog.move();
        man.move();
        cat.go();
        woman.game();
        dog.go();
    }
}
