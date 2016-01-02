package places;

public class Place {
	private String name;
	private String address;
	private GeoPoint position;
	private String photo;
	private int phoneNumber;
	private String url;
	private String comment;
	private long date;
	private float rate;
	private PlaceType type;
	
	
	/**
	 * Initializes a place.
	 */
	public Place() {
		date = System.currentTimeMillis();
		position = new GeoPoint(0, 0);
		type = PlaceType.OTHERS;
	}
	
	/**
	 * Initializes a place with the specified values of name, address, 
	 * longitude, latitude, phone number, url, comment, rate and type.
	 * 
	 * @param name			place's name
	 * @param address		place's address
	 * @param longitude		place's longitude
	 * @param latitude		place's latitude
	 * @param phoneNumber	place's phone number
	 * @param url			place's website url
	 * @param comment		your place review
	 * @param rate			your place rate
	 * @param type			place's type
	 */
	public Place(String name, String address, double longitude, 
			double latitude, int phoneNumber, String url, String comment,
			int rate, PlaceType type) {
		date = System.currentTimeMillis();
		position = new GeoPoint(longitude, latitude);
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.url = url;
		this.comment = comment;
		this.rate = rate;
		this.type = type;
	}
	
	/**
	 * Returns the place's name.
	 * 
	 * @return name	the place's name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the place's name.
	 * 
	 * @param name	the place's name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Returns the place's address.
	 * 
	 * @return address	the place's address
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * Sets the place's address.
	 * 
	 * @param address	the place's address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * Returns the place's position.
	 * 
	 * @return position	the place's position
	 */
	public GeoPoint getPosition() {
		return position;
	}
	
	/**
	 * Sets the place's position.
	 * 
	 * @param position	the place's position to set
	 */
	public void setPosition(GeoPoint position) {
		this.position = position;
	}
	
	/**
	 * Returns the place's photo.
	 * 
	 * @return photo	the place's photo
	 */
	public String getPhoto() {
		return photo;
	}
	
	/**
	 * Sets the place's photo.
	 * 
	 * @param photo	the place's photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	/**
	 * Returns the place's phone number.
	 * 
	 * @return	phoneNumber	the place's phone number
	 */
	public int getPhoneNumber() {
		return phoneNumber;
	}
	
	/**
	 * Sets the place's phone number.
	 * 
	 * @param phoneNumber	the place's phone number to set
	 */
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	/**
	 * Returns the place's url.
	 * 
	 * @return url	the place's url
	 */
	public String getUrl() {
		return url;
	}
	
	/**
	 * Sets the place's url
	 * 
	 * @param url	the place's url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	
	/**
	 * Returns your place's comment.
	 * 
	 * @return comment	your place's comment
	 */
	public String getComment() {
		return comment;
	}
	
	/**
	 * Sets your place's comment.
	 * 
	 * @param comment	your place's comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	/**
	 * Returns the date you visit the place.
	 * 
	 * @return date	the date you visit the place
	 */
	public long getDate() {
		return date;
	}
	
	/**
	 * Sets the date you visit the place.
	 * 
	 * @param date	the date you visit the place to set
	 */
	public void setDate(long date) {
		this.date = date;
	}
	
	/**
	 * Returns your place's rate
	 * 
	 * @return rate	your place's rate
	 */
	public float getRate() {
		return rate;
	}
	
	/**
	 * Sets your place's rate
	 * 
	 * @param rate	your place's rate to set
	 */
	public void setRate(float rate) {
		this.rate = rate;
	}
	
	/**
	 * Returns the place's type.
	 * 
	 * @return type	the place's type
	 */
	public PlaceType getType() {
		return type;
	}

	/**
	 * Sets the place's type.
	 * 
	 * @param type	the place's type
	 */
	public void setType(PlaceType type) {
		this.type = type;
	}

	/**
	 * Returns a String representation of the place
	 * 
	 * @return String representation of the place
	 */
	@Override
	public String toString() {
		return "Place [name=" + name + ", address=" + address + ", photo=" 
				+ photo + ", phoneNumber=" + phoneNumber + ", url=" + url 
				+ ", comment=" + comment + ", date=" + date + ", rate=" 
				+ rate + "]";
	}
}
