import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import com.banqueexample.entities.Compte;
import com.banqueexample.rmi.BanqueRemote;

public class ClientRmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			BanqueRemote proxy = (BanqueRemote) Naming.lookup("rmi://localhost:1099/BK");
			Compte cp = proxy.getCompte("CC1");
			System.out.println(cp.getSolde());
			System.out.println(cp.getDateCreation());
			System.out.println(cp.getClient().getNomClient());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
