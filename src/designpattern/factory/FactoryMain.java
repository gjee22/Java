package designpattern.factory;

public class FactoryMain {
    public static void main(String[] args) {
        GameFactory gameFactory = new GameFactory();
        Game pc = gameFactory.createGame(GameType.PC);
        Game mobile = gameFactory.createGame(GameType.MOBILE);
        System.out.println(pc.getType()); // PC
        System.out.println(mobile.getType()); // MOBILE
    }
}
