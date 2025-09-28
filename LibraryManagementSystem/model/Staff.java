package model;

import java.util.Scanner;

public class Staff {
    private String id;
    private String name;
    private String birth;
    private String address;
     //Constructor
    public Staff(String id, String name, String birth, String address){
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.address = address;
    }
    // Input & Output
    public void input(){
        Scanner sc = new Scanner(System.in);
        id = sc.nextLine();
        name = sc.nextLine();
        birth = sc.nextLine();
        address = sc.nextLine();
    }
    public void output(){
        System.out.print(id);
        System.out.print(name);
        System.out.print(birth);
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
    public void setBirth(String birth){
        this.birth = birth;
    }
    public String getBirth(){
        return birth;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
}
