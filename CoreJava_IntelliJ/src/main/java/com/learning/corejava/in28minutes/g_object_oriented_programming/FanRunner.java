package com.learning.corejava.in28minutes.g_object_oriented_programming;

class Fan{

    //state
    private String make;
    private double radius;
    private String colour;
    private boolean isOn;
    private byte speed;

    public Fan(String make, double radius, String colour) {
        this.make = make;
        this.radius = radius;
        this.colour = colour;
    }

    public void switchOn(){
        setSpeed((byte) 5);
        this.isOn=true;
    }

    public void switchOff(){
        setSpeed((byte) 0);
        this.isOn=false;
    }

    public byte getSpeed() {
        return speed;
    }

    public void setSpeed(byte speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "make='" + make + '\'' +
                ", radius=" + radius +
                ", colour='" + colour + '\'' +
                ", isOn=" + isOn +
                ", speed=" + speed +
                '}';
    }
}

public class FanRunner {

    public static void main(String[] args) {
        Fan fan = new Fan("manufacture1",0.34,"black");
        fan.switchOn();
        fan.setSpeed((byte)10);
        System.out.println(fan);

        fan.switchOff();
        System.out.println(fan);


        System.out.println(190%100);
    }
}
