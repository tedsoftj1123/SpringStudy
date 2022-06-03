package Interface;

public class IntefaceImpl implements InterfaceExample{
    private int volume;

    public void turnOn() {
        System.out.println("turn on tv");
    }
    public void turnOff() {
        System.out.println("turn off tv");
    }

    public void setVolume(int volume) {
        if(volume>InterfaceExample.MAX_VOLUME){
            this.volume = InterfaceExample.MAX_VOLUME;
        } else if(volume<InterfaceExample.MIN_VOLUME){
            this.volume = InterfaceExample.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("volume : " + this.volume);
    }
}
