package model;

import java.util.Scanner;

public class Category {
    private String id;
    private String name;
     //Constructor
    public Category(String id, String name){
        this.id = id;
        this.name = name;
    }
    // Input & Output
    public void input(){
        Scanner sc = new Scanner(System.in);
        id = sc.nextLine();
        name = sc.nextLine();
    }
    public void output(){
        System.out.print(id);
        System.out.println(name);
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
}
