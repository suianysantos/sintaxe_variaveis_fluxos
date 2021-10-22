
public class TesteIR {
	
	public static void main(String[] args) {

	    double salario = 1900.2;

	    if (salario >= 1900.0 && salario <= 2800.0) {
	    	System.out.println("O IR é de 7.5%, você terá dedução R$142");
	    }else {
	    	
	    if (salario >= 2800.01 && salario <= 3751.0) {
	    	System.out.println("O IR é de 15%, você terá dedução R$350");	
	    }else {
	    	
	    if (salario >= 4664.0) {
	    	System.out.println("O IR é de 22.5%, você terá dedução R$636");
	    	
	    }
	    	
	    }  
	    
	}
	}
}





	
	
	