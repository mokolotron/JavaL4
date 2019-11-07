import java.util.Scanner;

public class Main {
    /**  * @param args   */
    public static void main (String[]args) {
        Book obj[]=new Book[6];
        obj[0]=new Book("Stiven King","Fog");
        obj[1]=new Book("Clifford Simak","Again and again");
        obj[2]=new Book("Clark Mindless","All flesh is grass");
        obj[3]=new Book("Abstarct writer","Illuzion labatory");
        obj[4]=new Book("Abstarct writer2","Real labatory");
        obj[5]=new Book("Example author","Example title");

        Catalog cont = new Catalog();
        for(int i=0;i<6;i++) {
             cont.add(obj[i]);
        }
        int action=5;

        while(action!=0) {
            System.out.print("Input some number from below \n");
            System.out.print("1 - Show Catalog \n");
            System.out.print("2 - Add new book\n");
            System.out.print("3 - Remove book\n");
            System.out.print("4 - Search book\n");
            System.out.print("0 - Exit!\n\n");
            System.out.print("Input number of menu\n");
            Scanner act = new Scanner(System.in);
            action = act.nextInt();

            switch(action) {
                case 1 :
                   System.out.println(cont);
                    break;
                case 2 :
                    cont.addNew();
                    break;
                case 3 :
                    cont.remove();
                    break;
                case 4 :
                    cont.search();
                    break;
                case 0 :
                    System.out.print("Goodbye");
                    break;
                default :
                    System.out.print("The wrong value!\n");
                    break;
            }
        }

    }
}

