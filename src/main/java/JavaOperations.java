public class JavaOperations {
    public static void main(String[] args) {
        //математические операторы
        int a = 5;
        int b = 10;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(b / a);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(++a);
        System.out.println(a--);

        //логические операторы
        if(a >= 0 && b >= 10){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        if(a >= 0 || b >= 11){
            System.out.println("Good");
        }
        else {
            System.out.println("Bad");
        }

        //операторы сравнения
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a != 0);
        System.out.println(a >= 8);
        System.out.println(a <= 7);

        //перевыполнение при вычислениях
        int c = 2147483647;
        System.out.println(c + 1);

        //вычисления комбинаций с int и double
        int x = 20;
        double y = 6.7;
        double z = 2.1;
        System.out.println(x + y);
        System.out.println(y + z);
        System.out.println(x / y);
        System.out.println(x * y);


    }

}
