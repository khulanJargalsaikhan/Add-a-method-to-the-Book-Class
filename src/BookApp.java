public class BookApp {
    public static void main(String[] args){
        Book b1 = new Book("To Kill a Mockingbird", "Harper Lee","Published in 1960, " +
                "this timeless classic explores human behaviour and the collective conscience of The Deep South " +
                "in the early 20th century. Humour entwines the delicate strands of prejudice, hatred, hypocrisy, " +
                "love and innocence to create one of the best novels ever written.", 20.0, true, 5);

        b1.displayText();
        System.out.println("Requested num: " + b1.reqNum);
        System.out.println( "Total price is: $" + b1.totalPrice());
        System.out.println( "----------------------------");

        Book b2 = new Book("1984", "George Orwell", "Although 1984 has passed us by, George Orwell’s dystopian, " +
                "totalitarian world of control, fear and lies has never been more relevant. " +
                "Delve into the life of Winston Smith as he struggles with his developing human nature " +
                "in a world where individuality, freewill and love are forbidden.", 15.0, false, 2);

        b2.displayText();
        System.out.println("Requested num: " + b2.reqNum);
        System.out.println("Total price is: $" + b2.totalPrice());
        System.out.println( "----------------------------");



    }
}