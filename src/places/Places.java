package places;

import java.util.ArrayList;
import java.util.List;

public class Places {
	protected static List<Place> placesVector = placesExample();
	
	/**
	 * Initializes Places.
	 */
	public Places() {
		placesVector = placesExample();
	}
	
	/**
	 * Returns the place in the specified position.
	 * 
	 * @param id	the place's id
	 * @return the place in the specified position
	 */
	static Place element(int id) {
		return placesVector.get(id); 
	}
	
	/**
	 * Adds a new specified place to the list of places.
	 * 
	 * @param place	the new place to be added
	 */
	static void add(Place place) {
		placesVector.add(place);
	}
	
	/**
	 * Adds a new default place to the list of places.
	 * 
	 * @return
	 */
	static int newPlace() {
		Place place = new Place();
		placesVector.add(place);
		return placesVector.size() - 1;
	}
	
	/**
	 * Removes the specified place in the list of places.
	 * 
	 * @param id	the id of the place to be removed
	 */
	static void remove(int id) {
		placesVector.remove(id);
	}
	
	/**
	 * Returns the size of the list of places.
	 * 
	 * @return size of the list of places
	 */
	public static int size() {
		return placesVector.size();
	}
	
	/**
	 * Returns a list of places.
	 * 
	 * @return places	a list of places
	 */
	public static ArrayList<Place> placesExample() {
		ArrayList<Place> places = new ArrayList<Place>();
		places.add(new Place("Escuela Politecnica Superior de Gandia", 
				"C/ Paranimf, 1 46730 Gandia (SPAIN", -0.166093, 38.995656,
				962849300, "http://www.epsg.upv.es", "Uno de los mejores"
				+ " lugares para formarse.", 3, PlaceType.EDUCATION));
		return places;
	}
}
