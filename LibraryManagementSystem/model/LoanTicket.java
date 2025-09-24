package model;

public class LoanTicket {
    private String id;
    private String date_loan;
    private String date_return;
    private String reader_id;
    private String staff_id;

    public LoanTicket(String id, String date_loan, String date_return, String reader_id, String staff_id){
        this.id = id;
        this.date_loan = date_loan;
        this.date_return = date_return;
        this.reader_id = reader_id;
        this.staff_id = staff_id;
    }

    // Getters, setters, toString()
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getDateloan(){
        return date_loan;
    }
    public void setDateloan(String date_loan){
        this.date_loan = date_loan;
    }
    public String getDatereturn(){
        return date_return;
    }
    public void setDatereturn(String date_return){
        this.date_return = date_return;
    }
    public String getReaderid(){
        return reader_id;
    }
    public void setReaderid(String reader_id){
        this.reader_id = reader_id;
    }
    public String getStaffid(){
        return staff_id;
    }
    public void setStaffid(String staff_id){
        this.staff_id = staff_id;
    }
}