package Interface;

public interface InterfaceExample {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();
    void setVolume(int volume);

    default void setMute(boolean mute) {
        if(mute) {
            System.out.println("mute");
        } else {
            System.out.println("unmute");
        }
    }
}
