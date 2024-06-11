import java.util.Scanner;

public class beecrowd1001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int X = A + B;

        System.out.println("X =" + X);

        scanner.close();
    }
}

import java.util.Scanner;

public class beecrowd1002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double R = scanner.nextDouble();
        double pi = 3.14159;
        double A = pi * Math.pow(R, 2);
        System.out.printf("A=%.4f\n", A);
    }
}

import java.util.Scanner;

public class beecrowd1003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int SOMA = A + B;

        System.out.println("SOMA = " + SOMA);

        scanner.close();
    }
}

import java.util.Scanner;

public class beecrowd1004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int prod = a * b;

        System.out.println("PROD = " + prod);

        scanner.close();
    }
}

import java.util.Scanner;

public class beecrowd1005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();

        double average = ((A * 3.5) + (B * 7.5)) / (3.5 + 7.5);

        System.out.printf("MEDIA = %.5f\n", average);

        sc.close();
    }
}

import java.util.Scanner;

public class beecrowd1007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        int difference = (A * B) - (C * D);

        System.out.println("DIFERENCA = " + difference);
    }
}

import java.util.Scanner;

public class beecrowd1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employeeNumber = scanner.nextInt();
        int workedHours = scanner.nextInt();
        double hourlyRate = scanner.nextDouble();

        double salary = workedHours * hourlyRate;

        System.out.printf("NUMBER = %d\n", employeeNumber);
        System.out.printf("SALARY = U$ %.2f\n", salary);

        scanner.close();
    }
}

import java.util.Scanner;

public class beecrowd1009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        double salary = Double.parseDouble(input.nextLine());
        double totalSales = Double.parseDouble(input.nextLine());

        double totalSalary = salary + (totalSales * 0.15);

        System.out.printf("TOTAL = R$ %.2f%n", totalSalary);

        input.close();
    }
}

import java.util.Scanner;

public class beecrowd1010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codeProduct1 = scanner.nextInt();
        int unitsProduct1 = scanner.nextInt();
        double priceProduct1 = scanner.nextDouble();

        int codeProduct2 = scanner.nextInt();
        int unitsProduct2 = scanner.nextInt();
        double priceProduct2 = scanner.nextDouble();

        double totalAmount = (unitsProduct1 * priceProduct1) + (unitsProduct2 * priceProduct2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalAmount);

        scanner.close();
    }
}

import java.util.Scanner;

public class beecrowd1011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius = scanner.nextDouble();

        double volume = (4.0 / 3.0) * 3.14159 * Math.pow(radius, 3);

        System.out.printf("VOLUME = %.3f\n", volume);

        scanner.close();
    }
}

import java.util.Scanner;

public class beecrowd1012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double triangulo = (A * C) / 2;
        double circulo = 3.14159 * C * C;
        double trapezio = ((A + B) * C) / 2;
        double quadrado = B * B;
        double retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f\n", triangulo);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETANGULO: %.3f\n", retangulo);

        scanner.close();
    }
}

import java.util.Scanner;

public class beecrowd1013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int greatest = Math.max(a, Math.max(b, c));

        System.out.println(greatest + " eh o maior");

        scanner.close();
    }
}

import java.util.Scanner;

public class beecrowd1014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distance = scanner.nextInt();
        double fuel = scanner.nextDouble();

        double averageConsumption = distance / fuel;

        System.out.printf("%.3f km/l", averageConsumption);

        scanner.close();
    }
}

import java.util.Scanner;

public class beecrowd1015{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("%.4f\n", distance);

        sc.close();
    }
}

   import java.util.Scanner;

public class beecrowd1016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distance = scanner.nextInt();

        int time = distance * 2;

        System.out.println(time + " minut");

        scanner.close();
    }
}
     
import java.util.Scanner;

public class beecrowd1017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int time = scanner.nextInt();
        int speed = scanner.nextInt();

        double distance = time * speed;

        double fuelNeeded = distance / 12.0;

        System.out.printf("%.3f\n", fuelNeeded);

        scanner.close();
    }
}

import java.util.Scanner;

public class beecrowd1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
        int[] banknotes = {100, 50, 20, 10, 5, 2, 1};
        for (int note : banknotes) {
            int count = N / note;
            System.out.println(count + " nota(s) de R$ " + note + ",00");
            N %= note;
        }
    }
}

import java.util.Scanner;

public class beecrowd1019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int seconds = scanner.nextInt();

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;

        System.out.printf("%d:%02d:%02d\n", hours, minutes, remainingSeconds);

        scanner.close();
    }
}

