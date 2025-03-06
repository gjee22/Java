package inheritance;

public class Inheritance {
    public static void main(String[] args) {
        ClassA a = new ClassB();
        a.poly();
        ((ClassB) a).notInA();
        System.out.println(a.a);
        System.out.println(((ClassB) a).a);
    }
}
