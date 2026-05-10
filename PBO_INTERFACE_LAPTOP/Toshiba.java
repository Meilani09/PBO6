public class Toshiba implements Laptop {

    private int volume = 50;

    @Override
    public void powerOn() {
        System.out.println("Laptop Toshiba menyala");
    }

    @Override
    public void powerOff() {
        System.out.println("Laptop Toshiba mati");
    }

    @Override
    public void volumeUp() {
        volume += 10;
        System.out.println("Volume Toshiba : " + volume);
    }

    @Override
    public void volumeDown() {
        volume -= 10;
        System.out.println("Volume Toshiba : " + volume);
    }
}