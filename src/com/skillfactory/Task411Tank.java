package com.skillfactory;


public class Task411Tank {

    int position;


    public static void main(String[] args) {
        Task411Tank tank = new Task411Tank();
        tank.goForward(10);
        tank.printPosition();
        tank.goForward(50);
        tank.printPosition();
        tank.goBackward(100);
        tank.printPosition();

    }

    int goForward(int a) {
       if (a>=0){
            return position += a;
        }else
            return position -= a;


    }

    int goBackward(int a) {
        if (a >= 0) {
            return position -= a;
        }else return position += a;
    }

   public void  printPosition() {
       System.out.println("The Tank is at " + position + " now");
      //return (String.valueOf(position));

    }

}
