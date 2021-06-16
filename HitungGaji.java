package EncapsulationTest;

public class HitungGaji {
	private double gajiKotor, gajiAfterPajak;
	public double gajiBersih;
	private double potongan = 75000.00;
	
	public void hitungGaji() {
		gajiAfterPajak = gajiKotor - (0.2 * gajiKotor);
		gajiBersih = gajiAfterPajak - potongan;
	}
	
	public void setGaji(double gaji) {
		gajiKotor = gaji;
	}
	
	public double getGajiKotor() {
		return gajiKotor;
	}
	
	public double getGajiBersih() {
		return gajiBersih;
	}
}
