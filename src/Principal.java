import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		BDSimulado bds = new BDSimulado();
		
        ArrayList<Passageiro> PassageiroPorNome = bds.getInfoPassageiro("Maria da Silva");
        
        for (int i = 0; i < PassageiroPorNome.size(); i++){
        	System.out.println(" ¥¥ " + PassageiroPorNome.get(i).getNome() + " ¥¥ " + "\n" +
        "Idade: " + PassageiroPorNome.get(i).getIdade() + "\nCidade: " + PassageiroPorNome.get(i).getCidade()
        + "\nUF: " + PassageiroPorNome.get(i).getUf());
              
        	}
        System.out.println(" ¥¥ Quantidade de viagens ¥¥ " + "\n" + bds.getQtdeViagens("João da Silva"));
        
        System.out.println(" ¥¥ Maior Viagem ¥¥ " + "\n" + bds.getMaiorViagem());
	}

}
