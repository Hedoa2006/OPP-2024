package model;

import java.util.Scanner;

public class Return {
    private String id;
    private String date;
    private String borrow_id;
    private String staff_id;
    private int fine;
     //Constructor
    public Return(String id, String date, String borrow_id, String staff_id, int fine){
        this.id = id;
        this.date = date;
        this.borrow_id = borrow_id;
        this.staff_id = staff_id;
        this.fine = fine;
    }
    // Input & Output
    public void input(){
        Scanner sc = new Scanner(System.in);
        id = sc.nextLine();
        date = sc.nextLine();
        borrow_id = sc.nextLine();
        staff_id = sc.nextLine();
        fine = sc.nextInt();
    }
    public void output(){
        System.out.print(id);
        System.out.print(date);
        System.out.print(borrow_id);
        System.out.print(staff_id);
        System.out.println(fine);
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
    public void setBorrow_id(String borrow_id){
        this.borrow_id = borrow_id;
    }
    public String getBorrow_id(){
        return borrow_id;
    }
    public void setStaff_id(String staff_id){
        this.staff_id = staff_id;
    }
    public String getStaff_id(){
        return staff_id;
    }
    public void setFine(int fine){
        this.fine = fine;
    }
    public int getFine(){
        return fine;
    }
}
