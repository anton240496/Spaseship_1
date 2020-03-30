
package com.company;
import java.util.Scanner;
import org.junit.Test;
public class Main {

    @Test
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);

//
//       Spaceship speed1 = new Spaceship(5);
//        Spaceship speed2 = new Spaceship(500);
//        Spaceship speed3 = new Spaceship(543);
//        Spaceship speed1 = new Spaceship(54552345);
//        Spaceship speed2 = new Spaceship(500566789);
//        Spaceship speed3 = new Spaceship(543574579);
        Spaceship speed1 = new Spaceship(scnr.nextInt());
        Spaceship speed2 = new Spaceship(scnr.nextInt());
        Spaceship speed3 = new Spaceship(scnr.nextInt());




        int avg = avg(speed1.getSpeed(),speed2.getSpeed(),speed3.getSpeed());
        int min = min(speed1.getSpeed(),speed2.getSpeed(),speed3.getSpeed());
        System.out.printf("средняя скорость:");
        System.out.printf(String.valueOf(avg));
        System.out.printf("\nминимальная скорость:");
        System.out.printf(String.valueOf(min));



    }

    private static int avg(int speed1, int speed2, int speed3) {
        int avg;
        avg=((speed1+speed2+speed3)/3);
        return avg;
    }

    private static int min(int speed1, int speed2, int speed3) {
        int min;
        min=(Math.min(speed1,(Math.min(speed2,speed3))));
        return min;
    }




}