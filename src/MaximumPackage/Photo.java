package MaximumPackage;

import java.util.Date;

public class Photo {
    private String name;
    private Date   date;
    private String description;
    private String systemFile;
    private int    relevance;
    
    public Photo (String nome) {
        this.name = nome;
    }

    public String printer() {
        return this.name;
    }
    
    public static void main(String[] args) {
        Photo a = new Photo("test");
        System.out.println(a.printer());                      
    }
} 
