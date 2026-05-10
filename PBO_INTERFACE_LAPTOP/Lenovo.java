public class Lenovo implements Laptop {

    private int volume = 50;

    @Override
    public void powerOn() {
        System.out.println("Laptop Lenovo menyala");
    }

    @Override
    public void powerOff() {
        System.out.println("Laptop Lenovo mati");
    }

    @Override
    public void volumeUp() {
        volume += 10;
        System.out.println("Volume Lenovo : " + volume);
    }

    @Override
    public void volumeDown() {
        volume -= 10;
        System.out.println("Volume Lenovo : " + volume);
    }
}