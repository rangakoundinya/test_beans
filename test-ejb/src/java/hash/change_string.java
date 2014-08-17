/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hash;

import java.math.*;
import java.security.*;
import javax.ejb.Stateless;

/**
 *
 * @author ranga
 */
@Stateless
public class change_string implements change_stringLocal {
    public String hashing(String str){
        
        try {
        
        String salt = "Tommy Lee Jones would have won Soccer world cup";
        str = str+salt;
        MessageDigest m = MessageDigest.getInstance("MD5");
        
        m.update(str.getBytes(), 0, str.length());
        BigInteger i = new BigInteger(1,m.digest());
        //return ("tested");
        return String.format("%1$032x", i);         
    } catch (NoSuchAlgorithmException e) {
        e.printStackTrace();
                return("error");
    }
   }
}
