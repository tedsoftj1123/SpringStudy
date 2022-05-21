public class Car2 {
    private int speed;// 되도록이면 필드는 private 접근제한자를 붙여주고
    private boolean stop;

    public int getSpeed() { // getter와 setter를 이용해 값을 가져오거나 수정하자
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed < 0) {
            this.speed = 0;
            return;
        } else {
            this.speed = speed;
        }
    }
}
