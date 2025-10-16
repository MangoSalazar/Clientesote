
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
public class ParaMandar implements Runnable{
    String[] mensajitos = {"@0 hola", "que rollo", "opa opa", "register mango"};
    final BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
    final DataOutputStream salida ;
    public ParaMandar(Socket s) throws IOException {
        this.salida = new DataOutputStream(s.getOutputStream());
    }

    @Override
    public void run() {
        int nMensaje = 0;
        while ( true ){
            String mensaje;
            try {
                while (nMensaje < mensajitos.length) {
                    mensaje = mensajitos[nMensaje];
                    if (nMensaje < 4) {
                        salida.writeUTF(mensaje);                    
                    }
                    nMensaje++;
                }
            } catch (IOException ex) {
            }

        }
    }
    public static void mandarMensaje(String mensaje){
    
    }

}
 
