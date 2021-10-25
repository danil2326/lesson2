public class lesson2 {
    public static void main(String[] args) {
//Задание1
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1) {
                arr1[i] = arr1[i] - 1;
            } else if (arr1[i] < 1) {
                arr1[i] = arr1[i] + 1;
            }
        }
//Задание2
        int[] arr2;
        arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;
        }


//Задание3
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
        }

//Задание4
        int[][] array = {
                {2, 4, 2},
                {5, 2, 7},
                {2, 9, 2},
        };
        for (int y = 0; y < array.length; y++) {
            for (int x = 0; x < array[y].length; x++) {
                array[y][x] = array[y][x] / 2;
            }
        }
//Задание5
        int[] arr4 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int min;
        int max;
        min = arr4[0];
        max = arr4[0];
        for (int i = 0; i < arr4.length; i++) {
        if(arr4[i] < min)
            min = arr4[i];
        if(arr4[i] > max) {
            max = arr4[i];}

        }





    printArray(arr1);

    printArray(arr2);

    printArray(arr3);

    print2dArray(array);

    System.out.println(min);

    System.out.println(max);
}



        public static void printArray ( int[] arr){
            System.out.print("[");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("]");

        }

        public static void print2dArray ( int[][] arr){
            for (int y = 0; y < arr.length; y++) {
                for (int x = 0; x < arr[y].length; x++) {
                    System.out.print(arr[y][x] + " ");
                }
                System.out.println();
            }
        }
    }