import java.util.Scanner;

public class beecrowd1020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ageInDays = scanner.nextInt();

        int years = ageInDays / 365;
        int months = (ageInDays % 365) / 30;
        int days = (ageInDays % 365) % 30;

        System.out.println(years + " ano(s)");
        System.out.println(months + " mes(es)");
        System.out.println(days + " dia(s)");

        scanner.close();
    }
}

import java.util.Scanner;

public class beecrowd1032 {
    static int[] prime = new int[32650];

    public static int flavious(int n) {
        int r = 0;
        for (int i = 1; i <= n; i++) {
            r = (r + prime[n - i]) % i;
        }
        return r;
    }

    public static boolean isPrime(int n) {
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void primeNumbers() {
        int a = 0;
        for (int j = 2; j < prime.length; j++) {
            if (isPrime(j)) {
                prime[a] = j;
                a++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        primeNumbers();

        while (true) {
            int x = scanner.nextInt();
            if (x == 0) break;
            System.out.println(flavious(x) + 1);
        }
        scanner.close();
    }
}

import java.io.IOException;
import java.util.Scanner;

public class beecrowd1035 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        if ((b > c) && (d > a) && (c+d > a+b) && (c >= 0 && d >= 0) && (a%2 == 0)){
            System.out.printf("Valores aceitos\n");
        }
        else{
            System.out.printf("Valores nao aceitos\n");
        }
    }
}

import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class beecrowd1036 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        double root = (B * B - 4 * A * C);
        if(A != 0 && root > 0){
            double R1 = (- B + Math.sqrt(root)) / (2 * A);
            double R2 = (- B - Math.sqrt(root)) / (2 * A);
            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);
        }
        else{
            System.out.println("Impossivel calcular");
        }
    }
}

import java.io.IOException;
import java.util.Scanner;

public class beecrowd1037 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        if (num > 75.00001 && num <= 100){
            System.out.println("Intervalo (75,100]");
        }
        else if (num > 50.00001 && num <= 75){
            System.out.println("Intervalo (50,75]");
        }
        else if (num > 25.00001 && num <= 50){
            System.out.println("Intervalo (25,50]");
        }
        else if (num >= 0 && num <= 25){
            System.out.println("Intervalo [0,25]");
        }
        else{
            System.out.println("Fora de intervalo");
        }
    }
}

import java.io.IOException;
import java.util.Scanner;

public class beecrowd1040 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        float n1 = input.nextFloat();
        float n2 = input.nextFloat();
        float n3 = input.nextFloat();
        float n4 = input.nextFloat();

        float avg = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / (2 + 3 + 4 + 1);

        System.out.printf("Media: %.1f\n", avg);

        if (avg >= 7){
            System.out.printf("Aluno aprovado.\n");
        }
        else if (avg < 5){
            System.out.printf("Aluno reprovado.\n");
        }
        else{
            System.out.printf("Aluno em exame.\n");
            float score = input.nextFloat();
            System.out.printf("Nota do exame: %.1f\n", score);
            float new_avg = (avg + score) / 2;
            if (new_avg >= 5){
                System.out.printf("Aluno aprovado.\n");
            }
            else{
                System.out.printf("Aluno reprovado.\n");
            }
            System.out.printf("Media final: %.1f\n", new_avg);
        }
    }
}

import java.io.IOException;
import java.util.Scanner;

public class beecrowd1041{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        float x = input.nextFloat();
        float y = input.nextFloat();
        if (x == 0 && y == 0){
            System.out.printf("Origem\n");
        }
        else if (x != 0 && y == 0){
            System.out.printf("Eixo X\n");
        }
        else if (x == 0 && y != 0){
            System.out.printf("Eixo Y\n");
        }
        else if (x > 0 && y > 0){
            System.out.printf("Q1\n");
        }
        else if (x < 0 && y > 0){
            System.out.printf("Q2\n");
        }
        else if (x < 0 && y < 0){
            System.out.printf("Q3\n");
        }
        else{
            System.out.printf("Q4\n");
        }
    }
}

import java.util.Scanner;

public class beecrowd1581 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short cases = scanner.nextShort();

        for (int i = 0; i < cases; i++) {
            short numPeople = scanner.nextShort();

            String current = scanner.nextLine();
            current = scanner.nextLine();

            boolean isEnglish = false;
            String previous = current;

            for (int j = 1; j < numPeople; j++) {
                String next = scanner.nextLine();
                if (!current.equals(previous) && !isEnglish) {
                    isEnglish = true;
                } else {
                    previous = current;
                }
                current = next;
            }

            if (isEnglish) {
                System.out.println("ingles");
            } else {
                System.out.println(current);
            }
        }

        scanner.close();
    }
}

