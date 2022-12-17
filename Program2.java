// Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.*;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args){
 
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве: ");
        int n = scan.nextInt();

        System.out.println("Заполните массив");
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++){
            list.add((int) scan.nextInt());
        }
        scan.close();
 
        System.out.println("Заполненый массив");
        for (int i = 0; i < n; i++){
            System.out.printf("%s   ", list.toArray()[i]);
        }
        System.out.println();

        System.out.println("Cписок без четных чисел");
        ArrayList<Integer> newlist = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if ((int) list.toArray()[i] % 2 != 0) {
                newlist.add((int) list.toArray()[i]);
            }
        }
        System.out.println(newlist);
    }
}