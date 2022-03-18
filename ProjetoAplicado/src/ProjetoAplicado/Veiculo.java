package ProjetoAplicado;

public class Veiculo {
	
	private int NumFrota;
	private char NumPlaca;
	private float KmLitro;
	private boolean VeiculoRevisado;
	private char VeiculoIdChassi;
	
		public Veiculo(int numFrota, char numPlaca, float kmLitro, boolean veiculoRevisado, char veiculoIdChassi) {
		NumFrota = numFrota;
		NumPlaca = numPlaca;
		KmLitro = kmLitro;
		VeiculoRevisado = veiculoRevisado;
		VeiculoIdChassi = veiculoIdChassi;
	}
		
	public int getNumFrota() {
		return NumFrota;
	}
	public void setNumFrota(int numFrota) {
		NumFrota = numFrota;
	}
	public char getNumPlaca() {
		return NumPlaca;
	}
	public void setNumPlaca(char numPlaca) {
		NumPlaca = numPlaca;
	}
	public float getKmLitro() {
		return KmLitro;
	}
	public void setKmLitro(float kmLitro) {
		KmLitro = kmLitro;
	}
	public boolean isVeiculoRevisado() {
		return VeiculoRevisado;
	}
	public void setVeiculoRevisado(boolean veiculoRevisado) {
		VeiculoRevisado = veiculoRevisado;
	}
	public char getVeiculoIdChassi() {
		return VeiculoIdChassi;
	}
	public void setVeiculoIdChassi(char veiculoIdChassi) {
		VeiculoIdChassi = veiculoIdChassi;
	}
	
	

}
