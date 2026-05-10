public class MacBook implements Laptop {

    private int volume = 50;

    @Override
    public void powerOn() {
        System.out.println("MacBook menyala");
    }

    @Override
    public void powerOff() {
        System.out.println("MacBook mati");
    }

    @Override
    public void volumeUp() {
        volume += 10;
        System.out.println("Volume MacBook : " + volume);
    }

    @Override
    public void volumeDown() {
        volume -= 10;
        System.out.println("Volume MacBook : " + volume);
    }
}