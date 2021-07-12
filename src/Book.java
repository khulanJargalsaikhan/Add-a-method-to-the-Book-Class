public class Book {
    //private attributes
    private String bookTitle;
    private String author;
    private String description;
    private double price;
    private boolean isInStock;
    public int reqNum;

    //default constructor
    public Book(){

    }

    //overloaded constructor
    public Book(String bookTitle, String author, String description, double price, boolean isInStock, int reqNum){
        this.bookTitle = bookTitle;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
        this.reqNum = reqNum;
    }

    //getters and setters
    public void setBookTitle(String bookTitle){
        this.bookTitle = bookTitle;
    }
    public String getBookTitle(){
        return this.bookTitle;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return this.author;
    }

    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public void setIsInStock(boolean isInStock){
        this.isInStock = isInStock;
    }

    public boolean getIsInStock(){
        return this.isInStock;
    }





    //display method
    public void displayText(){
        System.out.printf("Boot Title: %s, Author: %s, Description: %s\n", bookTitle, author, description);
    }

    public double totalPrice(){
        double totalPrice;
        if (isInStock == true){
            totalPrice = reqNum * price;
        }else{
            System.out.println("Out of stock.");
            totalPrice = 0;
        }
        return totalPrice;


    }


}