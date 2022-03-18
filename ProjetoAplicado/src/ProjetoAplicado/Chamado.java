package ProjetoAplicado;

public class Chamado {

	private int NumChamado;
	private int InicioChamado;
	private int FimChamado;
	
	public Chamado(int numChamado, int inicioChamado, int fimChamado, char itinerario, float distanciaPercorrida) {
		NumChamado = numChamado;
		InicioChamado = inicioChamado;
		FimChamado = fimChamado;
		Itinerario = itinerario;
		DistanciaPercorrida = distanciaPercorrida;
		
	}
	public int getNumChamado() {
		return NumChamado;
	}
	public void setNumChamado(int numChamado) {
		NumChamado = numChamado;
	}
	public int getInicioChamado() {
		return InicioChamado;
	}
	public void setInicioChamado(int inicioChamado) {
		InicioChamado = inicioChamado;
	}
	public int getFimChamado() {
		return FimChamado;
	}
	public void setFimChamado(int fimChamado) {
		FimChamado = fimChamado;
	}
	public char getItinerario() {
		return Itinerario;
	}
	public void setItinerario(char itinerario) {
		Itinerario = itinerario;
	}
	public float getDistanciaPercorrida() {
		return DistanciaPercorrida;
	}
	public void setDistanciaPercorrida(float distanciaPercorrida) {
		DistanciaPercorrida = distanciaPercorrida;
	}
	private char Itinerario;
	private float DistanciaPercorrida;
	
	
	
}
