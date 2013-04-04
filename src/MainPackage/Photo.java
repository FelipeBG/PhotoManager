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
    
    public Photo() {
        this.name        = ZPhotoGeneratorOLD.photoName();
        this.size        = ZPhotoGeneratorOLD.photoSize();
        this.date        = ZPhotoGeneratorOLD.photoDate();
        this.description = ZPhotoGeneratorOLD.photoDescription();
        this.relevance   = ZPhotoGeneratorOLD.photoRelevance();      
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
