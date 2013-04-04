package MaximumGenerators;

import java.util.Date;
import java.util.GregorianCalendar;  
import java.util.Random;

public class PhotoGenerator {
    
    static private String[] prefixName = {
        "Natal",
        "Aniversario",
        "Pascoa",
        "Buzios",
        "Ferias",
        "Sampa",
        "Carnaval",
        "Faculdade",
        "Bahia"
    };  
    
    static public String photoName() {
        Random rand = new Random();          
        return prefixName[rand.nextInt(prefixName.length)] + "_" + (rand.nextInt(98)+1) + ".jpg";
    }
    
    static public float photoSize() {
        Random rand = new Random();
        return (rand.nextFloat()+1)*(rand.nextInt(1)+2);
    }
    
    static public Date photoDate() {
        Random rand = new Random(); 
        int month, year, day;  
        month = rand.nextInt(11)+1;  
        year  = rand.nextInt(12) + 2000;  
        day   = rand.nextInt(30)+1;  
        GregorianCalendar calendar = new GregorianCalendar(year, month, day);  
        Date now = calendar.getTime();  
        return now;
    }
    
    static public String photoDescription() {
        Random rand = new Random();
        int number = rand.nextInt(100);
        if (number < 20){
            return "This photo is so beautiful! Isn't it, Jocasta ?";
        }
        else {
            return "No comments on this Photo.";
        }
    }
    
    static public int photoRelevance() {
        Random rand = new Random();
        return rand.nextInt(5)+1;
    }
}
