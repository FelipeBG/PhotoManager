package Lacunas;

import java.util.Random;

public class PhotoSizeGenerator {
    
    static public float photoSize() {      
        Random rand = new Random();
        return (rand.nextFloat()+1)*(rand.nextInt(1)+2);    
    }   
}
