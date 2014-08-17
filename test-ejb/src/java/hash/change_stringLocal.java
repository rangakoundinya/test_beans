/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hash;

import javax.ejb.Local;

/**
 *
 * @author ranga
 */
@Local
public interface change_stringLocal {
    
    public String hashing(String str);
    
}
