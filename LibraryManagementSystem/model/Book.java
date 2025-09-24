package model;

public class Book {
    private String id;
    private String name;
    private String publish;
    private String category_id;
    private String author_id;
    private int quantity;
    //Constructor
    public Book(String id, String name, String publish, String category_id, String author_id, int quantity){
        this.id = id;
        this.name = name;
        this.publish = publish;
        this. category_id = category_id;
        this.author_id = author_id;
        this.quantity = quantity;
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
    public String getPublish(){
        return publish;
    }
    public void setPublish(String publish){
        this.publish = publish;
    }
    public String getCategory_id(){
        return category_id;
    }
    public void setCategory_id(String category_id){
        this.category_id = category_id;
    }
    public String getAuthor_id(){
        return author_id;
    }
    public void setAuthor_id(String author_id){
        this.author_id = author_id;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}
