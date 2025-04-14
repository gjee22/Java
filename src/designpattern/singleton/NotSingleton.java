package designpattern.singleton;

class NotSingleton {
    private String attr = "Is this a singleton?";

    public String getAttr() {
        return this.attr;
    }

    public void setAttr(String str) {
        this.attr = str;
    }
}
