package model;

import java.util.Scanner;

public class Reader {
    private String id;
    private String name;
    private String year_of_birth;
    private String address;
    private String email;
     //Constructor
    public Reader(String id, String name, String year_of_birth, String address, String email){
        this.id = id;
        this.name = name;
        this.year_of_birth = year_of_birth;
        this.address = address;
        this.email = email;
    }
    // Input & Output
    public void input(){
        Scanner sc = new Scanner(System.in);
        id = sc.nextLine();
        name = sc.nextLine();
        year_of_birth = sc.nextLine();
        address = sc.nextLine();
        email = sc.nextLine();
    }
    public void output(){
        System.out.print(id);
        System.out.print(name);
        System.out.print(year_of_birth);
        System.out.print(address);
        System.out.println(email);
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
    public void setYear_of_birth(String year_of_birth){
        this.year_of_birth = year_of_birth;
    }
    public String getYear_of_birth(){
        return year_of_birth;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
}
