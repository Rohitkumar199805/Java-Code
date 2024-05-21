class Library{
    String [] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books=0;
    }
    public void addBook(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book + "has been added");
    }
    public void showAvailableBooks(){
        System.out.println("Available books are");
        for (String book  : this.books) {
            if(book==null){
                continue;
            }
            System.out.println(" * " +book);
        }

    }
    public  void issueBook(String book){
        for(int i =0; i<this.books.length;i++){
            if(this.books[i].equals(book)){
                System.out.println(" The book has been issued");
                this.books[i]=null;
                return;
            }
        }
          System.out.println(" this book does not exits");
    }
}




public class Problem3 {
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addBook("THINK AND GROW RICH");
        centralLibrary.addBook("C++");
        centralLibrary.addBook("Java");
        centralLibrary.showAvailableBooks();
        centralLibrary.issueBook(" C++");
        centralLibrary.showAvailableBooks();
    }
}
