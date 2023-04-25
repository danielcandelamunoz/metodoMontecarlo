package dominio;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class Matematicas{
    public static double generarnumeroPI(int n ){
        Random generador = new Random();
        double acierto = 0;
        for (int i =1 ; i < n; i++){
            double x = Math.random();
            double y = Math.random();
            if((x*x+y*y)<=1){
                acierto+=1;
            }
        }
        return 4*acierto/n;
    }
}