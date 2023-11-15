import java.awt.*;

abstract class Car implements Movable  {

    protected int nrDoors;
    protected double enginePower;
    protected double currentSpeed;
    protected Color color;
    protected String modelName;
    protected int direction=90;
    protected double x = 0;
    protected double y = 0;

    public int getNrDoors() {
        return nrDoors;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color clr) {
        color = clr;
    }

    private double speed() {     // ?
        return currentSpeed;
    }

    protected void startEngine() {
        currentSpeed = 0.1;
    }

    protected void stopEngine() {
        currentSpeed = 0;
    }

    protected double speedFactor() {
        return enginePower * 0.01;      //Override in subclasses
    }

    private void incrementSpeed(double amount) {
        currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, enginePower);
    }
    private void decrementSpeed(double amount) {
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount, 0);
    }


    public void gas(double amount) {
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


    x = x + currentSpeed * (int)Math.cos(Math.toRadians(direction));  //grader, nytt värde på x och y, Math.sin
    y = y + currentSpeed * (int)Math.sin(Math.toRadians(direction));  //ändrat sin och cos, så bilen tittar åt positivt y, Math.cos


    }
    public void turnLeft() {
        direction = ((direction - 90)%360);
        if (direction < 0) {
            direction += 360;
        }
    }

    public void turnRight () {
        direction = (direction + 90)%360;
    }
}