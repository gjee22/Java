package designpattern.singleton;

class Singleton {

    private String attr = "Is this a singleton?";

    private static class SingletonHolder {
        //  변경되지 않게 파이널 선언
        private static final Singleton INSTANCE = new Singleton();
    }

    // Singleton 인스턴스를 다음 메소드를 통해서만 받을 수 있게 함
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public String getAttr() {
        return this.attr;
    }

    public void setAttr(String str) {
        this.attr = str;
    }
}
