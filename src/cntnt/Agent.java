package cntnt;

public class Agent {

    double angle;
    double[] pos;
    double movementSpeed;


    public Agent(double angle, double[] pos, double movementSpeed) {
        this.angle = angle;
        this.pos = pos;
        this.movementSpeed = movementSpeed;
    }


    double getX(){
        return pos[0];
    }
    double getY(){
        return pos[1];
    }

}
