package Home;


import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ayon
 */
public class splashClass {
   
    public static void main(String[] args)
    {
         splash msplash = new splash();
         msplash.setVisible(true);
        // msplash.setVisible(false);
         
         start mstart = new start();
         System.out.println(50);
         
       
         try {
            for(int i=1; i<=100; i++){
            Thread.sleep(22);  //22
            splash.loadingBar.setValue(i);
            
            
            if(i==100){
            
            msplash.setVisible(false);
            mstart.setVisible(true);
            }
            }
            
            
            
            
            
            
            
        } catch (Exception e) {
           
        }

        
        
         
    }
    
}
