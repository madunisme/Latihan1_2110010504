
package hitung;


public class Matematika {
    // Membuat Variable
    private double bil1, bil2;
    
    // Membuat Constructor
    public Matematika(double bil1, double bil2){
        this.bil1 = bil1;
        this.bil2 = bil2;
    }
    
    // Membuat Method setPenjumlahan
    public double setPenjumlahan(){
        return bil1 + bil2;
    }
    
    // Membuat Method setPengurangan
    public double setPengurangan(){
        return bil1 - bil2;
    }
    
    // Membuat Method setPerkalian
    public double setPerkalian(){
        return bil1 * bil2;
    }
    
    // Membuat Method setPembagian
    public double setPembagian(){
        return bil1 / bil2;
    }
    
}
