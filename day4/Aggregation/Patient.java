/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oops.Aggregation;


public class Patient {
    String patientName;
    int patientAge;
    String disease, dateOfArrival;
    Information info;
        payment pay;

    public Patient(String patientName, int patientAge, String disease, String dateOfArrival,Information info,payment pay) {
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.disease = disease;
        this.dateOfArrival = dateOfArrival;
        this.info=info;
        this.pay=pay;
    }
    void patientDetails(){
        System.out.println("Name:"+this.patientName);
        System.out.println("Age:"+ this.patientAge);
        System.out.println("Disease"+this.disease);
        System.out.println("Date of Arrival"+this.dateOfArrival);
        System.out.println("Block number"+this.info.blockNo);
        System.out.println("floor number"+this.info.floorNo);
        System.out.println("room number"+this.info.roomNo);
        System.out.println("bed number"+this.info.bedNo);
        System.out.println("Admission fees"+this.pay.admFees);
        System.out.println("Registration feess"+this.pay.Regfees);
        System.out.println("Balance amount"+this.pay.balAmt);
    }
    public static void main(String[] args){
        Information info=new Information('C',3,392,4);
        payment pay=new payment(5000,10000,5000);
        Patient p=new Patient("tej",20,"covid","25/6/2026",info,pay);
        p.patientDetails();
    }
    
}
