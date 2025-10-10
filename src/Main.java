public class Main {

    public static void main(String[] args) {
        StaticLifetime obj1 = new StaticLifetime();
        StaticLifetime obj2 = new StaticLifetime();

        obj1.incrementCounter();
        obj2.incrementCounter();


    }
}