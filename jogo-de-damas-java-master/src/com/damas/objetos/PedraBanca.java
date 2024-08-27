package com.damas.objetos;

public class PedraBanca extends Pedra{

    public PedraBanca(Casa casa, int tipo) {
        super(casa, tipo);
    }
        // REGRA PARA PEÇAS BRANCAS
        public boolean podeTransformarParaDama() {
            if (casa.getY() == 7){
                return true;
            } 

            return false;
        }   
    
    public  Peca transformarPedraParaDama(){
        return new DamaBranca(casa, Peca.DAMA_BRANCA);    
    }    
    
                  
}
