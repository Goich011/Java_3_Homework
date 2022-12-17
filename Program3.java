// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.


import java.util.Scanner;

public class Program3 {
    public static void main(String[] args){
 
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве: ");
        int n = scan.nextInt();

        System.out.println("Заполните массив");
        int list[] = new int[n];
        for (int i = 0; i < n; i++){
            list[i] = scan.nextInt();
        }
        scan.close();
 
        System.out.println("Заполненый массив");
        for (int i = 0; i < n; i++){
            System.out.print(list[i]+ " ");
        }
        System.out.println();

        float max = list[0];
        float min = list[0];
        float sum = 0;
        for (int j : list){
            sum += j;
            if (j > max)
                max = j;
            if (j < min)
                min = j;
            }
        System.out.println("Максимум = " + max);
        System.out.println("Минимум = " + min);
        System.out.println("Среднее значение = " + sum / n);
    }
}
