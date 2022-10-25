public class Main {
    public static void main(String[] args) {


        int[] dailyCosts = generateRandomArray();
        for (int todayCost : dailyCosts) {
            System.out.println(todayCost);
        }

        //Задание 1
        System.out.println("\nЗадание 1:");
        int totalCost = 0;
        for (int todayCost : dailyCosts) {
            totalCost += todayCost;
        }
        System.out.println("Сумма трат за месяц составила " + totalCost + " рублей");

        //Задание 2
        System.out.println("\nЗадание 2:");
        int minCost = dailyCosts[0];
        int maxCost = dailyCosts[0];
        for (int todayCost : dailyCosts) {
            if (todayCost < minCost) {
                minCost = todayCost;
            }
            if (todayCost > maxCost) {
                maxCost = todayCost;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minCost + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxCost + " рублей");

        //Задание 3
        System.out.println("\nЗадание 3:");
        float averageCostPerDay = (float) totalCost / dailyCosts.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageCostPerDay + " рублей");

        //Задание 4
        System.out.println("\nЗадание 4:");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}