package designpattern.singleton;

class Singleton {

    private String attr = "Is this a singleton?";

    private static class SingletonHolder {
        //  변경되지 않게 파이널 선언
        private static final Singleton INSTANCE = new Singleton();
    }

    // Singleton
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
