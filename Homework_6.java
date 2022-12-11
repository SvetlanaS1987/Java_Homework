public class taskSet {
    public static void main(String[] args) {
        taskSet tk = new taskSet();
        Integer[] tkArray = tk.initArray();
        System.out.println(tk.getPercentUniqueValues(tkArray));
    }

    // Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
    public Integer[] initArray() {
        Integer[] someArray = new Integer[1000];
        Random rnd = new Random();
        for (int i = 0; i < someArray.length; i++) {
            someArray[i] = rnd.nextInt(25);
        }
        return someArray;
    }

    // Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных
// значений в данном массиве и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

    public double getPercentUniqueValues(Integer[] array){
        Set<Integer> uniqueElsSet = new HashSet<>();
        Set<Integer> notUniqueElsSet = new HashSet<>();
        for (Integer arrayEl : array){
            if (notUniqueElsSet.contains(arrayEl)){
                continue;
            } else if (!uniqueElsSet.contains(arrayEl)) {
                uniqueElsSet.add(arrayEl);
            } else {
                uniqueElsSet.remove(arrayEl);
                notUniqueElsSet.add(arrayEl);
            }
        }
        return (double) uniqueElsSet.size()/array.length;
    }
}