/**
 *
 * @author Myreli
 */
public class Trainee implements Operario {

    private String nome;

    public Trainee(String nome) {
        this.nome = nome;
    }

    @Override
    public void notificacao(String mensagem) {
        if (!mensagem.contains("reuniao")) {
        	System.out.println("--");
            System.out.println("Trainee " + this.nome + ": agora sabe que " + mensagem);
        }
    }
    @Override
    public String getNome() {
        return this.nome;
    }
}
