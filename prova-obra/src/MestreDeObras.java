/**
 *
 * @author Myreli
 */
public class MestreDeObras implements Operario {
    private String nome;

    public MestreDeObras(String nome) {
        this.nome = nome;
    }

    @Override
    public void notificacao(String mensagem) {
        System.out.println("--");
        System.out.println("Mestre de obras " + this.nome + " agora sabe que... " + mensagem);
    }

    @Override
    public String getNome() {
        return this.nome;
    }
}
