package akademia;

public class Book
{
    public String title;
    public Author author;
    public double price;


    public Book (String title,Author author, double price){
        this.title = title;
        this.price = price;
        this.author = author;
    }

    public void setTitle (String title){
        this.title = title;
    }

    public void setAuthor (Author author){
        this.author = author;
    }

    public void setPrice (double price){
        this.price = price;
    }

    public String getTitle (){
        return title;
    }

    public String getAuthor(){
        return author.getFirstName()+" "+author.getLastName();
    }
    public double getPrice(){
        return price;
    }

}
