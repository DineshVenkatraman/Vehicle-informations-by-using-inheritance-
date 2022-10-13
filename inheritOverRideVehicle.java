class vehicle
{
    int noofwheel()
    {
        return 0;
    }
    boolean isBrake()
    {
        return false;
    }
}
class car extends vehicle
{
    int noofwheel()
    {
        return 4;
    }
    boolean isBrake()
    {
        System.out.println("Car has Brake.");
        return true;
    }
}
class bike extends vehicle
{
    int noofwheel()
    {
        return 2;
    }
    boolean isBrake()
    {
        System.out.println("Bike has Brake.");
        return true;
    }
}



public class inheritOverRideVehicle {
    public static void main(String args[])
    {
        vehicle v=new vehicle();
        System.out.println(v.noofwheel());
        System.out.println(v.isBrake());
        v=new car();
        System.out.println(v.noofwheel());
        System.out.println(v.isBrake());
        v=new bike();
        System.out.println(v.noofwheel());
        System.out.println(v.isBrake());
    }
}
