
package studentmanagementsystem.studentregistration;
import java.io.Serializable;
import java.sql.Connection;

public class registeredstudents implements Serializable {
    private String student_id;
    private String student_name;
    private String dob;
    private String doa;
    private String contact_address;
    private String gender;
    private String parent_name;
    Connection con=null;
    
    public registeredstudents()
    {
        
    }
    public registeredstudents(String Student_id,String Student_name, String Dob, 
            String Doa, String Contact_address, String Gender,String Parent_name)
{
this.student_id=Student_id;
this.student_name=Student_name;
this.dob=Dob;
this.doa=Doa;
this.contact_address=Contact_address;
this.gender=Gender;
this.parent_name=Parent_name;
}
public String getid()
{
    return student_id;
}
public String getname()
{
    return student_name;
}
public String getdob()
{
    return dob;
}
public String getdoa()
{
    return doa;
}
public String getcontact()
{
    return contact_address;
}
public String getgender()
{
    return gender;
}
public String getparent()
{
    return parent_name;
}
}
