public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int age = 27;
        if (age >=18) {
            System.out.println("Поздравление пользователя с совершеннолетием");
        }
        else {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать");
        }
        // Задача 2
        System.out.println("Задача 2");
        if (age >=7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        else if (age >=18 && age < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        else {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

    }
}