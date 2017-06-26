/*
 *  冒泡排序算法的java实现
 */
public class BubbleSort {
    public static void main(String[] args) {
        Integer[] arr = {2, 5, 4, 8, 8, 1, 9, 3, 0};
        System.out.print("原始的数组为： ");
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("");

        for (Integer m = 0; m < arr.length - 1; m++) { // 外部循环 arr.length-1 趟
            for (Integer n = 0; n < arr.length - m - 1; n++) { // 内部循环 arr.length-m 次
                if (arr[n] > arr[n + 1]) {
                    Integer temp = arr[n + 1];
                    arr[n + 1] = arr[n];
                    arr[n] = temp;
                }
            }
        }

        System.out.print("排序的结果为： ");
        for (Integer d : arr) {
            System.out.print(d + " ");
        }
    }
}
