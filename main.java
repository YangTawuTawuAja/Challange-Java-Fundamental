import java.util.Scanner;

import javax.swing.SortingFocusTraversalPolicy;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//input
        System.out.format("Input%n");

        System.out.format("Nama: ");
        String nama = input.nextLine();

        System.out.format("Umur: ");
        int umur = input.nextInt();

        System.out.format("Berat: ");
        long berat = input.nextLong();

        System.out.format("Tinggi: ");
        float tinggi = input.nextFloat();

        System.out.format("Kelas: ");
        byte kelas = input.nextByte();

        System.out.format("Jumlah Uang: ");
        double uang = input.nextDouble();

        System.out.format("Status Menikah: ");
        boolean nikah = input.nextBoolean();

//output
        System.out.format("Output%n");
        System.out.format("Nama: %s%n", nama);
        System.out.format("Umur: %d Th%n", umur);
        System.out.format("Berat Badan: %d kg%n", berat);
        System.out.format("Tinggi: %.0f cm%n", tinggi);
        System.out.format("Kelas: %d%n", kelas);
        System.out.format("Duit Kamu: Rp.%,.2f%n", uang);
        System.out.format("Status Menikah: %b%n", nikah);

    }
}
