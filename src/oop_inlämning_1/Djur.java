
package oop_inlämning_1;

/**
 *
 * @author Hussein
 */
abstract class Djur implements IDjurensMat {
    
    
    // instansevariablar Kapsla dem
    private String namn;
    private int vikt;
    private String matTyp;
    
     Djur(String namn,int vikt){
        this.namn = namn;
        this.vikt = vikt;
    }
    
    // setters för instansvariabel för ändring i programmet
     public void setNamn(String namn){
        this.namn = namn;
    }
     
     void  setVikt(int vikt){
        this.vikt = vikt;
    }
     void setMatTyp(String matTyp){
         this.matTyp= matTyp;
     }

   
    public String getNamn(){
        return namn;
    }
    
    public int getVikt(){
        return vikt;
    }
    public String getMatTyp(){
        return matTyp;
    }
    
}
