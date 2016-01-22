package mx.edu.utng.tarjetas;

import java.util.List;

public class Tarjeta {
	private String tipo;
	private String dedicatoria;
	private int numDestinatario;
	private Remitente remitente;
	private List<Destinatario> destinatarios;
	public Tarjeta() {	
		// TODO Auto-generated constructor stub

	}
	public void adicionarRemitente(Remitente remitente){
		this.remitente = remitente;
	}
	
	public void adicionarDestinatario(List<Destinatario> destinatarios){
		this.destinatarios = destinatarios;
		
	}
	
	public Tarjeta(List<Destinatario> destinatarios){
		this.destinatarios = destinatarios;
	}
	
	public String getTipo() {
		return tipo;
	}
	public String getDedicatoria() {
		return dedicatoria;
	}
	public int getNumDestinatario() {
		return numDestinatario;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setDedicatoria(String dedicatoria) {
		this.dedicatoria = dedicatoria;
	}
	public void setNumDestinatario(int numDestinatario) {
		this.numDestinatario = numDestinatario;
	}
}
