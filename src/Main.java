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
        else if (age >=24){
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        // Задача 3
        System.out.println("Задача 3");
        int capacity = 102;
        int seatsCount =60;
        int otherCount = capacity - seatsCount; // стоячие места

        int seatsUsed = 60;
        int otherUsed = 41;
        if (seatsUsed < seatsCount) {
            System.out.println("Еще есть " + (seatsCount - seatsUsed) + " сидячих мест");
        } else {
            System.out.println("Сидячих мест нет");
        }
        if (otherUsed < otherCount) {
            System.out.println("Еще есть " + (otherCount - otherUsed) + " стоячих мест");
        } else {
            System.out.println("Стоячих мест нет");
        }

    }
}