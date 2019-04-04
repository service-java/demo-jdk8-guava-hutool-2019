package _swing.tree;

public class Book {
    private String title;// 书名
    private String press;// 出版?
    private String publicationDate; // 出版时间
    private String booksCategory; // 丛书类别
    private double price;// 定价

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getBooksCategory() {
        return booksCategory;
    }

    public void setBooksCategory(String booksCategory) {
        this.booksCategory = booksCategory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
