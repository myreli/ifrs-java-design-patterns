/**
 * 
 */
package modelo;

/**
 * @author myreli
 *
 */
public abstract class Personagem {

	private Arma arma;
	private String nome;
	protected int xp;
	private int level;
	private int vida;
	
	private static final int XP_MARK = 100;
	private static final int VIDA_INICIAL = 100;
	private static final int LVL_INICIAL = 1;
	
	public Personagem(String nome) {
		this.nome  = nome;
		this.level = LVL_INICIAL;
		this.vida  = VIDA_INICIAL;
	}
	
	public String display() {
		return this.getClass().getSimpleName() + " " + this.nome;
	}
	
	public void pega(Arma arma) {
		if(arma == null) return;
		
		this.arma = arma;
		
		System.out.println(this.getClass().getSimpleName() + " " + this.nome + " pegou " + this.arma.getClass().getSimpleName());
	}
	
	public void ataca(Personagem personagem) {
		if (personagem == null || !personagem.vivo()
				|| this.arma == null || !this.vivo()) return;
		
		System.out.println(this.getClass().getSimpleName() + " " + this.nome + " ataca " 
				+ personagem.getClass().getSimpleName() + " " + personagem.nome );
		
		if(this.usaArma()) {
			personagem.sofre(level * arma.getPwr());
			evolui();
		}
		
	}

	private void sofre(int dano) {
		this.vida -= dano;
		
		if(!this.vivo()) {
			vida = 0;
			System.out.println(this.getClass().getSimpleName() + " " + this.nome + " morreu");
		}
		
		System.out.println(this.getClass().getSimpleName() + " " + this.nome + " agora tem " + this.vida + " de vida");
		
		aprende();
	}
	
	public void evolui() {
		if (xp < XP_MARK) return;
		
		xp = 0;
		level++;
		
		System.out.println(this.getClass().getSimpleName() + " " + this.nome + " evoluiu para " + this.level);
	}
	
	public boolean usaArma() {
		return this.arma.usa();
	}
	
	public boolean vivo() {
		return vida > 0;
	}
	
	protected abstract void aprende();
	
}
