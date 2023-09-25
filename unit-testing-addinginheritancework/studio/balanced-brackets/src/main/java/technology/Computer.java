package technology;

public class Computer extends AbstractEntity {

    private int batteryRemaining;

    private String os;

    private String processor;

    private int entertainmentValue;

    //CONSTRUCTORS

    public Computer(String os, String processor, int batteryRemaining) {
        this.os = os;
        this.processor = processor;
        this.batteryRemaining = batteryRemaining;
    }

    public Computer (String os, String processor) {
        this.os = os;
        this.processor = processor;
        batteryRemaining = 100;
    }

    public Computer (){batteryRemaining = 100;}
/****** GETTERS AND SETTERS ******/


    public int getBatteryRemaining() {
        return batteryRemaining;
    }

    public void setBatteryRemaining(int batteryRemaining) {
        this.batteryRemaining = batteryRemaining;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getEntertainmentValue() {
        return entertainmentValue;
    }

    public void setEntertainmentValue(int entertainmentValue) {
        this.entertainmentValue = entertainmentValue;
    }

    /***** INSTANCE METHODS *****/


    //Uses full battery

    public void useUpBattery(){
        batteryRemaining = 0;
        entertainmentValue = 1000;
    }

    public void chargeBattery(){
        batteryRemaining = 100;
        entertainmentValue = 0;
    }


}
