
public class JamesBondCar extends Car{


    public int drive (int howLong){
        int distance = howLong*80;
        System.out.println("The distance is "+distance);
        return distance;
    }

    public void stop (){
        System.out.println("Bond...James Bond");
    }
}
