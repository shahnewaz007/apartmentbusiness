/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Property;

/**
 *
 * @author Ayon
 */
class Flat {
    
    
    private int flatId, totalRoom, rentFee;
    
    public Flat( int flatId,int totalRoom,int rentFee)
    {
        
        this.flatId = flatId;
       
        this.totalRoom = totalRoom;
        this.rentFee = rentFee;
        
        
        
    }
    
    
    
     public int getflatId()
    {
        return flatId;
    }
     
 
          
    public int gettotalRoom()
    {
        return totalRoom;
    }
               
    public int getrentFee()
    {
        return rentFee;
    }
                    
   
                         
   
    
    
}
