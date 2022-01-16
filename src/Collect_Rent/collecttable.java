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
class collecttable {
    private int flatID, renterID, year;
    private String month, trnxno;
    
    public collecttable(int renterID, int flatID, String trnxno, String month, int year)
    {
        this.renterID = renterID;
        this.flatID = flatID;
        this.trnxno = trnxno;
        this.month = month;
        this.year = year;
    }
    
    public int getrenterID(){
        return renterID;
    }
    public int getflatID(){
        return flatID;
    }
    public String gettrnxno(){
        return trnxno;
    }
    public String getmonth(){
    return month;
    }
    public int getyear(){
    return year;
    }
}
