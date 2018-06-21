/**
 *
 * @author Myreli
 */
public class Main {

    public static void main(String[] args) {
    	
    	// observer
        
        SireneObra construcao 	= new SireneObra("Obra TADS");
        Operario estagiario 	= new Trainee("Bernardo");
        Operario igor 			= new MestreDeObras("Igor");
        Operario robinson 		= new Pedreiro("Robinson");
        
        construcao.entra(estagiario);
        construcao.entra(igor);
        construcao.entra(robinson);
        
        construcao.inicioExpediente();
        /*construcao.horarioAlmoco();
        construcao.reuniao();
        construcao.aviso("acabou o estagio");
        construcao.sai(estagiario);
        construcao.aviso("tem folga amanhã galerinha");*/
        //construcao.fimExpediente();
        
    }    
}
