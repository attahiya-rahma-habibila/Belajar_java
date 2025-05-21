package com.belajar;
import java.util.Scanner;
public class PenjualanBarang {
    public static class ProgramPenjualanBarang {
    
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                double totalPembayaran = 0;
                String lanjutkan;
    
                System.out.println("==== Program Penjualan Barang ====");
    
                do {
                    // Input data barang
                    System.out.print("Masukkan nama barang: ");
                    String namaBarang = scanner.nextLine();
    
                    System.out.print("Masukkan harga barang (Rp): ");
                    double hargaBarang = scanner.nextDouble();
    
                    System.out.print("Masukkan jumlah barang yang dibeli: ");
                    int jumlahBarang = scanner.nextInt();
    
                    // Hitung total harga untuk barang tersebut
                    double totalHargaBarang = hargaBarang * jumlahBarang;
                    totalPembayaran += totalHargaBarang;
    
                    // Tampilkan rincian barang yang dibeli
                    System.out.println("\n===== Rincian Barang yang Dibeli =====");
                    System.out.println("Nama Barang: " + namaBarang);
                    System.out.println("Harga Barang: Rp " + hargaBarang);
                    System.out.println("Jumlah Barang: " + jumlahBarang);
                    System.out.println("Total Harga Barang: Rp " + totalHargaBarang);
    
                    // Tanyakan apakah ingin menambah barang lain
                    System.out.print("\nApakah Anda ingin menambah barang lain? (ya/tidak): ");
                    scanner.nextLine(); // untuk menangkap baris kosong setelah input angka
                    lanjutkan = scanner.nextLine();
    
                } while (lanjutkan.equalsIgnoreCase("ya"));
    
                // Tampilkan total pembayaran
                System.out.println("\n===== Total Pembayaran =====");
                System.out.println("Total Pembayaran Anda: Rp " + totalPembayaran);
    
                scanner.close();
            }
        }
}
