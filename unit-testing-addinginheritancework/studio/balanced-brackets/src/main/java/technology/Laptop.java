package technology;

public class Laptop extends Computer {

    boolean graphicsCard;

    public Laptop(String aOS, String aProcessor, boolean graphicsCard){
        super(aOS, aProcessor);
        this.graphicsCard = graphicsCard;
    }

    public String canPlayQualityGames(){
        if (graphicsCard) {
            super.setEntertainmentValue(100000);
            return "I'm having a ball in Baldur's Gate 3!";
        } else {
            super.setEntertainmentValue(50);
            return "Mine-Sweeper was kinda fun, huh?";
        }
    }
}
