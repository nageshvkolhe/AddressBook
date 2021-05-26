package AddressBook;

       class AddBook1 {
        
	    private String firstname;
	    private String lastname;
	    private String address;
	    private String city;
	    private String state;
	    private String zip;
	    private String phonenumber;
	    private String email;
public AddBook1(String firstname, String lastname, String address, String city, String state, String zip, String phonenumber, String email) {

	        super();
	        this.firstname = firstname;
	        this.lastname = lastname;
	        this.address = address;
	        this.city = city;
	        this.state = state;
	        this.zip = zip;
	        this.phonenumber = phonenumber;
	        this.email = email;
	       }

	       public String getFirstName(){
	           return firstname;

	       }
	       public void setFirstName(String firstname){
	            this.firstname = firstname;
	       }
	       public String getLastName(){
	           return lastname;

	       }
	       public void setLastName(String lastname){
	            this.lastname = lastname;
	       }
	       public String getAddress(){
	           return address;

	       }
	       public void setAddress(String address){
	            this.address = address;
	       }    
	       public String getCity(){
	           return city;

	       }
	       public void setCity(String city){
	            this.city = city;
	       }
	       public String getState(){
	           return state;

	       }
	       public void setState(String state){
	            this.state = state;
	       }
	       public String getZIP(){
	            return zip;

	       }
	       public void setZIP(String zip){
	             this.zip = zip;
	       }
	       public String getPhoneNumber(){
	             return phonenumber;

	       }
	       public void setPhoneNumber(String phonenumber){
	              this.phonenumber = phonenumber;
	       }
	       public String getEmail(){
	              return email;

	       }
	       public void setEmail(String email){
	               this.email = email;
	       }
	       @Override
	       public String toString() {
                      return "AddBook1 [fisrtname=" + firstname + " , lastName=" + lastname + ", address=" + address + ", city="
	       		+ city + ", state=" + state + ", zip=" + zip + ", phonenumber=" + phonenumber +
	       		", email=" + email +"]";
	      }
	}
     		
