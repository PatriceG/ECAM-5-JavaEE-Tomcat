/*
 * UserContext.java
 *
 * Created on 9 d�cembre 2001, 21:35
 */
 
package codepost.data;

/**
 *
 * @author  loik
 * @version 
 */
public class UserContext {

    String userName;
    
    /** Creates new UserContext */
    public UserContext() {
    }

    public void setUserName(String name) {
        userName = name;
    }
    
    public String getUserName() {
        return userName;
    }
    
}
