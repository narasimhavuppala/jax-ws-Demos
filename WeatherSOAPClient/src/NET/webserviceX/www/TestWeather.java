package NET.webserviceX.www;

import java.rmi.RemoteException;

public class TestWeather {

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub
		GlobalWeatherSoapProxy globalWeather=new GlobalWeatherSoapProxy();
		System.out.println(globalWeather.getCitiesByCountry("India"));

	}

}
