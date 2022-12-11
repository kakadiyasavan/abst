import java.util.Scanner;

public class bank {

    public static void main(String[] args) {

        back il = new rete();
        il = new rete();
        il.getRateOfInterest();

        int b = 9;
        Scanner hg = new Scanner(System.in);
        System.out.println("Enter your Ammount : " + b);
        b = hg.nextInt();
    }
}

abstract class back {

    abstract void getRateOfInterest();
}

class rete extends back {

    public void getRateOfInterest() {
        String a;
        Scanner kl = new Scanner(System.in);
        System.out.println("Enter the rate of Interest : ");
        a = kl.nextLine();
    }
}
