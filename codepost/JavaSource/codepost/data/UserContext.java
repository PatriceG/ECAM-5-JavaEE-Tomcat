package codepost.data;

/**
 * Contexte Utilisateur, stocké dans la session HTTP
 * @author  pat
 * @version 
 */
public class UserContext {

    String userName;
    
    public UserContext() {
    }

    public void setUserName(String name) {
        userName = name;
    }
    
    public String getUserName() {
        return userName;
    }
    
}
