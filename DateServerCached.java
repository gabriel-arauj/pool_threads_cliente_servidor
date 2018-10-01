import java.net.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.io.*;

public class DateServer
{
	public static void main(String[] args) throws IOException {
		ServerSocket sock = null;

		try {
			sock = new ServerSocket(6013);
			ExecutorService pool = Executors.newCachedThreadPool();
			while (true) {
				pool.execute(new Operacao(sock.accept()));
				//Thread worker = new Thread(new Operacao(sock.accept()));
				//worker.start();
			}
		}
		catch (IOException ioe) {
			System.err.println(ioe);
		}
		finally {
			if (sock != null)
				sock.close();
		}
	}
}