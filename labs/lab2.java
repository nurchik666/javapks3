import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public static class Library {
        private List<Book> books;

        public Library() {
            this.books = new ArrayList<>();
        }

        public void addBook(Book book) {
            books.add(book);
        }

        public void removeBook(Book book) {
            books.remove(book);
        }

        public void displayBooks() {
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getIsbn());
            }
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);

        System.out.println("Books added to library:");
        library.displayBooks();

        library.removeBook(book1);
        System.out.println("\nAfter removing a book:");
        library.displayBooks();
    }
}

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5.0);

        double radius = circle.getRadius();
        System.out.println("Радиус : " + radius);

        circle.setRadius(7.0);
        radius = circle.getRadius();
        System.out.println("Измененный радиус : " + radius);

        double area = circle.calculateArea();
        System.out.println("Площадь : " + area);

        double circumference = circle.calculateCircumference();
        System.out.println("Окружность : " + circumference);
    }
}

import java.time.LocalDate;
import java.time.Period;

public class Worker {
    private String name;
    private double salary;
    private LocalDate hireDate;

    public Worker(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public int calculateYearsOfWork() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(hireDate, currentDate);
        return period.getYears();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public static void main(String[] args) {
        Worker worker = new Worker("Ванек", 50000, LocalDate.of(2020, 7, 15));
        System.out.println("Имя: " + worker.getName());
        System.out.println("Зарплата: " + worker.getSalary());
        System.out.println("Дата приема на работу: " + worker.getHireDate());
        System.out.println("Стаж работы     : " + worker.calculateYearsOfWork());
    }
}

import java.util.ArrayList;
import java.util.List;

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. Current balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "Current balance: " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added: " + account.getAccountNumber());
    }

    public void removeAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                accounts.remove(account);
                System.out.println("Account removed: " + accountNumber);
                return;
            }
        }
        System.out.println("Account not found: " + accountNumber);
    }

    public void deposit(String accountNumber, double amount) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.deposit(amount);
                return;
            }
        }
        System.out.println("Account not found: " + accountNumber);
    }

    public void withdraw(String accountNumber, double amount) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.withdraw(amount);
                return;
            }
        }
        System.out.println("Account not found: " + accountNumber);
    }
}

public class UserAccount {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account("1246", 1000);
        Account account2 = new Account("6421", 2000);

        bank.addAccount(account1);
        bank.addAccount(account2);

        bank.deposit("1246", 500);
        bank.withdraw("6421", 1000);

        bank.removeAccount("1246");
    }
}

public class TrafficLight {
    public enum Color {
        RED,
        YELLOW,
        GREEN
    }

    private Color color;
    private int duration;

    public TrafficLight(Color initialColor, int duration) {
        this.color = initialColor;
        this.duration = duration;
    }

    public void changeColor() {
        switch (color) {
            case RED:
                color = Color.GREEN;
                break;
            case YELLOW:
                color = Color.RED;
                break;
            case GREEN:
                color = Color.YELLOW;
                break;
        }
    }

    public boolean isRed() {
        return color == Color.RED;
    }

    public boolean isGreen() {
        return color == Color.GREEN;
    }

    public Color getColor() {
        return color;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight(Color.RED, 10);
        System.out.println("Initial color: " + trafficLight.getColor());

        trafficLight.changeColor();
        System.out.println("New color: " + trafficLight.getColor());

        System.out.println(" red? " + trafficLight.isRed());
        System.out.println("green? " + trafficLight.isGreen());
    }
}

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private double grade;
    private List<String> courses;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }

    public static void main(String[] args) {
        Student student = new Student("Илья", 5);
        System.out.println("Имя: " + student.getName());
        System.out.println("Оценка: " + student.getGrade());

        student.addCourse("Математика");
        student.addCourse("Физика");
        student.addCourse("Химия");

        System.out.println("Курсы: " + student.getCourses());

        student.removeCourse("Математика");

        System.out.println("Курсы студента после: " + student.getCourses());
    }
}

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        double area = rectangle.calculateArea();
        double perimeter = rectangle.calculatePerimeter();

        System.out.println("Площадь : " + area);
        System.out.println("Периметр : " + perimeter);
    }
}

package lab2;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Илья", 30);
        Person person2 = new Person("Маша", 25);

        System.out.println("Имя: " + person1.getName() + ", Возраст: " + person1.getAge());
        System.out.println("Имя: " + person2.getName() + ", Возраст: " + person2.getAge());
    }
}

public class Employee {
    private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void calculateSalary(double bonus) {
        this.salary += bonus;
    }

    public void updateSalary(double newSalary) {
        this.salary = newSalary;
    }

    public void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Позиция: " + position);
        System.out.println("Зарплата: " + salary);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("илья ", "админ", 50000);
        employee.displayInfo();
        employee.calculateSalary(5000);
        employee.updateSalary(55000);
        employee.displayInfo();
    }
}

package lab2;

public class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Артур", "Чихуахуа");
        Dog dog2 = new Dog("Игорь", "Спаниель");

        System.out.println("Исходные значения:");
        System.out.println("Собака 1:");
        System.out.println("Имя: " + dog1.getName());
        System.out.println("Порода: " + dog1.getBreed());
        System.out.println("Собака 2:");
        System.out.println("Имя: " + dog2.getName());
        System.out.println("Порода: " + dog2.getBreed());

        dog1.setName("Рон");
        dog2.setBreed("Мопс");

        System.out.println("\nОбновленные значения:");
        System.out.println("Собака 1:");
        System.out.println("Имя: " + dog1.getName());
        System.out.println("Порода: " + dog1.getBreed());
        System.out.println("Собака 2:");
        System.out.println("Имя: " + dog2.getName());
        System.out.println("Порода: " + dog2.getBreed());
    }
}