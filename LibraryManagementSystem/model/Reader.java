package model;

public class Reader {
    private String id;
    private String name;
    private String ngaysinh;
    private String diachi;
    private String email;
    private int sdt;
    //Constructor 
    public Reader(String id, String name, String ngaysinh, String diachi, int sdt, String email){
        this.id = id;
        this.name = name;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.sdt = sdt;
        this.email = email;
    }
    // Getters, setters
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getNgaysinh(){
        return ngaysinh;
    }
    public void setNgaysinh(String ngaysinh){
        this.ngaysinh = ngaysinh;
    }
    public String getDiachi(){
        return diachi;
    }
    public void setDiachi(String diachi){
        this.diachi = diachi;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public int getSdt(){
        return sdt;
    }
    public void setSdt(int sdt){
        this.sdt = sdt;
    }
}