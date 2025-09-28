package model;

import java.util.Scanner;

public class PODetail {
    private String id;
    private String order_id;
    private String book_id;
    private int quantity;
    private int price;
    private int subtotal;
     //Constructor
    public PODetail(String id, String order_id, String book_id, int quantity, int price, int subtotal){
        this.id = id;
        this.order_id = order_id;
        this.book_id = book_id;
        this.quantity = quantity;
        this.price = price;
        this.subtotal = subtotal;
    }
    // Input & Output
    public void input(){
        Scanner sc = new Scanner(System.in);
        id = sc.nextLine();
        order_id = sc.nextLine();
        book_id = sc.nextLine();
        quantity = sc.nextInt();
        price = sc.nextInt();
        subtotal = sc.nextInt();
    }
    public void output(){
        System.out.print(id);
        System.out.print(order_id);
        System.out.print(book_id);
        System.out.print(quantity);
        System.out.print(price);
        System.out.println(subtotal);
    }
    //Getter & Setter
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setOrder_id(String order_id){
        this.order_id = order_id;
    }
    public String getOrder_id(){
        return order_id;
    }
    public void setBook_id(String book_id){
        this.book_id = book_id;
    }
    public String getBook_id(){
        return book_id;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
    public void setSubtotal(int subtotal){
        this.subtotal = subtotal;
    }
    public int getSubtotal(){
        return subtotal;
    }
}
