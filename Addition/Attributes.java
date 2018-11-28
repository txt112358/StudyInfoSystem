package Addition;
import java.util.HashMap;

/**
 * This class is used to record the additional attributes for differet types of person
 */

/**
 * @author Tang, Xintian
 *
 */
public class Attributes {
	HashMap<String, String> attributes = new HashMap<>();

	/**
	 * Add attribute to the Attributes
	 * 
	 * @param key
	 *            The key field of the attribute
	 * @param value
	 *            The value field of the attribute
	 */
	public void addAttribute(String key, String value) {
		assert key != null : "The key cannot be null";
		assert value != null : "The value cannot be null";
		this.attributes.put(new String(key), new String(value));
	}

	/**
	 * Get the number of attributes
	 * 
	 * @return The number of attributes
	 */
	public int getAttributeCount() {
		return this.attributes.size();
	}

	/**
	 * Get the attribute based on key
	 * 
	 * @param key
	 *            The key field of the attribute
	 * @return The String type value
	 */
	public String getAttributValue(String key) {
		assert key != null : "The input key index cannot be null";
		return new String(this.attributes.get(key));
	}
}
