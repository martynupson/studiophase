package studiophase

class Customer {
	
	String title
	String firstName
	String lastName
	String address1
	String address2
	String address3
	String city
	String county
	String postCode
	String country
	String phone
	String fax
	String email
	String recommendedBy
	String companyCode 
	def dateCreated
	def lastUpdated
	 
    static constraints = {
		firstName blank: false, nullable: false
		lastName blank: false, nullable: false
		address1 blank: false, nullable: false
		city blank: false, nullable: false
		county blank: false, nullable: false
		postCode blank: false, nullable: false
		email (email: true)
		recommendedBy (inList: ["Yellow Pages", "Phone Book", "Engineer", "County Press", "Other"])
    }
}
