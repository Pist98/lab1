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




    private int getNrDoors() {
        return nrDoors;
    }

    private double getEnginePower() {
        return enginePower;
    }

    private double getCurrentSpeed() {
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


    // TODO fix this method according to lab pm
    public void gas(double amount) {
        if (amount>= 0 && amount <= 1)
        {
            incrementSpeed(amount);

            if (currentSpeed > enginePower){
                currentSpeed = enginePower;
            }

        }


    }

    // TODO fix this method according to lab pm
    public void brake(double amount) {
        if (amount>= 0 && amount <= 1) {
            decrementSpeed(amount);

            if (currentSpeed < 0) {
                currentSpeed = 0;
            }
        }


    }


    public void move() {

        currentX = currentSpeed * Math.cos(direction);  //grader
        currentY = currentSpeed * Math.sin(direction);

        x = x + currentX;
        y = y + currentY;
    }


    public void turnLeft() {
        direction = (direction - 90) % 360;  //bound 360
        if (direction < 0) {
            direction += 360;
        }
    }

        public void turnRight () {
            direction = (direction + 90) % 360;
        }



}


