package grandcircus.co.weatherAPI.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrentObservation {
	
	private String name;
	
	@JsonProperty("Temp")
	private int temp;
	
	@JsonProperty("Dewp")
	private int dewp;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public int getDewp() {
		return dewp;
	}

	public void setDewp(int dewp) {
		this.dewp = dewp;
	}

	
}
