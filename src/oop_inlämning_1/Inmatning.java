package oop_inlämning_1;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Hussein
 */
public class Inmatning {

    public static void djurOchmat(List<Djur> hotelDjur) {

        boolean loop = true;
        int i = 1;

        while (loop) {

            String input = JOptionPane.showInputDialog("Vilken djur ska få mat? ");

            if (input == null) {
                System.exit(0);
        
            } else {
            
                input = input.trim();

                for (Djur djur : hotelDjur) {
                    i++;
                    if (input.equalsIgnoreCase(djur.getNamn())) {
                        JOptionPane.showMessageDialog(null, (djur.getNamn()
                        + " ska ha : " + djur.portioner() + " från "+ djur.getMatTyp() ));
                        loop = false; 
                        break;

                    }
                }

            }
        }

    }
}   


    
            
            
   

          
         
       
           
             
         
         
         
         
        
             

/**
 *  public static void output(){
       System.out.println("Vilken djur ska få mat ?");
        
 *          Scanner in = new Scanner (System.in);
         
         String keyboard = in.nextLine();  
         
         if(keyboard.equals("")){
             System.out.println("Du måste skriva djuren namn!");
         }
         
         
         if(keyboard.equals("sixten" )){
             System.out.println("Hunden Sixten ska äta : "+ Hundar.hundPortion(5) + " gram hundfoder!");
         
         }
         if(keyboard.equals("dogge")){
             System.out.println("Hunden Dogge ska äta : " + Hundar.hundPortion(10) + " gram hundfoder!");
             
         }
         if(keyboard.equals("venus")){
             System.out.println("katten venus ska äta : " + katter.kattPortion(5) + " gram kattfoder!");
             
         }
         if(keyboard.equals("hypno")){
             System.out.println("ormen hypno ska äta : " + ormar.ormPortion(1) + " gram ormpellets!");
             * 
             *  input.trim().equalsIgnoreCase("sixten");{
            JOptionPane.showMessageDialog(null, "hunden Sixten ska äta " 
                    + Hundar.hundPortion(5)+ " gram hundoder");
        }
 */
