

public class Main {

    public static void main(String[] args) {
        Author tolstoi = new Author("Лев", "Толстой");
        Author pushkin = new Author("Александр", "Пушкин");

        Book vojnaIMir = new Book("Война и мир", tolstoi, 1856);
        Book zolotajaRyibka = new Book("Золотая рыбка", pushkin, 1891);

        System.out.println(vojnaIMir.getTitle() +", "+ vojnaIMir.getPublicationYear() +", "+ vojnaIMir.getAuthor().getFirstName()+" "+vojnaIMir.getAuthor().getSecondName());

        printBook(zolotajaRyibka);


        vojnaIMir.setPublicationYear(2010);

        printBook(vojnaIMir);

        System.out.println(vojnaIMir.equals(zolotajaRyibka));

        Book vojnaIMirTwo = new Book("Война и мир", tolstoi, 2010);

        System.out.println("vojnaIMir.equals(vojnaIMirTwo) = " + vojnaIMir.equals(vojnaIMirTwo));

        System.out.println("tolstoi.getClass() = " + tolstoi.getClass());
        System.out.println("vojnaIMir.getClass() = " + vojnaIMir.getClass());
    }

    private static void printBook(Book book) {
        System.out.println(book.toString());
    }


    }
