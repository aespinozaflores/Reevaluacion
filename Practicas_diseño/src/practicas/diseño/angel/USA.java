/**
 * Alumno: Angel Mannuel Espinoza Flores
 * Grupo:GITI7083-s
 */
package practicas.diseño.angel;

public class USA extends AVerificador{
	
	public USA() {
		// TODO Auto-generated constructor stub
		//Crea BancoUSA
		BancoUSA bancoUS= new BancoUSA();
		//Crea CreditoUSA
		CreditoUSA cedusa = new CreditoUSA();
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
