package model;

import java.util.Scanner;

public class ReturnDetail {
    private String id;
    private String book_id;
    private String return_id;
    private int quantity;
     //Constructor
    public ReturnDetail(String id, String book_id, String return_id, int quantity){
        this.id = id;
        this.book_id = book_id;
        this.return_id = return_id;
        this.quantity = quantity;
    }
    // Input & Output
    public void input(){
        Scanner sc = new Scanner(System.in);
        id = sc.nextLine();
        book_id = sc.nextLine();
        return_id = sc.nextLine();
        quantity = sc.nextInt();
    }
    public void output(){
        System.out.print(id);
        System.out.print(book_id);
        System.out.print(return_id);
        System.out.println(quantity);
    }
    //Getter & Setter
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setBook_id(String book_id){
        this.book_id = book_id;
    }
    public String getBook_id(){
        return book_id;
    }
    public void setReturn_id(String return_id){
        this.return_id = return_id;
    }
    public String getReturn_id(){
        return return_id;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity(){
        return quantity;
    }
}
