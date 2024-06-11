import java.util.Scanner;
import java.util.InputMismatchException;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        while (true) {
            try {
                System.out.print("Введите целое число: ");
                num = scanner.nextInt();
                System.out.println("Введенное число " + num);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Попробуйте еще раз. (Неправильный ввод: необходимо целое число)");
                scanner.next();
            }
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class Problem2 {

    public static class Circle {
        private double radius;
        private static int numOfObjects = 0;

        public Circle(double radius) {
            if (radius < 0) {
                throw new IllegalArgumentException("Радиус не может быть отрицательным");
            }
            this.radius = radius;
            numOfObjects++;
        }

        public double getRadius() {
            return radius;
        }

        public static int getNumOfObjects() {
            return numOfObjects;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("введите радиус: ");
        double radius = scanner.nextDouble();

        try {
            Circle circle = new Circle(radius);
            System.out.println("круг создан с радиусом " + circle.getRadius());
        } catch (IllegalArgumentException ex) {
            System.out.println("ошибка: " + ex.getMessage());
        }

        System.out.println("количиство созданных обьектов: " + Circle.getNumOfObjects());
    }
}

public class Problem3 {

    public static void main(String[] args) {
        int numberOfObjects = 0;

        try {
            numberOfObjects = createCircles(5, 5, 0);
        } catch (InvalidRadiusException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("кол-во созданных обьектов: " + numberOfObjects);
    }

    public static int createCircles(double radius1, double radius2, double radius3) throws InvalidRadiusException {
        int count = 0;

        CircleWithCustomException circle1 = new CircleWithCustomException(radius1);
        count++;

        CircleWithCustomException circle2 = new CircleWithCustomException(radius2);
        count++;

        CircleWithCustomException circle3 = new CircleWithCustomException(radius3);
        count++;

        return count;
    }
}

class CircleWithCustomException {

    private double radius;
    private static int numberOfObjects = 0;

    public CircleWithCustomException(double radius) throws InvalidRadiusException {
        if (radius < 0) {
            throw new InvalidRadiusException("некоректный радиус. он не может быть отрицателен");
        }
        this.radius = radius;
        numberOfObjects++;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

}

class InvalidRadiusException extends Exception {

    public InvalidRadiusException(String message) {
        super(message);
    }
}

public class Problem4 {
    public static void main(String[] args) {
        try {
            method();
            System.out.println("After the method call");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("IndexOutOfBoundsException in method()");
        } catch (Exception ex) {
            System.out.println("Exception in main");
        }
    }

    static void method() throws Exception {
        try {
            String s = "abc";
            System.out.println(s.charAt(3));
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("IndexOutOfBoundsException in method()");
        }
    }
}

import java.io.*;

public class Problem5 {

    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.out.println("Usage: java RemoveText string filename");
            System.exit(1);
        }

        String target = args[0];
        File file = new File(args[1]);

        if (!file.exists()) {
            System.out.println("Error: File " + file + " does not exist.");
            System.exit(1);
        }

        String tempFile = "temp.txt";
        BufferedReader reader = new BufferedReader(new FileReader(file));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String line;
        while ((line = reader.readLine()) != null) {
            line = line.replaceAll(target, "");
            writer.write(line);
            writer.newLine();
        }

        reader.close();
        writer.close();

        file.delete();
        new File(tempFile).renameTo(file);

        System.out.println("All occurrences of \"" + target + "\" removed from " + file);
    }
}