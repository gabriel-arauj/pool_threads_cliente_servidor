
/**
 * Client program requesting current date from server.
 *
 */

import java.net.*;
import java.io.*;

public class DateClient
{
	public static void main(String[] args) throws IOException {
		InputStream in = null;
		BufferedReader bin = null;
		Socket sock = null;

		try {
			sock = new Socket("127.0.0.1",6013);
			in = sock.getInputStream();
			bin = new BufferedReader(new InputStreamReader(in));

			PrintWriter pout = new PrintWriter(sock.getOutputStream(), true);
			try{
				pout.println(args[0]);
			}catch(Exception e){
				System.out.println("ERRO de parâmetros");
				sock.close();
				return;
			}

			String line;
			while( (line = bin.readLine()) != null)
				System.out.println(line);
		}catch (IOException ioe) {
			System.err.println(ioe);
		}
		finally {
			sock.close();
		}
	}
}