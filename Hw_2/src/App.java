import java.util.Scanner;

// Доделать сортировку подсчетом

// public class App {
    
//     public static int [] SplitArr(int [] Clock) {
//         if (Clock.length < 2){
//             return Clock;
//         }

//         int l = (Clock.length/2);
//         int r = Clock.length - (Clock.length/2);
//         int [] calckL = new int[l];
//         int [] calckR = new int[r];

//         System.arraycopy(Clock, 0, calckL, 0, l);
//         System.arraycopy(Clock, l, calckR, 0, r);

//         SplitArr(calckL);
//         SplitArr(calckR);
//         MergeArr(Clock, calckL, calckR);
//         return Clock;
//     }

//     public static void MergeArr(int [] calck, int [] ClockL, int [] ClockR) {

//         int posL = 0;
//         int posR = 0;
        
//         for (int i = 0; i < calck.length; i++) {
//             if (posL == ClockL.length){
//             calck[i] = ClockR[posR];
//             posR++;
//             } 
//             else if (posR == ClockR.length) {
//             calck[i] = ClockL[posL];
//             posL++;
//             } 
//             else if (ClockL[posL] < ClockR[posR]) {
//             calck[i] = ClockL[posL];
//             posL++;
//             } 
//             else {
//             calck[i] = ClockR[posR];
//             posR++;
//             }
//         }
//     }

//     public static void main(String[] arg) {
//     int [] Arr = new int[] {7,5,4,9,7,3,2};
//     Arr = SplitArr(Arr);
//     for (int i = 0; i < Arr.length; i++) {
//         System.out.print(Arr[i] + " ");
//     }
//     }
// }



//Написать метод «Шифр Цезаря»

// public class App {
//     public static void main(String[] args) {
//         String str = "ААА";
//         int key = 1;
//         String new_str = "";
//         String d = "";
//         int c = 0;
//         int y = 0;

//         System.out.println((int) 'Я'); // здесь узнаем код буквы


//         for (int i = 0; i < str.length(); i++) {
//             c =  (str.charAt(i) + key);
//             y = (c - 1040) % 32 + 1040; // 1040 - это код буквы А, 32 - это кол-во букв
//             new_str += (char) y; // получаем букву по коду
//         }
//     System.out.println(new_str);
//     }
// }

//Написать метод, принимающий на вход массив чисел и параметр n.
public class App {
    public static void sort(int clock[])
    {
        int q = clock.length;

        for (int i = q / 2 - 1; i >= 0; i--)
            Math(clock, q, i);
   
        for (int i=q-1; i>=0; i--)
        {
            int temp = clock[0];
            clock[0] = clock[i];
            clock[i] = temp;

            Math(clock, i, 0);
        }
    }
    public static void Math(int arr[], int j, int n)
    {
        int high = n;
        int turn = 2*n + 1;
        int corect = 2*n + 2;

        if (turn < j && arr[turn] > arr[high])
            high = turn;

        if (corect < j && arr[corect] > arr[high])
            high = corect;

        if (high != n)
        {
            int s = arr[n];
            arr[n] = arr[high];
            arr[high] = s;

            Math(arr, j, high);
        }
    }
    public static void printArray(int arr[])
    {
        int df = arr.length;
        for (int i=0; i<df; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String args[])
    {
        int [] Arr = new int[] {7,5,4,9,7,3,2};
        sort(Arr);
        printArray(Arr);
    }
}