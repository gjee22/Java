package designpattern.factory;

abstract class Game {
    protected GameType type;

    public GameType getType() {
        return type;
    }
}
