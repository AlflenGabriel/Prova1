import java.util.ArrayList;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BDSimulado bds = new BDSimulado();

		ArrayList<Passageiro> passageiros = bds.getPassageiros();
		ArrayList<Viagem> viagens = bds.getViagens();
		
		String getInfoPassageiro = bds.getInfoPassageiro("Maria da Silva");
		System.out.println(getInfoPassageiro + "\n");
		
		
		int getQtdeViagens = bds.getQtdeViagens("Maria da Silva");
		System.out.println("Quantidade de viagens: " + getQtdeViagens + "\n");
		
		int getMaiorViagem = bds.getMaiorViagem();
		System.out.println("Viagem com Maior distancia: " + getMaiorViagem + "\n");
		
		ArrayList<String> getlistaUFsViagem = bds.listaUFsViagem("Maria da Silva");
		System.out.println("Estados viajados: " + getlistaUFsViagem + "\n");
	
		
	   System.out.println("O passageiro fez: R$ " +bds.getCustoPorKm("Ana Ribeiro") + " por KM. " + "\n");
		
	   
	   ArrayList<String> getListaMotoqueiros = bds.getListaMotoqueiros(3, 2016);
	   System.out.println("Motoqueiros que viajaram em uma determinada data: " + getListaMotoqueiros + "\n");
	
	   int getViagensForaDaUF = bds.getViagensForaDaUF("João da Silva", "DF");
	   System.out.println("Viagens fora do estado de origem: " + getViagensForaDaUF + "\n");
	   
	   double getKmPosPasMot = bds.getKmPosPasMot("Maria da Silva", "Pedrinho");
	   System.out.println("Km percorrido por determinado passageiro e determinado motoqueiro: " + getKmPosPasMot);
	   
	}

}

/*		
		BDSimulado bds = new BDSimulado();
		
        ArrayList<Passageiro> PassageiroPorNome = bds.getInfoPassageiro("Maria da Silva");
        
        for (int i = 0; i < PassageiroPorNome.size(); i++){
        	System.out.println(" ¥¥ " + PassageiroPorNome.get(i).getNome() + " ¥¥ " + "\n" +
        "Idade: " + PassageiroPorNome.get(i).getIdade() + "\nCidade: " + PassageiroPorNome.get(i).getCidade()
        + "\nUF: " + PassageiroPorNome.get(i).getUf());
              
        	}
        System.out.println(" ¥¥ Quantidade de viagens ¥¥ " + "\n" + bds.getQtdeViagens("João da Silva"));
        
        System.out.println(" ¥¥ Maior Viagem ¥¥ " + "\n" + bds.getMaiorViagem());
	
        ArrayList<String> getlistaUFsViagem = bds.listaUFsViagem("Maria da Silva");
		System.out.println("Estados viajados: " + getlistaUFsViagem + "\n");
	
		
	   System.out.println("O passageiro fez: R$ " +bds.getCustoPorKm("Maria da Silva") + " por KM. " + "\n");
		
	   
	   ArrayList<String> getListaMotoqueiros = bds.getListaMotoqueiros(3, 2016);
	   System.out.println("Motoqueiros que viajaram em uma determinada data: " + getListaMotoqueiros + "\n");
	
	   int getViagensForaDaUF = bds.getViagensForaDaUF("João da Silva", "DF");
	   System.out.println("Viagens fora do estado de origem: " + getViagensForaDaUF + "\n");
	   
	   double getKmPosPasMot = bds.getKmPosPasMot("Maria da Silva", "Pedrinho");
	   System.out.println("Km percorrido por determinado passageiro e determinado motoqueiro: " + getKmPosPasMot);
	   
	}

	
}
	*/

