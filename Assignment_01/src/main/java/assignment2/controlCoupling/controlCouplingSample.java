package assignment2.controlCoupling;

public class controlCouplingSample {
    public class Tesla {
        public void main(String[] args) {
            Car car = new Car();
            car.type("Battery");
        }
    }

    public class Car {
        public void type(String types){
            if(types=="Fuel"){
                System.out.println("Toyota");
            } else if (types=="Battery") {
                System.out.println("Tesla");
            }
        }
    }
}
