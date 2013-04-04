package MainPackage;

import Lacunas.ZPhotoGeneratorOLD;
import java.util.Date;

public class Photo {
    private String name;
    private float  size;
    private Date   date;
    private String description;
    private String directory;
    private int    relevance;
    
    public Photo(String name, float size, String description, int relevance) {
        this.name        = name;
        this.size        = size;
        this.description = description;
        this.relevance   = relevance;      
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
        String name = "teste";
        float  size = 1;
        String description = "teste";
        int relevance = 5;
                
        Photo A = new Photo(name,size,description,relevance);
        
        System.out.println(A.getName());
        System.out.println(A.getSize());
        System.out.println(A.getDate());
        System.out.println(A.getDescription());
        System.out.println(A.getRelevance());                   
    }
} 
