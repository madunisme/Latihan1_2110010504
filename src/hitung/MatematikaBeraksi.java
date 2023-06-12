
package hitung;


public class MatematikaBeraksi {
    public static void main(String[] args) {
        // Membuat Objek
        Matematika madun = new Matematika(0,4);
        
        System.out.println("Hasil Penjumlahan : " + madun.setPenjumlahan());
        System.out.println("Hasil Pengurangan : " + madun.setPengurangan());
        System.out.println("Hasil Perkalian   : " + madun.setPerkalian());
        System.out.println("Hasil Pembagian   : " + madun.setPembagian());
    }
}