import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class beecrowd1042 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        int[] arr = {x, y, z};
        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}

import java.io.IOException;
import java.util.Scanner;

public class beecrowd1043 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        float x = input.nextFloat();
        float y = input.nextFloat();
        float z = input.nextFloat();
        if ((x + y > z) && (y + z > x) && (x + z > y)){
            System.out.printf("Perimetro = %.1f\n", (x + y + z));
        }
        else{
            System.out.printf("Area = %.1f\n", (1.0/2) * (x + y) * z);
        }
    }
}

import java.io.IOException;
import java.util.Scanner;

public class beecrowd1044 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if ((b % a == 0) || (a % b == 0)){
            System.out.println("Sao Multiplos");
        }
        else{
            System.out.println("Nao sao Multiplos");
        }
    }
}

import java.io.IOException;
import java.util.Scanner;

public class beecrowd1044 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if ((b % a == 0) || (a % b == 0)){
            System.out.println("Sao Multiplos");
        }
        else{
            System.out.println("Nao sao Multiplos");
        }
    }
}

import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class beecrowd1045 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double[] arr = {a, b, c};
        Arrays.sort(arr);
        a = arr[2];
        b = arr[1];
        c = arr[0];
        if (a >= (b + c)){
            System.out.println("NAO FORMA TRIANGULO");
        }
        else if ((a * a) == ((b * b) + (c * c))){
            System.out.println("TRIANGULO RETANGULO");
        }
        else if ((a * a) > ((b * b) + (c * c))){
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        else if ((a * a) < ((b * b) + (c * c))){
            System.out.println("TRIANGULO ACUTANGULO");
        }

        if (a == b && a == c){
            System.out.println("TRIANGULO EQUILATERO");
        }
        if ((a == b && a != c) || (b == c && b != a) || (a == c && a != b)){
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}

import java.io.IOException;
import java.util.Scanner;

public class beecrowd1046 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int ans;
        if (x < y){
            ans = y - x;
        }
        else{
            ans = (24 - x) + y;
        }
        System.out.printf("O JOGO DUROU %d HORA(S)\n", ans);
    }
}

import java.io.IOException;
import java.util.Scanner;

public class beecrowd1047 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int h1 = input.nextInt();
        int m1 = input.nextInt();
        int h2 = input.nextInt();
        int m2 = input.nextInt();
        int total_hour, total_minute;
        if ((h1 == h2) && (m1 == m2)){
            total_hour = (24 - h1) + h2;
            total_minute = m2 - m1;
        }
        else if ((h1 == h2) && (m1 < m2)){
            total_hour = h2 - h1;
            total_minute = m2 - m1;
        }
        else if ((h1 == h2) && (m1 > m2)){
            total_hour = (24 - h1) + h2 - 1;
            total_minute = (60 - m1) + m2;
        }
        else if ((h1 < h2) && (m1 == m2)){
            total_hour = h2 - h1;
            total_minute = m2 - m1;
        }
        else if ((h1 > h2) && (m1 == m2)){
            total_hour = (24 - h1) + h2;
            total_minute = m2 - m1;
        }
        else if ((h1 < h2) && (m1 < m2)){
            total_hour = h2 - h1;
            total_minute = m2 - m1;
        }
        else if ((h1 < h2) && (m1 > m2)){
            total_hour = h2 - h1 - 1;
            total_minute = (60 - m1) + m2;
        }
        else if ((h1 > h2) && (m1 < m2)){
            total_hour = (24 - h1) + h2 - 1;
            total_minute = m2 - m1;
        }
        else{
            total_hour = (24 - h1) + h2 - 1;
            total_minute = (60 - m1) + m2;
        }
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", total_hour, total_minute);
    }
}

import java.util.Scanner;

