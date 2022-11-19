package assignment2.StampCoupling;

public class stampCouplingSample {

    public class Car {
        private String name = "Tesla";
        public String getName() {
            return name;
        }
    }

    public class printCarDetails {
        public void printDetails(int[] array, Car c ) {
            System.out.println("Number Of Wheels: " + array.length + " Car Name: " + c.getName());
        }
    }

    public class RelatedClass {
        private int[] wheels = {1, 2, 3, 4};
        Car car = new Car();
        printCarDetails print= new printCarDetails();
        public void start() {
            print.printDetails(wheels, car);
        }
    }
}
