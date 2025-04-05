package designpattern.singleton;

public class Singleton {

    private String attr = "Is this a singleton?";

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

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