public class beecrowd1049 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        String y = scanner.nextLine();
        String z = scanner.nextLine();
        String animal = "";

        if (x.equals("vertebrado")) {
            if (y.equals("ave")) {
                if (z.equals("carnivoro")) {
                    animal = "aguia";
                } else if (z.equals("onivoro")) {
                    animal = "pomba";
                }
            } else if (y.equals("mamifero")) {
                if (z.equals("onivoro")) {
                    animal = "homem";
                } else if (z.equals("herbivoro")) {
                    animal = "vaca";
                }
            }
        } else if (x.equals("invertebrado")) {
            if (y.equals("inseto")) {
                if (z.equals("hematofago")) {
                    animal = "pulga";
                } else if (z.equals("herbivoro")) {
                    animal = "lagarta";
                }
            } else if (y.equals("anelideo")) {
                if (z.equals("hematofago")) {
                    animal = "sanguessuga";
                } else if (z.equals("onivoro")) {
                    animal = "minhoca";
                }
            }
        }

        System.out.println(animal);
    }
}

import java.util.*;

class beecrowd1055 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = 1;
        while (n-- > 0) {
            System.out.print("Case " + c++ + ": ");
            int q = scanner.nextInt();
            List<Integer> resp = new ArrayList<>();
            while (q-- > 0) {
                int r = scanner.nextInt();
                resp.add(r);
            }
            Collections.sort(resp);
            int t = 0, x = 0, y = resp.size() - 1;
            Deque<Integer> ans = new ArrayDeque<>();
            while (t < resp.size()) {
                if (ans.isEmpty())
                    ans.add(resp.get(y--));
                else {
                    PriorityQueue<iii> pq = new PriorityQueue<>(Collections.reverseOrder());
                    pq.add(new iii(new ii(Math.abs(resp.get(x) - ans.peekFirst()), 1), x));
                    pq.add(new iii(new ii(Math.abs(resp.get(x) - ans.peekLast()), 2), x));
                    pq.add(new iii(new ii(Math.abs(resp.get(y) - ans.peekFirst()), 3), y));
                    pq.add(new iii(new ii(Math.abs(resp.get(y) - ans.peekLast()), 4), y));
                    iii top = pq.poll();
                    if (top.first.second == 1) {
                        ans.addFirst(resp.get(top.second));
                        x++;
                    } else if (top.first.second == 2) {
                        ans.addLast(resp.get(top.second));
                        x++;
                    } else if (top.first.second == 3) {
                        ans.addFirst(resp.get(top.second));
                        y--;
                    } else {
                        ans.addLast(resp.get(top.second));
                        y--;
                    }
                }
                t++;
            }
            int sum = 0;
            Iterator<Integer> iterator = ans.iterator();
            int prev = iterator.next();
            while (iterator.hasNext()) {
                int current = iterator.next();
                sum += Math.abs(prev - current);
                prev = current;
            }
            System.out.println(sum);
        }
    }

    static class ii implements Comparable<ii> {
        int first, second;

        public ii(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public int compareTo(ii other) {
            if (this.first != other.first)
                return Integer.compare(this.first, other.first);
            return Integer.compare(this.second, other.second);
        }
    }

    static class iii implements Comparable<iii> {
        ii first;
        int second;

        public iii(ii first, int second) {
            this.first = first;
            this.second = second;
        }

        public int compareTo(iii other) {
            return this.first.compareTo(other.first);
        }
    }
}

import java.util.Scanner;

public class beecrowd1068 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {

            String expression = scanner.nextLine();
            int openCount = 0;
            boolean incorrect = false;

            for (int i = 0; i < expression.length(); i++) {
                char character = expression.charAt(i);
                if (character == ')') {
                    if (openCount == 0) {
                        incorrect = true;
                        break;
                    }
                    openCount--;
                } else if (character == '(') {
                    openCount++;
                }
            }
            if (incorrect || openCount > 0) {
                System.out.println("incorrect");
            } else {
                System.out.println("correct");
            }
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class beecrowd1120 {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String l;
        while (!(l = in.readLine()).equals("0 0")) {
            String[] p = l.split("\\s");
            String D = p[0];
            String N = p[1];
            String r = N.replace(D, "");
            r = r.replaceFirst("0*", "");
            System.out.println(r.length() > 0 ? r : 0);
        }
        out.close();
    }
}

import java.util.*;

