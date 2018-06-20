package apresentacao;

import neogcio.BancoUsuariosProxy;

/**
 *
 * @author iapereira
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BancoUsuariosProxy bancoUsuariosProxy = new BancoUsuariosProxy("tads", "tads");
        System.out.println(bancoUsuariosProxy.getNumeroDeUsuarios());
        System.out.println(bancoUsuariosProxy.getUsuariosConectados());
    }
    
}
