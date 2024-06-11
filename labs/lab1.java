package labs

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 2, 3, 3, 1};
        List<Integer> result = removeOddOccurrences(numbers);
        System.out.println("Результат: " + result);
    }

    public static List<Integer> removeOddOccurrences(int[] numbers) {
        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int num : numbers) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for (int num : numbers) {
            if (countMap.get(num) % 2 == 0) {
                result.add(num);
            }
        }

        return result;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static String determineFinalState(List<String> actions) {
        if (actions.isEmpty()) return "Nothing";

        int likesCount = 0;
        int dislikesCount = 0;

        for (String action : actions) {
            if (action.equals("Like")) {
                likesCount++;
            } else if (action.equals("Dislike")) {
                dislikesCount++;
            }
        }

        if (likesCount > dislikesCount) {
            return "Like";
        } else if (dislikesCount > likesCount) {
            return "Dislike";
        } else {
            return "Nothing";
        }
    }

    public static void main(String[] args) {
        List<String> test1 = new ArrayList<>();
        test1.add("Dislike");
        System.out.println("Ввод: " + test1 + " ➞ Вывод: " + determineFinalState(test1));

        List<String> test2 = new ArrayList<>();
        test2.add("Like");
        test2.add("Like");
        System.out.println("Ввод: " + test2 + " ➞ Вывод: " + determineFinalState(test2));

        List<String> test3 = new ArrayList<>();
        test3.add("Dislike");
        test3.add("Like");
        System.out.println("Ввод: " + test3 + " ➞ Вывод: " + determineFinalState(test3));


    }
}

public class Task3 {
    public static void main(String[] args) {
        Integer[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Integer[] nums2 = {0, 2, 1, 9, 7};

        List<Integer> nums1List = Arrays.asList(nums1);
        List<Integer> nums2List = Arrays.asList(nums2);
        List<Integer> nums3 = new ArrayList<>(nums2List);

        for (Integer num : nums1List) {
            if (!nums2List.contains(num)) {
                nums3.add(num);
            }
        }

        System.out.println("nums3: " + nums3);
    }
}

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Количество минут: ");
        int minutes = scanner.nextInt();
        System.out.print("Количество сообщений: ");
        int messages = scanner.nextInt();

        double baseCost = 15.00;
        double extraMinutesCost = 0.25 * Math.max(0, minutes - 50);
        double extraMessagesCost = 0.15 * Math.max(0, messages - 50);
        double totalCost = baseCost + extraMinutesCost + extraMessagesCost;
        double fee911 = 0.44;
        double taxRate = 0.05;
        double tax = taxRate * (totalCost + fee911);
        double finalAmount = totalCost + fee911 + tax;

        System.out.println("Базовая стоимость: $" + String.format("%.2f", baseCost));
        System.out.println("Дополнительные минуты: $" + String.format("%.2f", extraMinutesCost) + " (" + (minutes > 50 ? (minutes - 50) : 0) + " минут)");
        System.out.println("Дополнительные сообщения: $" + String.format("%.2f", extraMessagesCost) + " (" + (messages > 50 ? (messages - 50) : 0) + " сообщений)");
        System.out.println("Сбор за 911: $" + String.format("%.2f", fee911));
        System.out.println("Налог: $" + String.format("%.2f", tax) + " (5% от общей суммы $" + String.format("%.2f", (totalCost + fee911)) + ")");
        System.out.println("Итоговая сумма: $" + String.format("%.2f", finalAmount));

        scanner.close();
    }
}

public class Task5 {

    public static void main(String[] args) {
        String[] transactions = {
                "Пополнение через банкомат ~ +1000",
                "Оплата интернета ~ -500",
                "Кафе ~ -300",
                "Зарплата ~ +15000",
                "Штраф за парковку ~ -2500",
                "Подарок ~ +2000"
        };

        int totalAmount = 0;


        for (String transaction : transactions) {

            String[] parts = transaction.split(" ~ ");
            String description = parts[0];
            int amount = Integer.parseInt(parts[1]);


            if (amount > 0) {
                totalAmount += amount;
            } else {
                totalAmount -= Math.abs(amount);
            }
        }

        System.out.println("Итоговая сумма на счету составляет " + totalAmount + ".");
    }
}

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите вес на Земле в кг: ");
        double weightOnEarth = scanner.nextDouble();

        final double MOON_GRAVITY_RATIO = 0.165;
        final double ANNUAL_INCREASE_PERCENTAGE = 3.2 / 100;

        System.out.println("Результаты:");
        for (int year = 1; year <= 15; year++) {
            double weightOnMoon = weightOnEarth * MOON_GRAVITY_RATIO;
            System.out.printf("%d год: %.3f кг%n", year, weightOnMoon);

            weightOnEarth *= (1 + ANNUAL_INCREASE_PERCENTAGE);
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите возраст : ");
        int age = scanner.nextInt();

        if (age % 2 == 0) {
            System.out.print("Четные числа до " + age + ": ");
            for (int i = 2; i <= age; i += 2) {
                System.out.print(i + " ");
            }
        } else {
            System.out.print("Нечетные числа до " + age + ": ");
            for (int i = 1; i <= age; i += 2) {
                System.out.print(i + " ");
            }
        }
    }
}


public class Task8 {
    public static void main(String[] args) {
        String[] correctAnswers = {"A", "C", "B",  "A", "C",
                "B", "D", "A", "B", "C", "D", "A", "C", "B", "D"};

        String[] studentAnswers = {"A", "D", "B", "C", "A", "B", "D", "C", "A", "C",
                "B", "D", "A", "B", "C", };

        int correctCount = 0;
        int incorrectCount = 0;

        for (int i = 0; i < correctAnswers.length; i++) {
            if (correctAnswers[i].equals(studentAnswers[i])) {
                correctCount++;
            } else {
                incorrectCount++;
            }
        }
        System.out.println("Правильные ответы: " + correctCount);
        System.out.println("Неправильные ответы: " + incorrectCount);
    }
}


public class Task9 {

    public static void main(String[] args) {
        int[] hoursWorked = {8, 8, 8, 0, 8, 8, 8, 8, 0, 0, 8, 8, 8, 8, 8, 0, 8, 8, 8, 0};
        calculateWorkHours(hoursWorked);
    }

    public static void calculateWorkHours(int[] hoursWorked) {
        int totalHours = 0;
        int daysWorked = 0;
        int weekHours = 0;
        int weekCount = 1;

        for (int i = 0; i < hoursWorked.length; i++) {
            if ((i % 5 == 0) && (i != 0)) {
                System.out.println(weekCount + "- " + weekHours);
                weekHours = 0;
                weekCount++;
            }
            if (hoursWorked[i] > 0) {
                totalHours += hoursWorked[i];
                daysWorked++;
            }
            weekHours += hoursWorked[i];
        }
        if (weekHours > 0) {
            System.out.println(weekCount + "- " + weekHours);
        }

        double averageHoursPerDay = (double) totalHours / daysWorked;
        System.out.println("Среднее количество часов в день (учитывая только рабочие дни): " + averageHoursPerDay);
    }
}