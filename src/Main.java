// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//        int[] numbers = {1, 2, 3};
//
//        System.out.println(numbers);
        class Vechicle {
            protected  String brand = "Ford";

            public void honk(){
                System.out.println("Tuut");
            }
        }

        class Car extends  Vechicle {
            private String modelName = "Mustang";
            public static void main(String[] args) {
                Car myCar = new Car();
                myCar.honk();

                System.out.println(myCar.brand + " " + myCar.modelName);
            }
        }


}