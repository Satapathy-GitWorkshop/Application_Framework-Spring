import org.springframework.beans.factory.annotation.Required;

public class PlantInfo {
//Declaration of property	
private String name;	
private String water;
private String sunlight;
private float  compost_ratio;
//Couple of Setter
public void setName(String name) {
	this.name = name;
}
public void setWater(String water) {
	this.water = water;
}
@Required
public void setSunlight(String sunlight) {
	this.sunlight = sunlight;
}

@Required
public void setCompost_ratio(float compost_ratio) {
	this.compost_ratio = compost_ratio;
}
@Override
public String toString() {
	return "PlantInfo [name=" + name + ", water=" + water + ", sunlight=" + sunlight + ", compost_ratio="
			+ compost_ratio + "]";
}


}
