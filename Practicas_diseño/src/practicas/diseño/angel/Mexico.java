/**
 * Alumno: Angel Mannuel Espinoza Flores
 * Grupo:GITI7083-s
 */
package practicas.diseño.angel;

public class Mexico extends AVerificador{

	public Mexico() {
		// TODO Auto-generated constructor stub
	
		//Crea BancoMexico
		BancoMexico bancomx = new BancoMexico();
		//CreaCreditoMExico
		CreditoMexico credx = new CreditoMexico();
	}

	//Reescribe getBanco de AVerificador
	@Override
	void getBanco() {
		// TODO Auto-generated method stub	
	}

	@Override
	void getCredito() {
		// TODO Auto-generated method stub
		
	}
	

	
}

