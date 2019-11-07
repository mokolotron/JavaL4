import com.google.common.collect.TreeMultiset;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;


public class Catalog {

    private TreeMultiset<Book> books;

    public Catalog() {
        this.books = TreeMultiset.create(Comparator.comparing(Book::getAuthor));
       // this.books.comparator();
    }
//    public Catalog(Book[] arr ) {
//        this.books = new TreeSet<Book>(Comparator.comparing(Book::getAuthor));
//        for(Book el : arr)
//            books.add(el);
//        // this.books.comparator();
//    }

    @Override
    public String toString() {
        //System.out.println("in syting");
        StringBuilder result = new StringBuilder(new String(""));
        for(Book book: books)
            result.append("Author: ").append(book.getAuthor()).append("\t Title: ").append(book.getTitle()).append('\n');
        return result.toString();
    }
    /** add given element */
    public void add(Book book){
        books.add(book);
    }
    /** add new element */
    public void addNew(){
        Book book = new Book();
        book.fill();
        books.add(book);
    }
    /** remove chosen element */
    public void remove(){
        System.out.print("Which book do you want to delete?\n");
        System.out.println("1 - by Author \n2 - by Title");
        Scanner scanner2 = new Scanner(System.in);
        int i = scanner2.nextInt();

        System.out.println("1");

        switch(i) {
            case 1 :
                System.out.println("Input Name :  ");
                Scanner scanner1 = new Scanner(System.in);
                String s = scanner1.nextLine();

                for(Iterator<Book> iterator = books.iterator(); iterator.hasNext();) {
                    Book b = iterator.next();
                    if(b.getAuthor().equals(s)) {
                        iterator.remove();
                    }
                }
                break;
            case 2 :
                System.out.print("Input Title :  ");
                Scanner scanner = new Scanner(System.in);
                String name = scanner.nextLine();

                for(Iterator<Book> iterator = books.iterator(); iterator.hasNext();) {
                    Book b = iterator.next();
                    if(b.getAuthor().equals(name)) {
                        iterator.remove();
                    }
                }
                break;
            default :
                System.out.print("You entered the wrong value!\n");
                break;
        }

    }

    /** show searchable element */
        public void search(){
        System.out.print("Which book do you want to find?\n");
        System.out.print("1 - by Author \n 2 - by Title");
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();

        switch(j) {
            case 1 :
                System.out.println("Input author :  ");
                Scanner scanner2 = new Scanner(System.in);
                String line = scanner2.nextLine();

                for(Book obj : books) {
                    if(obj.getAuthor().equals(line)) {
                        System.out.println(obj);
                    }
                }
                break;
            case 2 :
                System.out.print("Input title :  ");
                Scanner scanner1 = new Scanner(System.in);
                String name1 = scanner1.nextLine();

                for(Book obj : books) {
                    if(obj.getTitle().equals(name1)) {
                        System.out.println(obj);
                    }
                }
                break;
            default :
                System.out.print("You entered the wrong value!\n");
                break;
        }

    }

}





