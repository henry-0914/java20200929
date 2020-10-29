package chap18.textbook.s180706;

import java.net.ServerSocket;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;

import org.omg.CORBA.portable.ApplicationException;
import org.omg.CORBA.portable.InputStream;

public class ServerExample extends ApplicationException {
	public ServerExample(String arg0, InputStream arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	ExecutorService executorService;
	ServerSocket serverSocket;
	List<Client> connections = new Vector<Client>();
	
	void startServer() {}
	void stopServer( ) {}
	
	class Client {}
	
}
