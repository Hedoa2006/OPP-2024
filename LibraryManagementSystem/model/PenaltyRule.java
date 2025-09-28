package model;

import java.util.Scanner;

public class PenaltyRule {
    private String id;
    private String name;
    private String account;
     //Constructor
    public PenaltyRule(String id, String name, String account){
        this.id = id;
        this.name = name;
        this.account = account;
    }
    // Input & Output
    public void input(){
        Scanner sc = new Scanner(System.in);
        id = sc.nextLine();
        name = sc.nextLine();
        account = sc.nextLine();
    }
    public void output(){
        System.out.print(id);
        System.out.print(name);
        System.out.println(account);
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
    public void setAccount(String account){
        this.account = account;
    }
    public String getAccount(){
        return account;
    }
}
