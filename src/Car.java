import java.awt.*;

abstract class Car implements Movable  {

    protected int nrDoors; // Number of doors on the car
    protected double enginePower; // Engine power of the car
    protected double currentSpeed; // The current speed of the car
    protected Color color; // Color of the car
    protected String modelName; // The car model name
    protected int direction=90;
    protected double x = 0;
    protected double y = 0;

    public int getNrDoors() {
        return nrDoors;
    }

    protected double getEnginePower() {
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

    protected void stopEngine() {
        currentSpeed = 0;
    }


    public double speedFactor() {
        return enginePower * 0.01;      //Override in subclasses
    }

    private void incrementSpeed(double amount) {
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

    protected void brake(double amount) {
        if (amount>= 0 && amount <= 1) {
            decrementSpeed(amount);

            if (currentSpeed < 0) {
                currentSpeed = 0;
            }
        }


    }

    public void move() {

        /*
        switch (direction) {
            case 0:
                y = y + getCurrentSpeed();
                break;
            case 90:
                x += getCurrentSpeed();
                break;
            case 180:
                y -= getCurrentSpeed();
                break;
            case 270:
                x -= getCurrentSpeed();
                break;
        }
    }
 */

    x = x + currentSpeed * (int)Math.cos(Math.toRadians(direction));  //grader, nytt värde på x och y, Math.sin
    y = y + currentSpeed * (int)Math.sin(Math.toRadians(direction));  //ändrat sin och cos, så bilen tittar åt positivt y, Math.cos


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


