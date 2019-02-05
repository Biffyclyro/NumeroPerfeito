package model;

public class Comparador {   
    
    private static int resultado;    
    
    public static int numPerfeito(int numero){
            
            Comparador.resultado=0;
            for(int j = 1; j<numero ; j++){
                if(numero % j==0){
                    Comparador.resultado+=j;
                }
            }
            if(Comparador.resultado==numero){
                return numero;
                        
                        
            }else{
                return 0;
            }
            
        
        
       
    }
    
    
}
