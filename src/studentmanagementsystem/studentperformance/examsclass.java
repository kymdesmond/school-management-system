package studentmanagementsystem.studentperformance;
import java.io.Serializable;
import java.sql.Connection;

/**
 *
 * @author dess
 */
public class examsclass implements Serializable{
    private String registration_id;
    private String cat1;
    private String cat2;
    private String exam;
    private String total;
    private String grade;
    Connection con=null;
    public examsclass()
    {}
    public examsclass(String Registration_id, String Cat1, String Cat2, String Exam, String Total, String Grade){
        this.registration_id=Registration_id;
        this.cat1=Cat1;
        this.cat2=Cat2;
        this.exam=Exam;
        this.total=Total;
        this.grade=Grade;
    }
public String getid()
{
    return registration_id;
}
public String getcat1()
{
    return cat1;
}
public String getcat2()
{
    return cat2;
}
public String getexam()
{
    return exam;
}
public String gettotal()
{
    return total;
}
public String getgrade()
{
    return grade;
}
}
