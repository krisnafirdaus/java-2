public class Vehicle {
    // Ini adalah field atau state dari object
    private String brand;

    // Ini adalah constructor, method khusus yang dipanggil saat object dibuat
    public Vehicle(String brand) {
        this.brand = brand; // menginisialisasi field brand
    }

    // Ini adalah method yang mendefinisikan perilaku
    public void honk() {
        System.out.println(this.brand + " says Beep Beep!");
    }

    // Main method untuk menjalankan program Java
    public static void main(String[] args) {
        // Membuat object dari kelas Vehicle
        Vehicle myCar = new Vehicle("Toyota");

        // Memanggil method honk pada object myCar
        myCar.honk(); // Output: Toyota says Beep Beep!
    }
}

