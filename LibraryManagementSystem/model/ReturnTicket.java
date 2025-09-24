package model;

public class ReturnTicket {
    private String id;
    private String date_return;
    private String loan_id;
    private String staff_id;
    private int fine;

    public ReturnTicket(String id, String date_return, String loan_id, String staff_id, int fine){
        this.id = id;
        this.date_return = date_return;
        this.loan_id = loan_id;
        this.staff_id = staff_id;
        this.fine = fine;
    }

    // Getters, setters
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getDatereturn(){
        return date_return;
    }
    public void setDatereturn(String date_return){
        this.date_return = date_return;
    }
    public String getLoanid(){
        return loan_id;
    }
    public void setLoanid(String loan_id){
        this.loan_id = loan_id;
    }
    public String getStaffid(){
        return staff_id;
    }
    public void setStaffid(String staff_id){
        this.staff_id = staff_id;
    }
    public int getFine(){
        return fine;
    }
    public void setFine(int fine){
        this.fine = fine;
    }
}