package com.java.oops;

class Bicycle {
	
	public int cadence;
    public int gear;
    public int speed;

	public Bicycle(int cadence, int gear, int speed) {
		super();
		this.cadence = cadence;
		this.gear = gear;
		this.speed = speed;
	}
    
	public int getCadence() {
		return cadence;
	}

	public int getGear() {
		return gear;
	}

	public void applyBrake(int decrement) {
        speed -= decrement;
        System.out.println(speed);
    }
        
    public void speedUp(int increment) {
        speed += increment;
        System.out.println(speed);
    }
}

class MountainBike extends Bicycle {
    
    public int seatHeight;

    public MountainBike(int startHeight,
                        int startCadence,
                        int startSpeed,
                        int startGear) {
        super(startCadence, startSpeed, startGear);
        this.seatHeight = startHeight;
    }   
        
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }   
}

public class Inheritance {

	public static void main(String[] args) {
		
		MountainBike bike = new MountainBike(1000, 3000, 40, 3);
		
		bike.speedUp(30);
		bike.applyBrake(10);	
	}
}
