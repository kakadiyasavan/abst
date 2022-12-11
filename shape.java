public class shape {

    public static void main(String[] args) {

        red op = new show();
        op = new show();
        op.Rectangle();
        op.Circle();

    }
}

abstract class red {

    abstract void Rectangle();
    abstract void Circle();

}

class show extends red {

    public void Rectangle() {
        System.out.println("Hello java ");
    }

    public void  Circle() {
        System.out.println("Data add");
    }

}