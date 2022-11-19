package assignment2.DataCoupling;

public class dataCouplingClass {
    public class Number {
        int number1 = 1;
        int number2 = 2;
        int number3 = 3;
    }

        public class Printer {

            public void print(int number1, int number2, int number3) {
                System.out.println(number1 + "," + number2 + "," + number3);
            }
        }

}
