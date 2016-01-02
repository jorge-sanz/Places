package places;

public enum PlaceType {
		OTHERS ("Others", 5),
		RESTAURANT ("Restaurant", 2),
		BAR ("Bar", 6),
		CLUB ("Club", 0),
		ENTERTAINMENT ("Entertainment", 0),
		HOTEL ("Hotel", 0),
		SHOPPING ("Shopping", 0),
		EDUCATION ("Education", 0),
		SPORT ("Sport", 0),
		NATURE ("Nature", 0),
		FUEL_STATION ("Fuel Station", 0);
	
	private final String text;
	private final int resource;
	
	PlaceType(String text, int resource) {
	    this.text = text;
	    this.resource = resource;
	}
	
	public String getText() { return text; }
	public int getResource() { return resource; }
}
