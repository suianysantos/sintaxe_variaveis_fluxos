
public class TesteIR {
	
	public static void main(String[] args) {

	    double salario = 1900.2;

	    if (salario >= 1900.0 && salario <= 2800.0) {
	    	System.out.println("O IR � de 7.5%, voc� ter� dedu��o R$142");
	    }else {
	    	
	    if (salario >= 2800.01 && salario <= 3751.0) {
	    	System.out.println("O IR � de 15%, voc� ter� dedu��o R$350");	
	    }else {
	    	
	    if (salario >= 4664.0) {
	    	System.out.println("O IR � de 22.5%, voc� ter� dedu��o R$636");
	    	
	    }
	    	
	    }  
	    
	}
	}
}





	
	
	