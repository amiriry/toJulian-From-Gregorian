package controllers;

/**
 * Created by amir on 03/11/15.
 */

import java.util.Calendar;


public class JulianDate {

//  public static void main(String[] args) {

  public static double[] getCurrentJulian() {
    Calendar now = Calendar.getInstance();

    int Y = now.get(Calendar.YEAR);
    int M = now.get(Calendar.MONTH)+1;
    int D = now.get(Calendar.DAY_OF_MONTH);

    System.out.println(Y + " " + M + " " + D);

    int A = Y / 100;
    int B = A / 4;
    int C = 2 - A + B;
    int E = (int)(365.25 * (Y+4716));
    int F = (int)(30.6001 * (M + 1));
    int julianDate =(int)(C + D + E + F - 1524.5);

    double startSeconds = 70833;
    double endSeconds = 70832;

    double startSecondsOfADay = julianDate + (startSeconds/100000);
    double endSecondsOfADay = julianDate + 1 + (endSeconds/100000);

    double[] arrayReturn = {startSecondsOfADay, endSecondsOfADay};

//   System.out.println(String.format("%.5f, %.5f", arrayReturn[0], arrayReturn[1])); //+ arrayReturn[0] + " " + arrayReturn[1]);
    return arrayReturn;

  }
}

