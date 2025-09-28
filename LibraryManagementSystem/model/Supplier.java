package model;

import java.util.Scanner;

public class Supplier {
    private String id;
    private String name;
    private String address;
    private String contact;
     //Constructor
    public Supplier(String id, String name, String address, String contact){
        this.id = id;
        this.name = name;
        this.address = address;
        this.contact = contact;
    }
    // Input & Output
    public void input(){
        Scanner sc = new Scanner(System.in);
        id = sc.nextLine();
        name = sc.nextLine();
        address = sc.nextLine();
        contact = sc.nextLine();
    }
    public void output(){
        System.out.print(id);
        System.out.print(name);
        System.out.print(address);
        System.out.println(contact);
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
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
    public void setContact(String contact){
        this.contact = contact;
    }
    public String getContact(){
        return contact;
    }
}
