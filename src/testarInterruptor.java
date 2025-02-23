public class testarInterruptor {
    private static Interruptor interruptor;

    public static void main(String[] args){
        interruptor = Interruptor();
        
        interruptor.pressionar();
                
        interruptor.verificarLampada();
                
        interruptor.pressionar();
        
        interruptor.verificarLampada();
    }

}
