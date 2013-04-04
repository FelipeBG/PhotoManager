package MaximumPackage;

import MaximumGenerators.PhotoGenerator;
import java.util.Date;

public class Photo {
    private String name;
    private float  size;
    private Date   date;
    private String description;
    private String systemWay;
    private int    relevance;
    
    public Photo () {
        this.name        = PhotoGenerator.photoName();
        this.size        = PhotoGenerator.photoSize();
        this.date        = PhotoGenerator.photoDate();
        this.description = PhotoGenerator.photoDescription();
        this.relevance   = PhotoGenerator.photoRelevance();      
    }

    public String getName() {
        return this.name;
    }
    
    public float getSize() {
        return this.size;
    }
    
    public Date getDate() {
        return this.date;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public int getRelevance() {
        return this.relevance;
    }
    
    public static void main(String[] args) {
        Photo A = new Photo();
        
        System.out.println(A.getName());
        System.out.println(A.getSize());
        System.out.println(A.getDate());
        System.out.println(A.getDescription());
        System.out.println(A.getRelevance());
                           
    }
} 
