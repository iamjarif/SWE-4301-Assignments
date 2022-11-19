package assignment2.contentCoupling;

public class contentCouplingSample {
    public class Car {
        public String Brand;

        public String getBrand() {
            return Brand;
        }
        public void setBrand(String Brand) {
            this.Brand = Brand;
        }
    }

    public class findBrand {
        public void main(String[] args) {
            Car car = new Car();
            car.setBrand("Tesla");
            System.out.println(car.getBrand());
        }
    }
}
