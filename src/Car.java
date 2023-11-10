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

    protected int getNrDoors() {
        return nrDoors;
    }

    protected double getEnginePower() {
        return enginePower;
    }

    protected double getCurrentSpeed() {
        return currentSpeed;
    }

    protected Color getColor() {
        return color;
    }

    protected void setColor(Color clr) {
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
        currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, enginePower);  //SAAB has not math.min  wrong?
    }
    private void decrementSpeed(double amount) {
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount, 0); //mat.max, not 0 Saab?
    }


    protected void gas(double amount) {
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


    x = x + currentSpeed * (int)Math.cos(Math.toRadians(direction));  //grader, nytt värde på x och y, Math.sin
    y = y + currentSpeed * (int)Math.sin(Math.toRadians(direction));  //ändrat sin och cos, så bilen tittar åt positivt y, Math.cos

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
    }
    public void turnLeft() {
        direction = ((direction - 90)%360);    //+360)%360; Går ett helt varv igen och tar modulo på det
        if (direction < 0) {
            direction += 360;
        }
    }

    public void turnRight () {
        direction = (direction + 90)%360;
    }
}


