package com.belajar;

import java.util.Scanner;

public class PembayaranTagihan {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        // Input informasi pelanggan
        System.out.print("Masukkan nama pelanggan: ");
        String nama = input.nextLine();

        System.out.print("Masukkan jenis layanan (Listrik / Air / Internet): ");
        String layanan = input.nextLine();

        System.out.print("Masukkan jumlah tagihan (Rp): ");
        double tagihan = input.nextDouble();

        System.out.print("Masukkan jumlah hari keterlambatan: ");
        int keterlambatan = input.nextInt();

        // Hitung denda (misalnya Rp 2.000 per hari keterlambatan)
        double denda = keterlambatan * 2000;

        // Hitung total bayar
        double totalBayar = tagihan + denda;

        // Tampilkan struk pembayaran
        System.out.println("\n=== STRUK PEMBAYARAN ===");
        System.out.println("Nama Pelanggan : " + nama);
        System.out.println("Layanan        : " + layanan);
        System.out.printf("Tagihan        : Rp %.2f\n", tagihan);
        System.out.println("Keterlambatan  : " + keterlambatan + " hari");
        System.out.printf("Denda          : Rp %.2f\n", denda);
        System.out.printf("Total Bayar    : Rp %.2f\n", totalBayar);
    }
}

