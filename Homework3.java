// - Создать массив на 20 чисел.
// - Ввести в него значения с клавиатуры.
// - Создать два массива на 10 чисел каждый.
// - Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
// - Вывести второй отсортированный маленький массив на экран, каждое значение выводить с новой строки(хранение наибольших чисел)
// - Вывести первый отсортированный маленький массив на экран, каждое значение выводить с новой строки(хранение наименьших чисел)
// - * Объяснение задачи. В начале у нас 3 массива,
//  а в резульате будет 2 массива, где один массив должен содиражть наибольшие числа, 
// а другой наименьшие. Нужно решить где и сколько лучше всего сортировать массивы.
//  К примеру (как вариант решения и доп объяснения, мы можем сложить все массивы в один, отсортировать,
//  и создать 2 массива разделив массив из 40 элементов на 2 массива)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class arraysMaxMin {
    public static void main(String[] args) throws Exception {
        int [] bigArray = new int [20];
        int [] smallArray1 = new int [10];
        int [] smallArray2 = new int [10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i < bigArray.length; i++)
        {
            bigArray[i] = Integer.parseInt(reader.readLine());
        }

        smallArray1 = Arrays.copyOfRange(bigArray, 0, 9);
        smallArray2 = Arrays.copyOfRange(bigArray, 10, 20);

        for (int i=0; i < smallArray2.length; i++)
        {
            System.out.println(smallArray2[i]);
        }
    }
}


// Реализовать алгоритм сортировки слиянием на java(целые числа).

import java.util.Arrays;

public class mergeSorting {
    public static void main(String[] args) {
        mergeSorting tk = new mergeSorting();
        int[] unsortedArray = new int[]{5, 3, -10, 0, -3, 3};
        System.out.println(Arrays.toString(unsortedArray));
        System.out.println(Arrays.toString(tk.sortArray(unsortedArray)));
    }

    public int[] sortArray(int[] arrayA) { 
        if (arrayA == null) {
            return null;
        }
        
        if (arrayA.length < 2) {
            return arrayA; 
        }
        
        int[] arrayB = new int[arrayA.length / 2];
        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length / 2);

        
        int[] arrayC = new int[arrayA.length - arrayA.length / 2];
        System.arraycopy(arrayA, arrayA.length / 2, arrayC, 0, arrayA.length - arrayA.length / 2);

       
        arrayB = sortArray(arrayB); // левая часть возврат из рекурсии строкой return arrayA;
        arrayC = sortArray(arrayC); // правая часть возврат из рекурсии строкой return arrayA;

      
        return mergeArray(arrayB, arrayC);
    }

    public int[] mergeArray(int[] arrayA, int[] arrayB) {

        int[] arrayC = new int[arrayA.length + arrayB.length];
        int positionA = 0, positionB = 0;

        for (int i = 0; i < arrayC.length; i++) {
            if (positionA == arrayA.length) {
                arrayC[i] = arrayB[positionB];
                positionB++;
            } else if (positionB == arrayB.length) {
                arrayC[i] = arrayA[positionA];
                positionA++;
            } else if (arrayA[positionA] < arrayB[positionB]) {
                arrayC[i] = arrayA[positionA];
                positionA++;
            } else {
                arrayC[i] = arrayB[positionB];
                positionB++;
            }
        }
        return arrayC;
    }
}


// - Создать два списка LinkedList и ArrayList
// Нужно создать два списка – LinkedList и ArrayList.
// - Провести 10 тысяч вставок, удалений
// Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set.
// (исключетельно методами, за 10 тыс элементов можно взять числп от 1 до 10_001)
// - Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
// Метод getTimeMsOfInsert должен вернуть время его исполнения в миллисекундах.
//  (Подсказка - import java.util.Date;)
// - Измерить, сколько времени занимает 10 тысяч вызовов get для каждого списка.
// Метод getTimeMsOfGet должен вернуть время его исполнения в миллисекундах.
// (Подсказка - import java.util.Date;)

import java.util.*;

public class twoLists {
    public static void main(String[] args) {
        twoLists tk = new twoLists();
        List<Integer> myArrayList = new ArrayList<>();
        List<Integer> myLinkedList = new LinkedList<>();
        tk.getTimeMsOfInsert(myArrayList);
        tk.getTimeMsOfInsert(myLinkedList);
        tk.getTimeMsOfGet(myArrayList);
        tk.getTimeMsOfGet(myLinkedList);
    }

    public void getTimeMsOfInsert(List<Integer> someList) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            someList.add(i);
        }
        long finish = System.currentTimeMillis();
        System.out.println(String.format("Время выполнения операции Insert для %s составило %d миллисекунды", someList.getClass(), finish - start));
    }

    public void getTimeMsOfGet(List<Integer> someList) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < someList.size(); i++) {
            someList.get(i);
        }
        long finish = System.currentTimeMillis();
        System.out.println(String.format("Время выполнения операции get для %s составило %d миллисекунды", someList.getClass(), finish - start));
    }
}