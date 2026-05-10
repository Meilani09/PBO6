import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Laptop laptop;

        System.out.println("Pilih Laptop");
        System.out.println("1. Lenovo");
        System.out.println("2. Toshiba");
        System.out.println("3. MacBook");

        System.out.print("Pilih : ");
        int pilih = input.nextInt();
        input.nextLine();

        if (pilih == 1) {
            laptop = new Lenovo();
        } else if (pilih == 2) {
            laptop = new Toshiba();
        } else {
            laptop = new MacBook();
        }

        LaptopUser user = new LaptopUser(laptop);

        String command;

        do {

            System.out.println("\nKetik Command:");
            System.out.println("ON");
            System.out.println("OFF");
            System.out.println("UP");
            System.out.println("DOWN");
            System.out.println("EXIT");

            System.out.print("Input : ");
            command = input.nextLine();

            switch (command.toUpperCase()) {

                case "ON":
                    user.turnOnLaptop();
                    break;

                case "OFF":
                    user.turnOffLaptop();
                    break;

                case "UP":
                    user.makeLaptopLouder();
                    break;

                case "DOWN":
                    user.makeLaptopSilent();
                    break;

                case "EXIT":
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Command tidak dikenali");
            }

        } while (!command.equalsIgnoreCase("EXIT"));

        input.close();
    }
}
