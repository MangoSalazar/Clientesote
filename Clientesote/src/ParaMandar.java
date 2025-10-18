
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ParaMandar implements Runnable {

    String[] mensajitos = {"@0 mensaje privado", "primer mensaje global", "segundo mensaje global", "login kikesion kikesion", "#mango"};
    final BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
    final DataOutputStream salida;

    public ParaMandar(Socket s) throws IOException {
        this.salida = new DataOutputStream(s.getOutputStream());
    }

    @Override
    public void run() {
        mandarMensaje();
    }

    public void mandarMensaje() {
        int nMensaje = 0;
        while (true) {
            String mensaje = "";
            try {
                //De momento creare el metodo de enviar test para provar el cliente y el servidor
                nMensaje = enviarTest(nMensaje, mensaje);
            } catch (IOException ex) {
                
            }

        }
    }

    public int enviarTest(int nMensaje, String mensaje) throws IOException {
        while (nMensaje < mensajitos.length) {
            mensaje = mensajitos[nMensaje];
            salida.writeUTF(mensaje);
            nMensaje++;
        }
        return nMensaje;
    }

}
