/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_inlämning_1;

/**
 *
 * @author Hussein
 */
public class Katter extends Djur implements IDjurensMat{
    Katter(String namn, int vikt){
        super(namn,vikt);
        setMatTyp("Kattfoder");
         setVikt(vikt);
        
    }
    
   
   
    @Override
    public int portioner(){
        return (getVikt()*1000)/150;
    }
    
    
    
        
        
}