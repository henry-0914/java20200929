package chap18.textbook.s180706;

import java.net.ServerSocket;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;

public class ServerExample extends Application {
	ExecutorService executorService;
	ServerSocket serverSocket;
	List<Client> connections = new Vector<Client>();
	
	void startServer() {}
	void stopServer( ) {}
	
	class Client {}
	
}
