import java.util.ArrayList;

/**
 *
 * @author Myreli
 */
public class SireneObra implements ISireneObra {
    private String nome;
    private ArrayList<Operario> operarios;

    public SireneObra(String nome) {
        this.nome = nome;
        this.operarios = new ArrayList<Operario>();
    }
    
    @Override
    public void entra(Operario operario){
        this.operarios.add(operario);
        this.sinaliza(operarios.size() - 1, operario.getNome() + " agora trabalha na obra " + nome);
    }
    
    @Override
    public void sai(int i){
        this.sinaliza(i, this.operarios.get(i).getNome() + " agora não trabalha na obra " + nome);
        this.operarios.remove(i);
    }
        
    @Override
    public void sai(Operario operario){
        int pos = this.operarios.indexOf(operario);
        this.sinaliza(pos, operario.getNome() + " agora nao trabalha na obra " + nome);
        this.operarios.remove(operario);
    }
    
    public void inicioExpediente() {
		aviso("tocando sinal inicio do expediente... para " + nome);
	}
	
	public void horarioAlmoco() {
		aviso("tocando sinal do almoço... para " + nome);
	};
	
	public void reuniao() {
		aviso("tocando sinal de reuniao... para " + nome);
	};
	
	public void fimExpediente() {
		aviso("tocando sinal fim do expediente... para " + nome);
	}
	
	@Override
	public void aviso(String aviso) {
		sinaliza(aviso);
	}
    
    @Override
    public void sinaliza(int pos, String mensagem){
        for (int i = 0; i < operarios.size(); i++) {
            Operario c = operarios.get(i);
            if (i != pos ){
                c.notificacao(mensagem);            
            }
        }
    }
    
    @Override
    public void sinaliza(String mensagem){
        for (int i = 0; i < operarios.size(); i++) {
            Operario c = operarios.get(i);
            c.notificacao(mensagem);            
        }
    }
}