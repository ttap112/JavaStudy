package multiTVControl;

import java.util.Scanner;

public class SamsungTV implements TV{
    private final String StreamingService = "Netflix";
    private boolean Pairing = false;
    private int Channel = 1;
    private final String Name = "SamsungTV";


    @Override
    public void Off() {
        System.out.println("SamsungTV Off");
        this.Pairing = false;
    }

    @Override
    public void On() {
        System.out.println("SamsungTV On");
        this.Pairing = true;
    }

    @Override
    public void ThisChannelInfo() {
        if (Pairing) {
            System.out.println("This Channel : "+Channel);
            System.out.println("Power On");
        }
    }


    @Override
    public void ChannelChange() {
        System.out.print("Input Channel Change : ");
        Scanner Scanner = new Scanner(System.in);
        this.Channel = Scanner.nextInt();
        System.out.println("\nChannel Change : "+Channel);
    }

    @Override
    public void PairingInfo() {
        System.out.println("pairing info : "+Pairing);
    }

    @Override
    public void ThisTVName() {
        System.out.println("This TV Name is SamsungTV");
    }

    public boolean isPairing() {
        return Pairing;
    }

    public String getName() {
        return Name;
    }
}
