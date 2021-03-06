package picadillybookstore.domain;

/**
 *
 * @author Elbert Christopher Larosa
 * @version 1.0
 * @since 2015-5-28
 */

import java.util.ArrayList;
import java.util.List;
public class Book {
    //------------
    // Attributes.
    //------------
    String author;
    String title;
    String isbn;
    long price;
    long quantity;
    String publisherName;
    int yearPublished;
    String description;
    Binding binding;
    Signed signed;
    List keywords = new ArrayList();
    List category = new ArrayList(); 
    
    //----------------
    // Constructor(s).
    //----------------
    public Book(String author, String title, String isbn, long price, long quantity, String publisherName, int yearPublished, String description, Binding binding, Signed signed, List keywords, List category) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
        this.price = price;
        this.quantity = quantity;
        this.publisherName = publisherName;
        this.yearPublished = yearPublished;
        this.description = description;
        this.binding = binding;
        this.signed = signed;
        this.keywords = keywords;
        this.category = category;
    }
    
    //----------------------------------
    // Accessor methods.
    //----------------------------------
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public long getPrice() {
        return price;
    }

    public long getQuantity() {
        return quantity;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public String getDescription() {
        return description;
    }

    public Binding getBinding() {
        return binding;
    }

    public Signed getSigned() {
        return signed;
    }

    public List getKeywords() {
        return keywords;
    }

    public List getCategory() {
        return category;
    }

   

    //----------------------------------
    // Mutator methods.
    //----------------------------------
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public void setPrice(long price) {
        this.price = price;
    }
    
    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }
    
    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }
    
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public void setBinding(Binding binding) {
        this.binding = binding;
    }

    public void setSigned(Signed signed) {
        this.signed = signed;
    }
    
    public void setKeywords(List keywords) {
        this.keywords = keywords;
    }

    public void setCategory(List category) {
        this.category = category;
    }
    //-----------------------------
    // Business logic methods.
    //-----------------------------


    //------------------------------------
    // Miscellaneous other methods.
    //------------------------------------

    public void display()
    {
        String element;
        int keywordsCounter;
        int categoryCounter;
        System.out.println("Title          : " + this.getTitle());
        System.out.println("Author         : " + this.getAuthor());
        System.out.println("ISBN           : " + this.getIsbn());
        System.out.println("Price          : Rp. " + this.getPrice());
        System.out.println("Quantity       : " + this.getQuantity());
        System.out.println("Publisher Name : " + this.getPublisherName());
        System.out.println("Year Published : " + this.getYearPublished());
        System.out.println("Description    : " + this.getDescription());
        System.out.println("Binding        : " + this.getBinding());
        System.out.println("Signed         : " + this.getSigned());
        System.out.print("Keywords       : ");
        keywordsCounter =0;
        for(Object object : keywords) {
            keywordsCounter+=1;
            element = (String) object;
            System.out.print(element);
            if (keywordsCounter!=this.keywords.size())
            {
                System.out.print(" , ");
            }
        }
        System.out.println("");
        
        System.out.print("Category       : ");
        categoryCounter=0;
        for(Object object : category) {
            categoryCounter+=1;
            element = (String) object;
            System.out.print(element);
            if (categoryCounter!=this.category.size())
            {
                System.out.print(" , ");
            }
        }
        System.out.println("");
        System.out.println("");
    
    }
}
