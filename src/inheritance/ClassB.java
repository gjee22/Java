package inheritance;

public class ClassB extends ClassA {

    int a = 1;

    public ClassB() {
    }

    public ClassB(int a) {
        super(); //기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a="+a);
    }

    public ClassB(int a, int b) {
        super(); //기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a="+a + " b=" + b);
    }

    @Override
    public void poly() {
        System.out.println("Class B");
    }

    public void notInA() {
        System.out.println("Doesn't work if not ClassB");
    }
}
