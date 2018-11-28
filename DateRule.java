import java.util.Calendar;

/**
 * This class is used to contain the rules of date
 */

/**
 * @author Tang, Xintian
 *
 */
public enum DateRule {

	METHODS;

	/**
	 * This method is used to exam whether the input year fits the system rules
	 * 
	 * @param yyyy
	 *            The year to be judged
	 * @return Whether the year fits the wywtem rules
	 */
	public boolean SystemYearRule(int yyyy) {
		if (yyyy > 1900) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * This method is used to exam whether the input month fits the system rules
	 * 
	 * @param mm
	 *            The month to be judged
	 * @return Whether the month fits the system rules
	 */
	public boolean SystemMonthRule(int mm) {
		if (mm <= 12 && mm >= 1) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * This method is used to exam whether the input date information fits the rules
	 * 
	 * @param yyyy
	 *            The year to be judged
	 * @param mm
	 *            The month to be judged
	 * @param dd
	 *            The day to be judged
	 * @return Whether the date information is correct
	 */
	public boolean checkDate(int yyyy, int mm, int dd) {
		return this.SystemYearRule(yyyy) && this.SystemMonthRule(mm) && this.isDateLegal(yyyy, mm, dd);
	}

	/**
	 * This method is used to exam whether the input day fits the system rules based
	 * on year and month
	 * 
	 * @param yyyy
	 *            The year information
	 * @param mm
	 *            The month information
	 * @param dd
	 *            The day to be judged
	 * @return Whether the day fits the rules
	 */
	public boolean isDateLegal(int yyyy, int mm, int dd) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, yyyy);
		cal.set(Calendar.MONTH, mm - 1);
		int max_days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		if (dd >= 1 && dd <= max_days) {
			return true;
		} else {
			return false;
		}
	}

}
