import java.awt.*;

public class Car implements Movable  {

    public int nrDoors; // Number of doors on the car
    public double enginePower; // Engine power of the car
    public double currentSpeed; // The current speed of the car
    public Color color; // Color of the car
    public String modelName; // The car model name
    public double direction;
    public double x = 0;
    public double y = 0;
    public double currentX;
    public double currentY;




    public int getNrDoors() {
        return nrDoors;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    private Color getColor() {
        return color;
    }

    private void setColor(Color clr) {
        color = clr;
    }

    private double speed() {     // ?
        return currentSpeed;
    }

    private void startEngine() {
        currentSpeed = 0.1;
    }

    public void stopEngine() {
        currentSpeed = 0;
    }


    public double speedFactor() {
        return enginePower * 0.01;      //Override in subclasses
    }

    public void incrementSpeed(double amount) {
        currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, enginePower);  //SAAB has not math.min  wrong?
    }

    public void decrementSpeed(double amount) {
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount, 0); //mat.max, not 0 Saab?
    }


    public void gas(double amount, int i) {
        if (amount>= 0 && amount <= 1)
        {
            incrementSpeed(amount);

            if (currentSpeed > enginePower){
                currentSpeed = enginePower;
            }

        }


    }

    public void brake(double amount) {
        if (amount>= 0 && amount <= 1) {
            decrementSpeed(amount);

            if (currentSpeed < 0) {
                currentSpeed = 0;
            }
        }


    }


    public void move() {
        x = x + currentSpeed * Math.sin(direction);  //grader, nytt värde på x och y
        y = y + currentSpeed * Math.cos(direction);  //ändrat sin och cos, så bilen tittar åt positivt y
    }


    public void turnLeft() {
        direction = (direction - 90);  //bound 360
        if (direction < 0) {
            direction += 360;
        }
    }

        public void turnRight () {
            direction = (direction + 90);
        }



}


