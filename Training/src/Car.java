
public class Car {
    public void start () {
        System.out.println("Let's drive");
    }
    public void stop () {
        System.out.println("We need to stop!");
    }

    public int drive (int howLong) {
        int distance = howLong*60;
        return distance;
    }
}
