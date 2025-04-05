package designpattern.singleton;

public class SingletonMain {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1.getAttr());
        System.out.println(s2.getAttr());

        s1.setAttr("Yes, it is.");

        System.out.println(s1.getAttr());
        System.out.println(s2.getAttr());
    }
}
