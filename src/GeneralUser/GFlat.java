/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeneralUser;

/**
 *
 * @author Ayon
 */
public class GFlat {
    
     private int flatId, totalRoom, rentFee;
     String buildingName, Area;
     
      public GFlat( int flatId,int totalRoom,int rentFee, String buildingName,  String Area)
    {
        
        this.flatId = flatId;
       
        this.totalRoom = totalRoom;
        this.rentFee = rentFee;
        
        this.buildingName = buildingName;
        this.Area = Area;
      
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
    
    
     
     public String getbuildingName()
    {
        return buildingName;
    }
     
 
          
     
     public String getArea()
    {
        return Area;
    }    
  
    
}
