import java.util.ArrayList;

public class BancoTelefone {
    
    
    private static String numeros[]=new String[15];
    private static int j=0;
    private static ArrayList<String>numeross=new ArrayList<String>();



    public BancoTelefone() {
        numeross.add("11111111");
        numeross.add("22222222");
        numeross.add("33333333");
    }
    
    public static AbstractTelefone getTelefone(String numero) {
		for (int i = 0; i < numeross.size(); i++){
			if (numeross.get(i).equalsIgnoreCase(numero)){ 
				return new Telefone(numero);
            }
        }	
		return new NullTelefone();
	}
    public String[] getNumero() {
        return numeros;
    }
    public static ArrayList<String> getNumeross() {
        return numeross;
    }

    public void setNumero(String numero) {   
        BancoTelefone.numeros[j] = numero; 
        j++;  
    }   
    

}





