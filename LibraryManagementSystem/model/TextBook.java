package model;

public class TextBook extends Book {
    private String subject;      // Môn học
    private String gradeLevel;   // Cấp lớp (ví dụ: 6, 7, 8, 9...)

    // Constructor đầy đủ
    public TextBook(String id, String name, String date, String cate_id,
                    String author_id, String publisher, int quantity, int price,
                    String subject, String gradeLevel) {
        super(id, name, date, cate_id, author_id, publisher, quantity, price);
        this.subject = subject;
        this.gradeLevel = gradeLevel;
    }

    // Getter & Setter cho subject
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Getter & Setter cho gradeLevel
    public String getGradeLevel() {
        return gradeLevel;
    }
    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Subject='" + subject + '\'' +
                ", GradeLevel='" + gradeLevel + '\'';
    }
}
