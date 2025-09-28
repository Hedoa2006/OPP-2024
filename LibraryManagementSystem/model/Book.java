package model;

import java.util.Scanner;

public class Book {
    private String id;
    private String name;
    private String date;
    private String cate_id;
    private String author_id;
    private String publisher;
    private int quantity;
    private int price;
     //Constructor
    public Book(String id, String name, String date, String cate_id, String author_id, String publisher, int quantity, int price){
        this.id = id;
        this.name = name;
        this.date = date;
        this.cate_id = cate_id;
        this.author_id = author_id;
        this.publisher = publisher;
        this.quantity = quantity;
        this.price = price;
    }
    // Input & Output
    public void input(){
        Scanner sc = new Scanner(System.in);
        id = sc.nextLine();
        name = sc.nextLine();
        date = sc.nextLine();
        cate_id = sc.nextLine();
        author_id = sc.nextLine();
        publisher = sc.nextLine();
        quantity = sc.nextInt();
        price = sc.nextInt();
    }
    public void output(){
        System.out.print(id);
        System.out.print(name);
        System.out.print(date);
        System.out.print(cate_id);
        System.out.print(author_id);
        System.out.print(publisher);
        System.out.print(quantity);
        System.out.print(price);
    }
    //Getter & Setter
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setDate(String date){
        this.date = date;
    }
    public String getDate(){
        return date;
    }
    public void setCateId(String cate_id){
        this.cate_id = cate_id;
    }
    public String getCateId(){
        return cate_id;
    }
    public void setAuthorId(String author_id){
        this.author_id = author_id;
    }
    public String getAuthorId(){
        return cate_id;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public String getPublisher(){
        return publisher;
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
}