package com.nt.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nt.StudentBO.StudentBo;


@Component(value = "studentdao")
public  final class  StudentDAO_Impl implements StudentDAO {
	@Autowired
	@Qualifier("drds")
    private DataSource ds=null;
    public static final String STUDENT_INSERT_QUERY="INSERT INTO SPRING_STUDENT VALUES(SNO_SEQ1.NEXTVAL,?,?,?,?,?)";

	@Override
	public int insert(StudentBo bo)throws Exception{
	 Connection con=null;
	 PreparedStatement ps=null;
	 int count =0;
//Getting polled jdbc Connetion 
	 con=ds.getConnection();
//Ceate preparedStatement object
	 ps=con.prepareStatement(STUDENT_INSERT_QUERY);
//setting values to query param
	 ps.setString(1,bo.getStudentName());
	 ps.setString(2,bo.getStudentAdds());
	 ps.setFloat(3,bo.getTotalMark());
	 ps.setFloat(4,bo.getAvgMark());
	 ps.setString(5,bo.getResult());
	 //execute the sql Query
	 count =ps.executeUpdate();
	 //Closing the Connection
	 con.close();
	 ps.close();
		return count;	
	}
 
}