class beecrowd1137 {
    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Point point = (Point) obj;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    static class Circle {
        double x, y;

        Circle(double x, double y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Circle circle = (Circle) obj;
            return Double.compare(circle.x, x) == 0 && Double.compare(circle.y, y) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    static ArrayList<Point> circ = new ArrayList<>();
    static double EPS = 1e-9;

    // Calculating the area of a triangle formed by three points
    static double triangleArea(Point a, Point b, Point c) {
        return Math.abs((a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y)) / 2.0);
    }

    static Circle ccenter(Point a, Point b, Point c) {
        double x1 = b.x - a.x;
        double y1 = b.y - a.y;
        double x2 = c.x - a.x;
        double y2 = c.y - a.y;
        double z1 = x1 * (a.x + b.x) + y1 * (a.y + b.y);
        double z2 = x2 * (a.x + c.x) + y2 * (a.y + c.y);
        double d = 2.0 * (x1 * (c.y - b.y) - y1 * (c.x - b.x));
        double centerX = (y2 * z1 - y1 * z2) / d;
        double centerY = (x1 * z2 - x2 * z1) / d;
        return new Circle(centerX, centerY);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int N = scanner.nextInt();
            if (N == 0) break;
            circ.clear();
            for (int i = 0; i < N; i++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                circ.add(new Point(x, y));
            }
            int maxCocircular = 1;
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    for (int k = j + 1; k < N; k++) {
                        if (!colinear(circ.get(i), circ.get(j), circ.get(k))) {
                            Circle circle = ccenter(circ.get(i), circ.get(j), circ.get(k));
                            int count = 0;
                            for (Point point : circ) {
                                double distance = Math.sqrt(Math.pow(point.x - circle.x, 2) + Math.pow(point.y - circle.y, 2));
                                if (Math.abs(distance - Math.sqrt((circ.get(i).x - circle.x)*(circ.get(i).x - circle.x) + (circ.get(i).y - circle.y)*(circ.get(i).y - circle.y))) < EPS) count++;
                            }
                            maxCocircular = Math.max(maxCocircular, count);
                        }
                    }
                }
            }
            System.out.println(maxCocircular);
        }
        scanner.close();
    }

    static boolean colinear(Point a, Point b, Point c) {
        return Math.abs((a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y)) / 2.0) < EPS;
    }
}

import java.util.Scanner;

public class beecrowd1138 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            if (A == 0 && B == 0) {
                break;
            }

            int[] digitCount = new int[10];
            countDigits(A, B, digitCount);

            for (int count : digitCount) {
                System.out.print(count + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    private static void countDigits(int A, int B, int[] digitCount) {
        for (int num = A; num <= B; num++) {
            int temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                digitCount[digit]++;
                temp /= 10;
            }
        }
    }
}

import java.util.Scanner;

public class beecrowd1168 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numTestCases = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numTestCases; i++) {
            String value = scanner.nextLine();
            int numLEDs = calculateLEDs(value);
            System.out.println(numLEDs + " leds");
        }

        scanner.close();
    }

    public static int calculateLEDs(String value) {
        int[] ledsPerDigit = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};

        int totalLEDs = 0;

        for (int j = 0; j < value.length(); j++) {
            int digit = Character.getNumericValue(value.charAt(j));
            totalLEDs += ledsPerDigit[digit];
        }

        return totalLEDs;
    }
}

import java.util.Scanner;

public class beecrowd1235 {

public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int N = leitor.nextInt();
    for (int i = 0; i < N; i++) {
        String frase = readLine(leitor);
        StringBuilder parte1 = new StringBuilder(frase.substring(0, frase.length() / 2));
        StringBuilder parte2 = new StringBuilder(frase.substring(frase.length() / 2, frase.length()));
        parte1.reverse();
        parte2.reverse();
        System.out.println(parte1.toString() + parte2.toString());
    }
}

public static String readLine(Scanner leitor) {
    String line = leitor.nextLine();
    while (line.isEmpty())
        line = leitor.nextLine();
    return line;
}

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class beecrowd1237 {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String s1, s2, max, min;
        while ((s1 = in.readLine()) != null) {
            s2 = in.readLine();
            if (s1.length() >= s2.length()) {
                max = s1;
                min = s2;
            } else {
                max = s2;
                min = s1;
            }
            int minLength = min.length();
            int maxS = minLength;
            boolean f = true;
            while (maxS > 0 && f) {
                int diff = minLength - maxS;
                for (int i = 0; i <= diff; i++) {
                    if (max.contains(min.substring(i, i + maxS))) {
                        f = false;
                        maxS++;
                        break;
                    }
                }
                maxS--;
            }
            System.out.println(maxS);
        }
        out.close();
    }

}


import java.util.Scanner;

public class beecrowd1255 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        while (N-- > 0) {
            String line = scanner.nextLine();
            int[] cont = new int[123];

            for (int j = 97; j <= 122; j++) {
                cont[j] = 0;
            }

