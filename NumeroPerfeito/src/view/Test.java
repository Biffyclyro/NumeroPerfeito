package view;

import model.Comparador;

public class Test {
    public static void main(String[] args) {
       rangeNum(100000);       
    }
    
    private static void rangeNum(int x){
        for(int i=0; i<=x; i++){            
            if(Comparador.numPerfeito(i)!=0){
                System.out.println(i);
            }
        }
    }
    
}


