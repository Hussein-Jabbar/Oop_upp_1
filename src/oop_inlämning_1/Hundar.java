/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_inlämning_1;

public class Hundar extends Djur implements IDjurensMat {
    
    
    
     Hundar(String namn, int vikt){
        super(namn,vikt);
        setMatTyp("Hundfoder");
         setVikt(vikt);
         
        
    }
    
  
   
     @Override
    public int portioner(){
        return (getVikt()*1000)/100;
    }
       

}
    

