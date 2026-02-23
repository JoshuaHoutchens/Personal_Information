/*
 * BEGIN
    SET firstName = "Joshua"
    SET lastName = "Houtchens"
    SET streetAddress = "0101 Programmer Parkway"
    SET city = "Javatown"
    SET zipCode = "10101"
    
    PRINT "First Name: " + firstName
    PRINT "Last Name: " + lastName
    PRINT "Street Address: " + streetAddress
    PRINT "City: " + city
    PRINT "Zip Code: " + zipCode
   END * 
*/
public class PersonInfo{
	public static void main(String[] args) {
		String firstName = "Joshua";
		String lastName = "Houtchens";
		String streetAddress = "0101 Programmer Parkway";
		String city = "Javatown";
		String zipCode = "10101";
		
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(streetAddress);
		System.out.println(city);
		System.out.println(zipCode);
	}
}