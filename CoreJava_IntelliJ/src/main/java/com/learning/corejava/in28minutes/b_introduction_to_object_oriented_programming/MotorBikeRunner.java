package com.learning.corejava.in28minutes.b_introduction_to_object_oriented_programming;

class MotorBike{

    MotorBike(int speed){
        this.speed =speed;
    }
    MotorBike(){
//        this.speed =10;
        this(10);
    }

    //state
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed>0)
         this.speed = speed;
    }


    public void increaseSpeed(int increaseSpeed){
        setSpeed(this.speed+increaseSpeed);
    }

    public void decreaseSpeed(int decreaseSpeed){
        setSpeed(this.speed-decreaseSpeed);
    }


    //Behaviour
    void start(){
        System.out.println("Bike Started");
    }

}

public class MotorBikeRunner {

    public static void main(String[] args) {

        MotorBike honda = new MotorBike(100);
        MotorBike discover = new MotorBike(200);
        MotorBike someThingEle = new MotorBike();



        honda.start();
        discover.start();

        honda.setSpeed(100);
        discover.setSpeed(50);

        honda.increaseSpeed(100);
        honda.decreaseSpeed(50);

        System.out.println(honda.getSpeed());
        System.out.println(discover.getSpeed());



    }
}
