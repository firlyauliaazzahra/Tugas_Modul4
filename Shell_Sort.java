package Sorting;
public class Shell_Sort {
    public static void shellsort(int[] arr) {
        int n = arr.length;
        int C, M;
        int jarak, i, j, kondisi;
        boolean sudah = true;
        int temp;
        C = 0;
        M = 0;
        jarak = n;
        
        while (jarak >= 1){
            jarak = jarak / 2;
            sudah = true;
            while (sudah){
                sudah = false;
                for (j = 0; j < n - jarak; j++){
                    i = j + jarak;
                    C++;
                    if (arr[j] > arr[i]){
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        sudah = true;
                    }
                }
            }
        }   
    }
    public static void tampil(int data[]) {
        for (int i = 0; i < data.length; i++)
            System.out.print(data[i] + " ");
    System.out.println();
    }
    public static void main(String[] args){
        int A[] = {25, 7, 9, 13, 3};
        Shell_Sort.tampil(A);
        Shell_Sort.shellsort(A);
        Shell_Sort.tampil(A);
        System.out.println("Firly Aulia Azzahra");
    }
}

