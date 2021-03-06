package strategy;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import entidades.Aluguel;
import entidades.Carro;
import entidades.Moto;

public class AlugarAdaptado extends AlugarContext {

	private AlugarMoto alugar;
	
	public AlugarAdaptado(AlugarStrategy strategy) {
		super(strategy);
		this.alugar = new AlugarMoto();
	}
	
	// PREMISSA -- TUDO RELACIONADO AO STRATEGY FOI RESTRITO, logo � necessario outro m�todo para poder alugar uma moto
	public Aluguel alugarMoto(Moto m, int dias, double taxa) {
		      return this.alugar.alugarMoto(m, dias, taxa);
	}
}
