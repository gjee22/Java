package designpattern.singleton;

public class SingletonMain {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        NotSingleton n1 = new NotSingleton();
        NotSingleton n2 = new NotSingleton();

        System.out.println(s1.getAttr()); // Is this a singleton?
        System.out.println(s2.getAttr()); // Is this a singleton?
        System.out.println(n1.getAttr()); // Is this a singleton?
        System.out.println(n2.getAttr()); // Is this a singleton?

        s1.setAttr("Yes, it is.");
        n1.setAttr("No, it isn't");

        System.out.println(s1.getAttr()); // Yes, it is.
        System.out.println(s2.getAttr()); // Yes, it is.
        System.out.println(n1.getAttr()); // No, it isn't.
        System.out.println(n2.getAttr()); // Is this a singleton?
    }
}
