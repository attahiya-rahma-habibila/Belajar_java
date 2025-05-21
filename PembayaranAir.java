package com.belajar;

import java.util.Scanner;

public class PembayaranAir {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        // Input data pelanggan
        System.out.print("Masukkan nama pelanggan: ");
        String nama = input.nextLine();

        System.out.print("Masukkan ID pelanggan: ");
        String id = input.nextLine();

        System.out.print("Masukkan jumlah pemakaian air (m³): ");
        double pemakaian = input.nextDouble();

        // Tarif air per m³
        double tarifPerM3 = 3500;

        // Hitung tagihan
        double tagihan = pemakaian * tarifPerM3;

        System.out.printf("Total Tagihan Anda: Rp %.2f\n", tagihan);

        // Input uang yang dibayar
        System.out.print("Masukkan jumlah uang yang dibayar: ");
        double uangDibayar = input.nextDouble();

        // Hitung selisih
        double selisih = uangDibayar - tagihan;

        // Tampilkan struk
        System.out.println("\n=== STRUK PEMBAYARAN AIR ===");
        System.out.println("ID Pelanggan     : " + id);
        System.out.println("Nama Pelanggan   : " + nama);
        System.out.println("Pemakaian Air    : " + pemakaian + " m³");
        System.out.printf("Tarif per m³     : Rp %.2f\n", tarifPerM3);
        System.out.printf("Total Tagihan    : Rp %.2f\n", tagihan);
        System.out.printf("Uang Dibayar     : Rp %.2f\n", uangDibayar);

        if (selisih > 0) {
            System.out.printf("Kembalian        : Rp %.2f\n", selisih);
        } else if (selisih < 0) {
            System.out.printf("Kekurangan Bayar : Rp %.2f\n", -selisih);
            System.out.println("Peringatan: Uang yang dibayar tidak cukup!");
        } else {
            System.out.println("Pembayaran pas. Terima kasih!");
        }
    }
}

