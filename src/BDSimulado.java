import java.util.ArrayList;
 
public class BDSimulado {
     
    private ArrayList<Passageiro> passageiros;
    private ArrayList<Viagem> viagens;
     
    public BDSimulado(){
        //Instanciando as listas
        this.passageiros = new ArrayList<Passageiro>();
        this.viagens = new ArrayList<Viagem>();
         
        //Criando passageiros
        Passageiro p1 = new Passageiro("Maria da Silva", 46, "Bras�lia", "DF");
        Passageiro p2 = new Passageiro("Ricardo Andrade", 32, "Bras�lia", "DF");
        Passageiro p3 = new Passageiro("Carolina Pinheiro", 27, "Bras�lia", "DF");
        Passageiro p4 = new Passageiro("Jhonson Lever", 26, "Bras�lia", "DF");
        Passageiro p5 = new Passageiro("C�ssia Luiza", 15, "S�o Paulo", "SP");
        Passageiro p6 = new Passageiro("Wesley Rodrigues", 38, "S�o Paulo", "SP");
        Passageiro p7 = new Passageiro("Josefina Souza", 25, "S�o Paulo", "SP");
        Passageiro p8 = new Passageiro("Josu� Fernandes", 55, "Rio de Janeiro", "RJ");
        Passageiro p9 = new Passageiro("Ana Ribeiro", 20, "Rio de Janeiro", "RJ");
        Passageiro p10 = new Passageiro("Jo�o da Silva", 22, "Rio de Janeiro", "RJ");
 
        //Adicionando passageiros
        this.passageiros.add(p1);
        this.passageiros.add(p2);
        this.passageiros.add(p3);
        this.passageiros.add(p4);
        this.passageiros.add(p5);
        this.passageiros.add(p6);
        this.passageiros.add(p7);
        this.passageiros.add(p8);
        this.passageiros.add(p9);
        this.passageiros.add(p10);
         
        //Criando viagens
        Viagem v1 = new Viagem(1, 2016, 1, p1, "Walleerrssonn", 10, 2.50, "Bras�lia", "DF");
        Viagem v2 = new Viagem(2, 2016, 1, p10, "Walleerrssonn", 100, 22.45, "Bras�lia", "DF");
        Viagem v3 = new Viagem(3, 2016, 1, p1, "Walleerrssonn", 12, 3.00, "Bras�lia", "DF");
        Viagem v4 = new Viagem(4, 2016, 4, p4, "Jo�ozinho", 120.12, 33.50, "S�o Paulo", "SP");
        Viagem v5 = new Viagem(5, 2016, 2, p1, "Jo�ozinho", 237, 67.20, "S�o Paulo", "SP");
        Viagem v6 = new Viagem(6, 2016, 2, p7, "Jo�ozinho", 121, 24.80, "S�o Paulo", "SP");
        Viagem v7 = new Viagem(7, 2016, 3, p9, "Mariazinha", 463.89, 129.00, "Rio de Janeiro", "RJ");
        Viagem v8 = new Viagem(8, 2016, 3, p10, "Mariazinha", 5, 1.50, "Rio de Janeiro", "RJ");
        Viagem v9 = new Viagem(9, 2016, 3, p1, "Pedrinho", 35.76, 19.10, "S�o Paulo", "SP");
        Viagem v10 = new Viagem(10, 2016, 5, p3, "Pedrinho", 14.23, 7.90, "S�o Paulo", "SP");
         
        //Adicionando viagens
        this.viagens.add(v1);
        this.viagens.add(v2);
        this.viagens.add(v3);
        this.viagens.add(v4);
        this.viagens.add(v5);
        this.viagens.add(v6);
        this.viagens.add(v7);
        this.viagens.add(v8);
        this.viagens.add(v9);
        this.viagens.add(v10);
    }
 
    public ArrayList<Passageiro> getPassageiros() {
        return passageiros;
    }
 
    public ArrayList<Viagem> getViagens() {
        return viagens;
    }
    
    public String getInfoPassageiro(String nome){
    	String  resultado = " ";
    	
    	
    	for (int i = 0; i < this.passageiros.size(); i++) {
    		if (this.passageiros.get(i).getNome().equals(nome)) {
    			resultado = "Nome: " + this.passageiros.get(i).getNome() 
    					+ "\n" +
    					"Cidade: " +this.passageiros.get(i).getCidade()
    					+ "\n" +
    					"UF: " + this.passageiros.get(i).getUf()
    					+ "\n" +
    					"Idade: " + this.passageiros.get(i).getIdade();
				
			}
			
		}
    	return resultado;
    }
    
	public int getQtdeViagens(String passageiro){
		int resultado = 0;
		
		for (int i = 0; i < this.viagens.size(); i++) {
			if (this.viagens.get(i).getPassageiro().getNome().equals(passageiro)) {
				resultado++;
				
			}
			
		}
		
		return resultado;
		
		
	}
	
    public int getMaiorViagem(){
    	int resultado = 0;
    	double  maior = 0;
    	
    	for (int i = 0; i < this.viagens.size(); i++) {		
			
    		if (this.viagens.get(i).getDistancia()  > maior) {
    			maior = this.viagens.get(i).getDistancia();
    			resultado = this.viagens.get(i).getCodigo();
    		
				
			}
    		}
		
    	return resultado;
    }
	
    public ArrayList<String> listaUFsViagem(String passageiro){
    	ArrayList<String> resultado = new ArrayList<String>();
    	
    	for (int i = 0; i < this.viagens.size(); i++) {
    		if (this.viagens.get(i).getPassageiro().getNome().equals(passageiro)) {
    			resultado.add(this.viagens.get(i).getUf());
				
			}
			
		}
    	return resultado;
    }
    
    public double getCustoPorKm(String nomePas){
    	double resultado = 0;
    	
    	for (int i = 0; i < this.viagens.size(); i++) {
    		if (this.viagens.get(i).getPassageiro().getNome().equals(nomePas)) {
    			resultado = this.viagens.get(i).getValor() / this.viagens.get(i).getDistancia();
				
			}
			
		}
    	return resultado;
    }
    
    public ArrayList<String> getListaMotoqueiros(int mes, int ano){
    	ArrayList<String> resultado = new ArrayList<String>();
    	
    	for (int i = 0; i < this.viagens.size(); i++) {
    		if (this.viagens.get(i).getMes() == mes && this.viagens.get(i).getAno() == ano) {
    			resultado.add(this.viagens.get(i).getMotoqueiro());
				
			}
			
		}
    	return resultado;
    }
    
    public int getViagensForaDaUF(String passageiro, String UF){
    	int resultado = 0;
    	
    	
    	for (int i = 0; i < this.viagens.size(); i++) {
    		if (this.viagens.get(i).getPassageiro().getNome().equals(passageiro) && this.viagens.get(i).getUf() != UF ) {
    			resultado ++;
				
			}
			
		}
    	return resultado;
    }
    
    public double getKmPosPasMot(String passageiro, String motoqueiro){
    	double resultado = 0;
    	
    	for (int i = 0; i < this.viagens.size(); i++) {
    		if (this.viagens.get(i).getPassageiro().getNome().equals(passageiro) && this.viagens.get(i).getMotoqueiro().equals(motoqueiro)) {
    			resultado = this.viagens.get(i).getDistancia();
				
			}
			
		}
    	return resultado;
    }
    
   
	
}