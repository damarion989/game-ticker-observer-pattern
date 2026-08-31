public class Main {
    public static void main(String[] args) {
        GameTicker ticker = new GameTicker();

        MobilePushNotification pushNotification = new MobilePushNotification(ticker);
        StadiumDisplay stadiumDisplay = new StadiumDisplay(ticker);
        SocialMediaBot socialMediaBot = new SocialMediaBot(ticker);

        ticker.register(pushNotification);
        ticker.register(stadiumDisplay);
        ticker.register(socialMediaBot);

        System.out.println("--- Simulating Game Event ---");
        ticker.addUpdate("Touchdown! Home team scores!");

        System.out.println("\n--- Another Update ---");
        ticker.addUpdate("Halftime score: 21-14");
    }
}
