package ch5;

public class Bubble {
    public static void main(String[] args) {
        int nums[] = {99, -10, 100123, 18, -978,
                5623, 463, -9, 287, 49};
        int a, b, t;
        int size = 10;//кол-во сортируемых элементов

        //отобразить исходный массив
        System.out.print("Исходный массив:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + nums[i]);
        }
        System.out.println();

        //реализовать алгоритм пузырьковой сортировки
        for (a = 1; a < size; a++) {
            for (b = size-1; b >= a; b--) {
                //если порядок не соблюдается, поменяем элементы местами
                if(nums[b-1] > nums[b]) {
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }
        }

        //отобразить отсортированный массив
        System.out.print("Отсортированный масиив:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + nums[i]);
        }
        System.out.println();
    }
}