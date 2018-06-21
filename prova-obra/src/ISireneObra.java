/**
 *
 * @author Myreli
**/

interface ISireneObra {
    public void entra(Operario operario);
    public void sai(Operario operario);
    public void sai(int i);
    public void sinaliza(int pos, String mensagem);
	public void sinaliza(String mensagem);
	public void aviso(String aviso);
}
