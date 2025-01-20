/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Car{
    private int speed;
    
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int sp){
        this.speed=sp;
    }
    public static void main(String args[]){
        Car a=new Car();
        a.setSpeed(60);
        System.out.println("The speed of the car is:"+a.getSpeed());
    }
}