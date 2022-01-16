/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collect_Rent;

/**
 *
 * @author AYoN
 */
class collectionshow {
    private int collectID, flatID;
    private String month,year,username;
    
    public collectionshow(int collectID, String username, int flatID, String month,String year)
    {
        this.collectID = collectID;
        this.username = username;
        this.flatID = flatID;
        this.month = month;
        this.year = year;
    }
    public int getcollectID(){
        return collectID;
    }
    public String getusername(){
    return username;
    }
    public int getflatID(){
        return flatID;
    }
    public String getmonth(){
    return month;
    }
    public String getyear(){
    return year;
    }
}
