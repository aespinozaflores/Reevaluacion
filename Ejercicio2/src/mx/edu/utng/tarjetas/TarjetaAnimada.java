package mx.edu.utng.tarjetas;

import java.util.List;

public class TarjetaAnimada extends Tarjeta {
	
	private int codigo;
	private Fondo fondo;
	private Dedicatoria dedicatoria;
	private Imagen imagen;
	
	
	public TarjetaAnimada(Fondo fondo, Imagen imagen, 
			List<Destinatario> destinatarios){
		super(destinatarios);
		this.fondo = fondo;
		this.imagen = imagen;
		this.dedicatoria = new Dedicatoria();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	 
	

}
