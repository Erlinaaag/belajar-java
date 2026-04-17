// Class Book
class Book {

    String title;
    String author;
    int year;

    // Konstruktor
    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Year   : " + year);
    }
}


// Class Shape (Method Overloading)
class Shape {

    // Persegi
    int area(int side) {
        return side * side;
    }

    // Persegi panjang
    int area(int length, int width) {
        return length * width;
    }
}


// Class Main
public class Main {
    public static void main(String[] args) {

        // ===== Calculator =====
        Calculator calc = new Calculator();
        System.out.println("=== Calculator ===");
        System.out.println("Tambah: " + calc.add(10, 5));
        System.out.println("Kurang: " + calc.subtract(10, 5));
        System.out.println("Kali  : " + calc.multiply(10, 5));

        System.out.println();

        // ===== Book =====
        System.out.println("=== Book ===");
        Book book1 = new Book("Belajar Java", "Erlin", 2026);
        book1.displayInfo();

        System.out.println();

        // ===== Shape =====
        System.out.println("=== Shape ===");
        Shape shape = new Shape();
        System.out.println("Luas Persegi (sisi 4): " + shape.area(4));
        System.out.println("Luas Persegi Panjang (4 x 6): " + shape.area(4, 6));
    }             ;
}