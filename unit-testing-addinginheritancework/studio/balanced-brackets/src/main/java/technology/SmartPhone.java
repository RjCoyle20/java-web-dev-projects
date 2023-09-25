package technology;

public class SmartPhone extends Computer{

    private boolean iChat;

    public SmartPhone(String aOS, String aProcessor){
        super(aOS, aProcessor);
    }

    public String elitistChatter() {
        if (super.getOs() == "Apple") {
            iChat = true;
            super.setEntertainmentValue(1000001);
            return "Psh, why are my bubbles green? Ew..";
        } else {
            iChat = false;
            super.setEntertainmentValue(1000000);
            return "They laughed at what message? 🤷";
        }
    }
}
