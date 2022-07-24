package grandcircus.co.weatherAPI.Model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherResponse {

	@JsonProperty("location")
	private Location location;
	
	@JsonProperty("time")
	private Time time;
	
	@JsonProperty("currentobservation")
	private CurrentObservation currentobservation;
	
	@JsonProperty("data")
	private Data data;

	
	
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public CurrentObservation getCurrentobservation() {
		return currentobservation;
	}
	public void setCurrentobservation(CurrentObservation currentobservation) {
		this.currentobservation = currentobservation;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}

	
	
	
	
	

//	"location": {
//		"areaDescription": "Detroit MI"
	
//	"currentobservation": {
//		"name": "Coleman A Young Municipal Airport",
//		"Temp": "86"
//	    "Dewp": "62",
	
//	"time": {
//		"startPeriodName": [
//		"Tonight",
//		"Thursday",
//		"Thursday Night",
//		"Friday",
//		"Friday Night",
//		"Saturday",
//		"Saturday Night",
//		"Sunday",
//		"Sunday Night",
//		"Monday",
//		"Monday Night",
//		"Tuesday",
//		"Tuesday Night",
//		"Wednesday"
//		]
//
}
