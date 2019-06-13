/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author dess
 */
public class datevalidation {
     private Pattern pattern;
    private Matcher matcher;
    
    private static final String DATE_PATTERN=
            "^[_0-9._%+-]+/[0-9.-]+\\/[0-9]{2,6}$";
    public datevalidation(){
        pattern=Pattern.compile(DATE_PATTERN);
    }
    public boolean validate(final String hex)
    {
        matcher=pattern.matcher(hex);
        return matcher.matches();
    }
}
