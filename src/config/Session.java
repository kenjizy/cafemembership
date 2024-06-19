
package config;


public class Session {
    private static Session instance;
    private int ID;
    private String name;
    private String username;
    private String email;
    private String password;
    private String type;
    private String status;
    
    
    private Session(){
    //Private cons. prevents instance
    }

    public static synchronized Session getInstance() {
        if(instance == null){
            instance = new Session();
        }
        
        return instance;
    }

    public static boolean isInstanceEmpty() {
        return instance == null;
    }

    public int getId() {
        return ID;
    }

    public void setId(int ID) {
        this.ID = ID;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
       public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

    public String gettype() {
        return type;
    }

    public void settype(String acctype) {
        this.type = acctype;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}





