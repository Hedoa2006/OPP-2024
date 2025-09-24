package model;

public class Fine {
    private String id;
    private String return_id;
    private String reason;
    private int money;

    //Constructor
    public Fine(String id, String return_id, String reason, int money) {
        this.id = id;
        this.return_id = return_id;
        this.reason = reason;
        this.money = money;
    }

    //Getter & Setter
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getReturnid(){
        return return_id;
    }
    public void setReturnid(String return_id){
        this.return_id = return_id;
    }
    public String getReason(){
        return reason;
    }
    public void setReason(String reason){
        this.reason= reason;
    }
    public int getMoney(){
        return money;
    }
    public void setMoney(int money){
        this.money = money;
    }
}