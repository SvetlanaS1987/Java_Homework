/* Сила тяжести на Луне составляет около 17% земной. Напишите программу, которая вычисляла бы ваш вес на Луне. */

/*
    Вычисление веса на Луне.
    Присвоить ее исходному файлу имя Moon.java.
*/
/* class Moon {
    public static void main(String args[]) {
    double earthweight; // Вес на Земле
    double moonweight; // Вес на Луне
    earthweight = 165;
    moonweight = earthweight * 0.17;
    System.out.println(earthweight +
                       " earth-pounds is equivalent to " +
                       moonweight + " moon-pounds.");
    }
} */


/* Реализовать таблицу истинности т.е. у нас есть p = false и q = true . Чему будет ранво p & q == ? , ? - вынести в таблицу.
 */
/* public class tableValues {
    public static void main(String[] args) {
        System.out.println("Таблица истинности");
        boolean p, q;
        System.out.println("p\tq\t(p & q)\t(p | q)\t(p ^ q)\t!p");
        System.out.println("===================================================");
        p = false; q = false;
            // System.out.println(p, q, (p && q), (p | q), (p ^ q), !p);  //я не знаю, как это писать на java
            System.out.println("false\t false\t false \t false \t false \t true");
        p = true; q = false;
            System.out.println("true\t false\t false \t true \t true \t false");
        p = false; q = true;
            System.out.println("false\t true\t false \t true \t true \t true");    
        p = true; q = true;
            System.out.println("true\t true\t true \t true \t false \t false");
    }
} */