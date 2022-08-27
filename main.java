import java.util.Scanner;

import javax.swing.SortingFocusTraversalPolicy;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//input
        System.out.println("Input");

        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("Umur: ");
        int umur = input.nextInt();

        System.out.print("Berat: ");
        long berat = input.nextLong();

        System.out.print("Tinggi: ");
        float tinggi = input.nextFloat();

        System.out.print("Kelas: ");
        byte kelas = input.nextByte();

        System.out.print("Jumlah Uang: ");
        double uang = input.nextDouble();

        System.out.print("Status Menikah: ");
        boolean nikah = input.nextBoolean();

//output
        System.out.format("Output%n");
        System.out.format("Nama: %s%n", nama);
        System.out.format("Umur: %d Th%n", umur);
        System.out.format("Berat Badan: %d kg%n", berat);
        System.out.format("Tinggi: %.2f cm%n", tinggi);
        System.out.format("Kelas: %d%n", kelas);
        System.out.format("Duit Kamu: Rp.%,.2f%n", uang);
        System.out.format("Status Menikah: %b%n", nikah);

    }
}
