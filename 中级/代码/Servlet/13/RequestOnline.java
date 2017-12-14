package servletdemo;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns={"/statistic"})
public class RequestOnline extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<ResInfo> reqList = new ArrayList<ResInfo>();
		BaseDao dao = new BaseDao("com.mysql.jdbc.Driver", "jdbc:mysql://127.0.0.1:3306/test", "root", "123456");
		try {
			ResultSet rs = dao.query("select * from online_inf");
			while(rs.next()){
				ResInfo resInfo = new ResInfo(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getLong(5));
				reqList.add(resInfo);
			}
			req.getServletContext().setAttribute("reqList", reqList);
			req.getRequestDispatcher("/online2.jsp").forward(req, resp);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
