package hello;
import java.util.HashMap;
import java.awt.Color;

public class ColorChoice {
	
	private static HashMap<String, Color> colors;
	private long id;
	private Color color;
	private String out;
	
	
	public ColorChoice(String colorIn){
		colorIn.toLowerCase();
		colors = new HashMap<>();
		colors.put("black", new Color(1,1,1));
		colors.put("red", new Color(255,0,0));
		colors.put("blue", new Color(0,0,255));
		colors.put("green", new Color(0,255,0));
		System.out.print(colorIn);
		System.out.println(colors.get(colorIn));
		if (colors.get(colorIn) != null){
			out =colors.get(colorIn).toString();
		}
		else {
			out = "Not a valid color";
		}


		color = new Color(1,1,1);
	}

	public long getId() {
		return id;
	}

	public String getColor() {
		return out;
	}

}