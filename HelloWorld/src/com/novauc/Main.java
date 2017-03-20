package com.novauc;

public class Main {

    public static void main(String[] args) {
	// write your code here
  int score=0;
        System.out.println("Score is; " + score);
        score = score + 1;
        System .out.println("Score +1 is: " +score);
        score +=1;

        System.out.println("Score is + 1 is: " + score);


        double health = 100.00;
        System.out.println("health is; " + health);

        health = health * 0.75;
        System.out.println("health is; " + health);
        boolean didWin = false;

        System.out.println("didWin; " +didWin);

        didWin = score > 0;

        System.out.println("didWin; " +didWin);


        double[] position = {1.0, 1.5};
        position = new double[2];
        position [0] = 1.0;

        position[1] = 1.5;



        System.out.println("position[0)" + position[0]);
         System.out.println("position[0)" + position[0]);


         person me = new person ();


         me.name = "Kevin";
         me.age = 46;
         me.isAlive = true;


         person President = new person();

         President.name = "Donald Trump";
         President.age = 70;
         President. isAlive = true;

         System.out.println("President's name is; " + President.name);
         System.out.println("age is" + me.age);
         System.out.println("isAlive; " +me.isAlive);

         me.setAge(25);
         me.setAge(225);
         me.setAlive(true);

         System.out.println("me age; " + me.getAge());
                 System.out.println("me isAlive; " + me.isAlive());
























    }
}
