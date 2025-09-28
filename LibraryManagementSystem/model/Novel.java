package model;

public class Novel extends Book {
    private String language;   // Ngôn ngữ của tiểu thuyết
    private int pages;         // Số trang

    // Constructor đầy đủ
    public Novel(String id, String name, String date, String cate_id,
                 String author_id, String publisher, int quantity, int price,
                 String language, int pages) {
        super(id, name, date, cate_id, author_id, publisher, quantity, price);
        this.language = language;
        this.pages = pages;
    }

    // Getter & Setter cho language
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }

    // Getter & Setter cho pages
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Language='" + language + '\'' +
                ", Pages=" + pages;
    }
}
