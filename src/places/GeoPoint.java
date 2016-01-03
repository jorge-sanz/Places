package places;

/**
 * GeoPoint is a class which represents a location point on the Earth.
 *
 * @author Jorge Sanz Perez
 */
public class GeoPoint {
	private double longitude, latitude;
	
	
	/**
	 * Initializes a geopoint with the specified values of longitude and
	 * latitude.
	 * 
	 * @param longitude	geopoint's longitude
	 * @param latitude	geopoint's latitude
	 */
	public GeoPoint(double longitude, double latitude) {
		this.longitude = longitude;
		this.latitude = latitude;
	}

	/**
	 * Returns the longitude.
	 * 
	 * @return longitude	geopoint's longitude
	 */
	public double getLongitude() {
		return longitude;
	}

	/**
	 * Sets the longitude.
	 * 
	 * @param longitude	geopoint's longitude to set
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	/**
	 * Returns the latitude.
	 * 
	 * @return latitude	geopoint's latitude
	 */
	public double getLatitude() {
		return latitude;
	}

	/**
	 * Sets the latitude. 
	 *
	 * @param latitude	geopoint's latitude to set
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	/**
	 * Returns a String representation of the geopoint.
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GeoPoint [longitude=" + longitude + ", latitude=" + latitude 
				+ "]";
	}
	
	/**
	 * Returns the distance between this geopoint and the new one as a
	 * parameter.
	 * 
	 * @param point			a normal geopoing
	 * @return distance		distance between both geopoints
	 */
	public double distance(GeoPoint point) {
		final double EARTH_RADIUS = 6371000;
        double distanceLatitude = Math.toRadians(getLatitude() 
        		- point.latitude);
        double distanceLongitude = Math.toRadians(getLongitude() 
        		- point.longitude);
        double firstLatitude = Math.toRadians(point.latitude);
        double secondLatitude = Math.toRadians(getLatitude());
        double a = Math.sin(distanceLatitude/2) * Math.sin(distanceLatitude/2) 
        		+ Math.sin(distanceLongitude/2) * Math.sin(distanceLongitude/2) 
        		* Math.cos(firstLatitude) * Math.cos(secondLatitude);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        return c * EARTH_RADIUS;
	}
}
