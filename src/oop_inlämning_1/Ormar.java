
package oop_inlämning_1;

/**
 *
 * @author Hussein
 */
public class Ormar extends Djur implements IDjurensMat{
    
    Ormar(String namn, int vikt){
        super(namn,vikt);
         setMatTyp("Ormpellets");
        
    }
    
    public String getMatOrmTyp(){
        return "Ormpellets";
        
    }
   
    @Override
    public int portioner(){
        return 20;  
    }
    
   
        
    }

    

