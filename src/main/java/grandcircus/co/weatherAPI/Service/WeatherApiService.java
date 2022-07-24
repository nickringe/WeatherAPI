package grandcircus.co.weatherAPI.Service;



import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import grandcircus.co.weatherAPI.Model.CurrentObservation;
import grandcircus.co.weatherAPI.Model.Location;
import grandcircus.co.weatherAPI.Model.WeatherResponse;

@Service
public class WeatherApiService {
	
	private static RestTemplate request = new RestTemplate();
	String url = "https://forecast.weather.gov/MapClick.php?lat=42.3831&lon=-83.1022&FcstType=json";
	//String varyUrl = "https://forecast.weather.gov/MapClick.php?lat={0}&lon={1}&FcstType=json";
	
	public String getAreaDescription(){
		String url = "https://forecast.weather.gov/MapClick.php?lat=42.3831&lon=-83.1022&FcstType=json";
		Location response = request.getForObject(url, WeatherResponse.class).getLocation();
		
		return response.getAreaDescription();
	}
	
	public List<String> getTimeStartPeriodName() {
		String url = "https://forecast.weather.gov/MapClick.php?lat=42.3831&lon=-83.1022&FcstType=json";
		List<String> response = request.getForObject(url, WeatherResponse.class).getTime().getStartPeriodName();
		
		return response;
	}
	
	public String getCurrentObName() {
		String url = "https://forecast.weather.gov/MapClick.php?lat=42.3831&lon=-83.1022&FcstType=json";
		String response = request.getForObject(url, WeatherResponse.class).getCurrentobservation().getName();
		
		return response;
	}
	
	public int getCurrentObTemp() {
		int response = request.getForObject(url, WeatherResponse.class).getCurrentobservation().getTemp();
		return response;
	}
	
	public int getCurrentObDewp() {
		int response = request.getForObject(url, WeatherResponse.class).getCurrentobservation().getDewp();
		return response;
	}

}
