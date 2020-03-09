
public class User {
	//protected KeyStorage key_storage = null;

	/*
	 * Alias del cliente
	 */
	String user = null;

	/*
	 * Contraseña del cliente
	 */
	String password = null;

	public User(String usuario, String pass) {
		this.user = usuario;
		this.password = pass;
	}
	
	 public void setUser(String user){
         this.user=user;
     }
	 
     public void setPassword(String pass){
         this.password=pass;
     }
     
     public String getUser() {
    	 return user;
     }
     
     public String getPassword() {
    	 return password;
     }

     //public void
}
