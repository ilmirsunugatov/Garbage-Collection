public class JvmComprehension {

    public static void main(String[] args) {
        /* 1. ClassLoader загружает класс JvmComprehension
           2. Происходит делегирование загрузки
           3. Загрузятся классы Object и Integer
           4. JvmComprehension проходит на валидность, подготавливаются примитивы и объекты.
           Связывают ссылки на объекты
           5. происходит инициализация классов. Выполняются static компоненты(Присваиваются переменные,
           в данном случае выполняются static методы main и printAll)
           6. В stake выполняется main.
           7. i присваивается 1
           8. В куче создается объект Object и Integer.
           9. Объект object присваивает ссылку переменной o, объект Integer связывает ссылку с переменной ii.
           10. В стеке создается новый фрейм для printAll.
           11. В stake записывается ссылка на переменную o на объект Object, и ii на объект Integer.
           12. В куче создается новый объект Integer со значением 700.
           13. С Stake создается фрейм для метода System.out.println().
           14. Создается в куче объект String.
           15. В фрейме "sout" происходит связывание ссылок на o и ii.
           16. В куче создается новый фрейм для "sout"
           17. Создается объект String с параметром "finished"
           18. Garbage Collection начинает подчищать мусор.

        */

        int i = 1;                      // 1
        Object o = new Object();        // 2
        Integer ii = 2;                 // 3
        printAll(o, i, ii);             // 4
        System.out.println("finished"); // 7
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   // 5
        System.out.println(o.toString() + i + ii);  // 6
    }
}