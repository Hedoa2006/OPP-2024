package model;

import java.util.Scanner;

public class Order {
    private String id;
    private String date;
    private int total_amount;
    private String staff_id;
    private String suppler_id;
     //Constructor
    public Order(String id, String date, int total_amount, String staff_id, String suppler_id){
        this.id = id;
        this.date = date;
        this.total_amount = total_amount;
        this.staff_id = staff_id;
        this.suppler_id = suppler_id;
    }
    // Input & Output
    public void input(){
        Scanner sc = new Scanner(System.in);
        id = sc.nextLine();
        date = sc.nextLine();
        total_amount = sc.nextInt();
        sc.nextLine();
        staff_id = sc.nextLine();
        suppler_id = sc.nextLine();
    }
    public void output(){
        System.out.print(id);
        System.out.print(date);
        System.out.print(total_amount);
        System.out.print(staff_id);
        System.out.println(suppler_id);
    }
    //Getter & Setter
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setDate(String date){
        this.date = date;
    }
    public String getDate(){
        return date;
    }
    public void setTotal_amount(int total_amount){
        this.total_amount = total_amount;
    }
    public int getTotal_amount(){
        return total_amount;
    }
    public void setStaff_id(String staff_id){
        this.staff_id = staff_id;
    }
    public String getStaff_id(){
        return staff_id;
    }
    public void setSuppler_id(String suppler_id){
        this.suppler_id = suppler_id;
    }
    public String getSuppler_id(){
        return suppler_id;
    }
}
