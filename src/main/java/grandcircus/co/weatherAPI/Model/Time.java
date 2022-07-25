package grandcircus.co.weatherAPI.Model;

import java.util.List;

public class Time {
	
	private List<String> startPeriodName;

	public StringBuilder getStartPeriodName() {
		StringBuilder sb = new StringBuilder();
		int counter = 0;
		for (String s : startPeriodName) {
			if(counter == 0) {
				sb.append(s);
				sb.append("<br>");
				sb.append("<br>");				
			}
			if(counter != 0) {
			sb.append(s);
			sb.append("<br>");
			}
			counter++;
		}
		return sb;
	}

	public void setStartPeriodName(List<String> startPeriodName) {
		this.startPeriodName = startPeriodName;
	}
	
	

}
