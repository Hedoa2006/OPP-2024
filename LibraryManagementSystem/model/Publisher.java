package model;

import java.util.Scanner;

public class Publisher {
    private String id;
    private String name;
    private String date;
    private String address;
     //Constructor
    public Publisher(String id, String name, String date, String address){
        this.id = id;
        this.name = name;
        this.date = date;
        this.address = address;
    }
    // Input & Output
    public void input(){
        Scanner sc = new Scanner(System.in);
        id = sc.nextLine();
        name = sc.nextLine();
        date = sc.nextLine();
        address = sc.nextLine();
    }
    public void output(){
        System.out.print(id);
        System.out.print(name);
        System.out.print(date);
        System.out.println(address);
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
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
}