            int max = 0;
            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                if (ch >= 65 && ch <= 90)
                    ch += 32;
                if (ch >= 97 && ch <= 122) {
                    int pos = ch;
                    cont[pos]++;
                    if (cont[pos] > max)
                        max = cont[pos];
                }
            }

            for (char c = 'a'; c <= 'z'; c++) {
                if (cont[c] == max)
                    System.out.print(c);
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class beecrowd1257 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            int l = scanner.nextInt();
            scanner.nextLine();
            int total = 0;
            for (int j = 0; j < l; j++) {
                String linha = scanner.nextLine();
                for (int k = 0; k < linha.length(); k++) {
                    total += linha.charAt(k) - 65 + j + k;
                }
            }
            System.out.println(total);
        }
        scanner.close();
    }
}

import java.util.Scanner;

public class beecrowd1332 {
    public static int diff(String a, String b) {
        if (a.length() != b.length()) {
            return 1000;
        }
        int count = 0;
        for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        while (scanner.hasNext()) {
            s = scanner.next();
            if (diff(s, "one") <= 1) {
                System.out.println(1);
            } else if (diff(s, "two") <= 1) {
                System.out.println(2);
            } else if (diff(s, "three") <= 1) {
                System.out.println(3);
            }
        }
        scanner.close();
    }
}

import java.util.HashMap;
import java.util.Scanner;

public class beecrowd1367 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int N = scanner.nextInt();

            if (N == 0) {
                break;
            }

            HashMap<Character, Integer> solvedProblems = new HashMap<>();
            HashMap<Character, Integer> problems = new HashMap<>();

            for (int i = 0; i < N; i++) {
                char identifier = scanner.next().charAt(0);
                int time = scanner.nextInt();
                String judgement = scanner.next();

                if (judgement.equals("correct")) {
                    time += problems.getOrDefault(identifier, 0);
                    solvedProblems.put(identifier, time);
                } else {
                    int penalty = 20 + problems.getOrDefault(identifier, 0);
                    problems.put(identifier, penalty);
                }
            }

            System.out.println(solvedProblems.size() + " " + solvedProblems.values().stream().reduce(0, Integer::sum));
        }
    }
}

import java.util.Scanner;

public class beecrowd1516 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            if (N == 0 && M == 0) {
                break;
            }

            scanner.nextLine();

            char[][] drawing = new char[N][M];
            for (int i = 0; i < N; i++) {
                drawing[i] = scanner.nextLine().toCharArray();
            }

            int A = scanner.nextInt();
            int B = scanner.nextInt();

            char[][] resizedDrawing = resizeDrawing(drawing, N, M, A, B);

            for (char[] row : resizedDrawing) {
                for (char ch : row) {
                    System.out.print(ch);
                }
                System.out.println();
            }
            System.out.println();
        }

        scanner.close();
    }

    public static char[][] resizeDrawing(char[][] drawing, int N, int M, int A, int B) {
        char[][] resizedDrawing = new char[A][B];
        int rowScale = A / N;
        int colScale = B / M;

        for (int i = 0; i < A; i++) {
            int originalRow = i / rowScale;
            for (int j = 0; j < B; j++) {
                int originalCol = j / colScale;
                resizedDrawing[i][j] = drawing[originalRow][originalCol];
            }
        }
        return resizedDrawing;
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class beecrowd1551 {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    static final String[] ALPHABET = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    public static void main(String[] args) throws IOException {
        int N = readInt();
        int count;
        String s;
        while (N-- > 0) {
            count = 0;
            s = read();
            for (String letter : ALPHABET) {
                if (s.contains(letter)) {
                    count++;
                }
            }
            if (count == 26) {
                out.println("frase completa");
            } else if (count > 12) {
                out.println("frase quase completa");
            } else {
                out.println("frase mal elaborada");
            }
        }
        out.close();
    }

    private static String read() throws IOException {
        return in.readLine();
    }

    private static int readInt() throws IOException {
        return Integer.parseInt(in.readLine());
    }

}

import java.util.Scanner;

public class beecrowd1581 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short cases = scanner.nextShort();

        for (int i = 0; i < cases; i++) {
            short numPeople = scanner.nextShort();

            String current = scanner.nextLine();
            current = scanner.nextLine();

            boolean isEnglish = false;
            String previous = current;

            for (int j = 1; j < numPeople; j++) {
                String next = scanner.nextLine();
                if (!current.equals(previous) && !isEnglish) {
                    isEnglish = true;
                } else {
                    previous = current;
                }
                current = next;
            }

            if (isEnglish) {
                System.out.println("ingles");
            } else {
                System.out.println(current);
            }
        }

        scanner.close();
    }
}
