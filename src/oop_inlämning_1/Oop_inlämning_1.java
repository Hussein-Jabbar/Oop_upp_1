
package oop_inlämning_1;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Hussein
 */
public class Oop_inlämning_1 {

    
    public static void main(String[] args) {
        
         ArrayList<Djur> hotelbo = new ArrayList<>();

       
        
        hotelbo.add(new Hundar("Sixten", 5));
        
        hotelbo.add(new Hundar("Dogge", 10));
        
        hotelbo.add(new Katter("Venus", 5));
        
        hotelbo.add(new Katter("Ove", 3));
        
        hotelbo.add(new Ormar("Hypno",1));
        
        Inmatning.djurOchmat(hotelbo);
            
            
        
        
        
        

        
        
        
        
        
        
        
        
        

    }
    
}
