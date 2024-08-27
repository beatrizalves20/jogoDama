package com.damas.objetos;

public class PedraVermelha extends Pedra{
    /**
     * @param casa
     * @param tipo
     */
    public PedraVermelha(Casa casa, int tipo) {
        super(casa, tipo);
    }
        // REGRA PARA PEÇAS VERMELHAS
        public boolean podeTransformarParaDama() {
            if (casa.getY() == 0) {
                return true;
            }
            

            return false;
        }   

    public  Peca transformarPedraParaDama(){
        return new DamaVermelha(casa, Peca.DAMA_VERMELHA);
  
    }     
}
