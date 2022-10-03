package com.comarch;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Reksio";
        dog.race = "Kundel";
        System.out.println(dog.name);

        Cat cat = new Cat();
        cat.name = "Puszek";
        cat.race = "Dachowiec";

        System.out.println(cat.name);

        Snake snake = new Snake();
        snake.name = "Jan";

        Mouse mouse = new Mouse();

        String a = new String("OK");
        String b = new String("OK");

        System.out.println(a.equals(b));

        Cat cat2 = new Cat();
        cat2.name = "Puszek";
        cat2.race = "Dachowiec";

        Cat cat3 = new Cat();
        cat3.name = "Puszek";
        cat3.race = "Dachowiec";

        System.out.println(cat2.equals(cat3));

        int i1 = 5;
        int i2 = 5;

        System.out.println(i1 == i2);

        A a1 = new A();
        a1.cos = 5;
    }
}
