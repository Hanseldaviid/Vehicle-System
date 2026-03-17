public class Car implements Vehicle{
    public String owner;
    public int speed;

    Car(String owner, int speed){
        this.owner = owner;
        this.speed = speed;
    }
    @Override
    public void start(){
        System.out.println("The car of " + owner + " is starting at: " + speed + "km/h \n");
    }
    @Override
    public void stop(){
        System.out.println("The car of " + owner + " is stopped");
    }

}
