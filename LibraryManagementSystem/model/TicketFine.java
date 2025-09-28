package model;

import java.util.Scanner;

public class TicketFine {
    private String id;
    private String borrow;
    private String finedate;
    private String reason_id;
    private String total_amount;
     //Constructor
    public TicketFine(String id, String borrow, String finedate, String reason_id, String total_amount){
        this.id = id;
        this.borrow = borrow;
        this.finedate = finedate;
        this.reason_id = reason_id;
        this.total_amount = total_amount;
    }
    // Input & Output
    public void input(){
        Scanner sc = new Scanner(System.in);
        id = sc.nextLine();
        borrow = sc.nextLine();
        finedate = sc.nextLine();
        reason_id = sc.nextLine();
        total_amount = sc.nextLine();
    }
    public void output(){
        System.out.print(id);
        System.out.print(borrow);
        System.out.print(finedate);
        System.out.print(reason_id);
        System.out.println(total_amount);
    }
    //Getter & Setter
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setBorrow(String borrow){
        this.borrow = borrow;
    }
    public String getBorrow(){
        return borrow;
    }
    public void setFinedate(String finedate){
        this.finedate = finedate;
    }
    public String getFinedate(){
        return finedate;
    }
    public void setReason_id(String reason_id){
        this.reason_id = reason_id;
    }
    public String getReason_id(){
        return reason_id;
    }
    public void setTotal_amount(String total_amount){
        this.total_amount = total_amount;
    }
    public String getTotal_amount(){
        return total_amount;
    }
}
