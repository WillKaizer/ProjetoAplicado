package ProjetoAplicado;

import java.time.LocalDate;

public class Funcionario {
	
	private int IdCpf;
	private char Nome;
	private LocalDate DataNac;
	private char Endereco;
	private boolean Habilitado;
	private boolean Disponivel;
	
	
	public Funcionario(int idCpf, char nome, LocalDate dataNac, char endereco, boolean habilitado, boolean disponivel) {
		IdCpf = idCpf;
		Nome = nome;
		DataNac = dataNac;
		Endereco = endereco;
		Habilitado = habilitado;
		Disponivel = disponivel;
	}
	
	public int getIdCpf() {
		return IdCpf;
	}
	public void setIdCpf(int idCpf) {
		IdCpf = idCpf;
	}
	public char getNome() {
		return Nome;
	}
	public void setNome(char nome) {
		Nome = nome;
	}
	public LocalDate getDataNac() {
		return DataNac;
	}
	public void setDataNac(LocalDate dataNac) {
		DataNac = dataNac;
	}
	public char getEndereco() {
		return Endereco;
	}
	public void setEndereco(char endereco) {
		Endereco = endereco;
	}
	public boolean isHabilitado() {
		return Habilitado;
	}
	public void setHabilitado(boolean habilitado) {
		Habilitado = habilitado;
	}
	public boolean isDisponivel() {
		return Disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		Disponivel = disponivel;
	}
	

}
