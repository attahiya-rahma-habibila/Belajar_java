package com.belajar;

import java.util.Scanner;

public class TagihanAir {
     public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        // 1. Input nama pelanggan
        System.out.print("Masukkan nama pelanggan: ");
        String nama = input.nextLine();

        // 2. Input pemakaian air
        System.out.print("Masukkan jumlah pemakaian air (m3): ");
        int pemakaian = input.nextInt();

        // 3. Tarif air berdasarkan pemakaian
        double tarif;
        if (pemakaian <= 10) {
            tarif = 2000;
        } else if (pemakaian <= 20) {
            tarif = 3000;
        } else if (pemakaian <= 30) {
            tarif = 4000;
        } else {
            tarif = 5000;
        }

        // 4. Perhitungan total biaya
        double totalBiaya = pemakaian * tarif;

        // 5. Pajak 10%
        double pajak = totalBiaya * 0.10;

        // 6. Total pembayaran
        double totalPembayaran = totalBiaya + pajak;

        // 6. Rincian pembayaran
        System.out.println("\n--- Rincian Pembayaran ---");
        System.out.println("Nama Pelanggan   : " + nama);
        System.out.println("Pemakaian Air    : " + pemakaian + " m3");
        System.out.println("Tarif per m3     : Rp" + tarif);
        System.out.println("Total Biaya      : Rp" + totalBiaya);
        System.out.println("Pajak (10%)      : Rp" + pajak);
        System.out.println("Total Pembayaran : Rp" + totalPembayaran);
    }
}
