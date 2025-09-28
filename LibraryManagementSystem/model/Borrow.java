package model;

import java.util.Scanner;

public class Borrow {
    private String id;
    private String date;
    private String return_id;
    private String actual_return_date;
    private String reader_id;
    private String staff_id;
     //Constructor
    public Borrow(String id, String date, String return_id, String actual_return_date, String reader_id, String staff_id){
        this.id = id;
        this.date = date;
        this.return_id = return_id;
        this.actual_return_date = actual_return_date;
        this.reader_id = reader_id;
        this.staff_id = staff_id;
    }
    // Input & Output
    public void input(){
        Scanner sc = new Scanner(System.in);
        id = sc.nextLine();
        date = sc.nextLine();
        return_id = sc.nextLine();
        actual_return_date = sc.nextLine();
        reader_id = sc.nextLine();
        staff_id = sc.nextLine();
    }
    public void output(){
        System.out.print(id);
        System.out.print(date);
        System.out.print(return_id);
        System.out.print(actual_return_date);
        System.out.print(reader_id);
        System.out.println(staff_id);
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
    public void setReturn_id(String return_id){
        this.return_id = return_id;
    }
    public String getReturn_id(){
        return return_id;
    }
    public void setActual_return_date(String actual_return_date){
        this.actual_return_date = actual_return_date;
    }
    public String getActual_return_date(){
        return actual_return_date;
    }
    public void setReader_id(String reader_id){
        this.reader_id = reader_id;
    }
    public String getReader_id(){
        return reader_id;
    }
    public void setStaff_id(String staff_id){
        this.staff_id = staff_id;
    }
    public String getStaff_id(){
        return staff_id;
    }
}
