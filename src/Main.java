public class Main {
    public static void main(String[] args) {

        // TASK 1,2
        int[] numbers1 = new int[3];
        numbers1[0] = 1;
        numbers1[1] = 2;
        numbers1[2] = 3;

        double[] numbers2 = {1.57, 7.654, 9.986};
        double num1 = numbers2[0];
        double num2 = numbers2[1];
        double num3 = numbers2[2];

        int[] numbers3 = {1994, 1995, 1996, 1997, 1998};
        int year1 = numbers3[0];
        int year2 = numbers3[1];
        int year3 = numbers3[2];
        int year4 = numbers3[3];
        int year5 = numbers3[4];

        System.out.println(numbers1[0] + ", " + numbers1[1] + ", " + numbers1[2] + ";");
        System.out.println(num1 + ", " + num2 + ", " + num3 + ";");
        System.out.println(year1 + ", " + year2 + ", " + year3 + ", " + year4 + ", " + year5);

        System.out.println();

        // TASK 3
        System.out.println(numbers1[2] + ", " + numbers1[1] + ", " + numbers1[0] + ";");
        System.out.println(num3 + ", " + num2 + ", " + num1 + ";");
        System.out.println(year5 + ", " + year4 + ", " + year3 + ", " + year2 + ", " + year1);

        System.out.println();

        // TASK 4
        for (int i = 0; i < numbers1.length; i++) {
            if (numbers1[i] % 2 != 0) {
                numbers1[i]++;
            }
            if (i < numbers1.length - 1) {
                System.out.print(numbers1[i] + ", ");
            } else {
                System.out.print(numbers1[i]);
            }
        }
    }
}