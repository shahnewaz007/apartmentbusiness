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
class paymentreq {
    private int requestID, renterID, flatID, rentfee;
    private String payDate, trxno;
    
    public paymentreq(int requestID, int renterID, int flatID, int rentfee, String payDate, String trxno)
    {
        this.requestID = requestID;
        this.renterID = renterID;
        this.flatID = flatID;
        this.rentfee = rentfee;
        this.payDate = payDate;
        this.trxno = trxno;
    }
    public int getrequestID(){
        return requestID;
    }
    public int getrenterID(){
        return renterID;
    }
    public int getflatID(){
        return flatID;
    }
    public int getrentfee(){
        return rentfee;
    }
    public String getpayDate(){
    return payDate;
    }
    public String gettrxno(){
    return trxno;
    }
}
