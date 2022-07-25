package grandcircus.co.weatherAPI.Model;

import java.util.List;

public class Data {

	private List<String> text;

	public StringBuilder getText() {
		StringBuilder sb = new StringBuilder();
		for (String s : text) {
			sb.append(s);
			sb.append("<br>");
		}
		return sb;
	}
	

	public void setText(List<String> text) {
		this.text = text;
	}
	
	
}
