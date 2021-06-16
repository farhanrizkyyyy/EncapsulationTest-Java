package EncapsulationTest;

import java.text.DecimalFormat;

public class EncapsualtionDemo {
	public static void main(String[] args) {
		DecimalFormat DigitPresisi = new DecimalFormat("0.00");
		HitungGaji Fungsi = new HitungGaji();
		
		System.out.println("----- DEMO ENKAPSULASI -----");
		
		Fungsi.setGaji(25000000);
		Fungsi.hitungGaji();
		
		System.out.println("\nInformasi Gaji Pegawai");
		System.out.println("Gaji Kotor  : Rp. " + DigitPresisi.format(Fungsi.getGajiKotor()));
		System.out.println("Gaji Bersih : Rp. " + DigitPresisi.format(Fungsi.getGajiBersih()));
	}
}
