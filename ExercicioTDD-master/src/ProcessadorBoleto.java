import java.util.List;

public class ProcessadorBoleto {
	double totalBoleto;


	public boolean processa(Fatura fatura, List<Boleto> listBoleto) {
		
		for (Boleto boleto : listBoleto) {
			totalBoleto = totalBoleto + boleto.getValorPago();
		}
		
		
		if (fatura.getValorTotal() < totalBoleto) {
			return true;
		}
		else
			return false;
	}
}
