/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Renter;

/**
 *
 * @author Ayon
 */
class Renter {
     private int RegID, flatID, UserID;
     private String BuildingName;
     
     
     
     
     public Renter( int RegID,int flatID,int UserID,String BuildingName )
    {
        
        this.RegID = RegID;
       
        this.flatID = flatID;
        this.UserID = UserID;
        this.BuildingName = BuildingName;
        
        
        
    }
     
     
     
       public int getRegID()
    {
        return RegID;
    }
     
 
          
    public int getflatID()
    {
        return flatID;
    }
               
    public int getUserID()
    {
        return UserID;
    }
    
    public String getBuildingName()
    {
        return BuildingName;
    }
    
      
    
    
}
