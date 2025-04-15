package designpattern.factory;

public class GameFactory {
    public Game createGame(GameType type) {
        return switch (type) {
            case PC -> new PCGame();
            case MOBILE -> new MobileGame();
        };
    }
}
