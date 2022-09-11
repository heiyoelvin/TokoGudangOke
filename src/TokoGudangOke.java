import java.util.Scanner;

public class TokoGudangOke {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Masukan nama Anda = ");
        String Nama = userInput.nextLine();
        System.out.println(" ");
        System.out.println("Stok Gudang Barang");
        System.out.println("##################");
        System.out.println(" ");
        System.out.println("Selamat datang " + Nama);
        System.out.print("Masukkan nama barang yang mau ditambah = ");
        String NamaBarang = userInput.nextLine();
        System.out.print("Masukkan jumlah barang yang mau ditambah = ");
        float JumlahBarang = userInput.nextFloat();
        System.out.print("Masukkan harga beli untuk barang tersebut = ");
        float HargaBeli = userInput.nextFloat();
        System.out.print("Masukkan harga jual untuk barang tersebut = ");
        float HargaJual = userInput.nextFloat();
        System.out.println(" ");
        System.out.println("Stok Gudang Rincian Barang");
        System.out.println("##########################");
        System.out.println(" ");
        System.out.println("Nama Barang = " + NamaBarang);
        System.out.println("Jumlah Barang = " + JumlahBarang);
        System.out.println("Harga Beli = Rp " + HargaBeli);
        System.out.println("Harga Jual = Rp " + HargaJual);


    }
}
