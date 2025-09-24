package model;

public class Author {
    private String id;
    private String name;
    private String dateofbirth;
    private String nationality;

    //Constructor
    public Author(String id ,String name, String dateofbirth, String nationality) {
        this.id = id;
        this.name = name;
        this.dateofbirth = dateofbirth;
        this.nationality = nationality;
    }

    //Getter & Setter
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
    public String getDateOfBirth(){
        return dateofbirth;
    }
    public void setDateOfBirth(String dateofbirth){
        this.dateofbirth = dateofbirth;
    }
    public String getNationality(){
        return nationality;
    }
    public void setNationality(String nationality){
        this.nationality = nationality;
    }
}