/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class db_interactor 
{
    private Statement st;
    public db_interactor ()
    {
        try
        {
            Class.forName("jdbc:derby://localhost:1527/sample [app on APP]");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample");
            st= con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE,ResultSet.HOLD_CURSORS_OVER_COMMIT);
        }
        catch (Exception ex)
        {
        }
    }
    protected String selectsmt(String str)
    {
        String r = null;
        try {
           r= st.executeQuery(str).getString(1);
        } catch (SQLException ex) {
            Logger.getLogger(db_interactor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }
    protected int dmlsmt(String str)
    {
        int r = 0;
        try {
            r= st.executeUpdate(str);
        } catch (SQLException ex) {
            Logger.getLogger(db_interactor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;

    }
    public String time(String st)
    {

	   DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	   Date date = new Date();
           String a=(dateFormat.format(date))+"   ";
           String d="",t="";
           if(st.equals("h"))
           {
               d=(a.substring(0,10));
               t="\n"+(a.substring(10,a.length()-3));
           }
           else
               d=(a.substring(0,4)+a.substring(5,7)+a.substring(8,10)+a.substring(11,13)+a.substring(14,16)+a.substring(17));

           return d+t;
  }
    public String timeop(String a)
    {
              return(a.substring(0,4)+"/"+a.substring(4,6)+"/"+a.substring(6,8)+"  "+a.substring(8,10)+":"+a.substring(10,12)+":"+a.substring(12));
    }

}
