package JavaGameProject.Adapter;

import JavaGameProject.Abstract.IGamerCheckService;
import JavaGameProject.Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IGamerCheckService {

	@Override
	public boolean checkIfRealGamer(Gamer gamer) {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		boolean result = false;

		try {
			result = proxy.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()),
					gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(),
					gamer.getDateOfBirth().getYear());

		} catch (Exception e) {
			System.out.println("Not a valid person");
		}
		return result;	
	}

}
