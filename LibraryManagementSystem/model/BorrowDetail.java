package model;

import java.util.Scanner;

public class BorrowDetail {
    private String id;
    private String book_id;
    private String borrow_id;
    private int quantity;
     //Constructor
    public BorrowDetail(String id, String book_id, String borrow_id, int quantity){
        this.id = id;
        this.book_id = book_id;
        this.borrow_id = borrow_id;
        this.quantity = quantity;
    }
    // Input & Output
    public void input(){
        Scanner sc = new Scanner(System.in);
        id = sc.nextLine();
        book_id = sc.nextLine();
        borrow_id = sc.nextLine();
        quantity = sc.nextInt();
    }
    public void output(){
        System.out.print(id);
        System.out.print(book_id);
        System.out.print(borrow_id);
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
    public void setBorrow_id(String borrow_id){
        this.borrow_id = borrow_id;
    }
    public String getBorrow_id(){
        return borrow_id;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity(){
        return quantity;
    }
}
