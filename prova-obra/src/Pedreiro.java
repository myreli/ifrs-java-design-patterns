/**
 *
 * @author Myreli
 */
public class Pedreiro implements Operario {
    private String nome;

    public Pedreiro(String nome) {
        this.nome = nome;
    }

    @Override
    public void notificacao(String mensagem) {
        System.out.println("--");
        System.out.println("Pedreiro " + this.nome + ": agora sabe que ..." + mensagem);
    }

    @Override
    public String getNome() {
        return this.nome;
    }
    
}