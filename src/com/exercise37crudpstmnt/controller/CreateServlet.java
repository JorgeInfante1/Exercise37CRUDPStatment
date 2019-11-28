package com.exercise37crudpstmnt.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.exercise37crudpstmnt.model.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Servlet that allows me to create an Employee into mySQL database
 * 
 * @author jorge
 * @version 1.0
 */
@WebServlet("/CreateServlet")
public class CreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	/**
	 * Post Method that allows me to create the Employee
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html charset='utf-8'");
		PrintWriter output = response.getWriter();
		
		Employee myEmployee = new Employee();
//		myEmployee.setIdEmployee(Integer.parseInt(request.getParameter("txtIdEmployee")));
		myEmployee.setNameEmployee(request.getParameter("txtNameEmployee"));
		myEmployee.setAgeEmployee(Integer.parseInt(request.getParameter("txtAgeEmployee")));
		myEmployee.setAddressEmployee(request.getParameter("txtAddressEmployee"));
		myEmployee.setSalaryEmployee(Double.parseDouble(request.getParameter("txtSalaryEmployee")));
		myEmployee.setDepartmentEmployee(request.getParameter("txtDepartmentEmployee"));
		
		//1. Declare Variables
		//"jdbc:mysql://localhost:3306/tiendita?useSSL=false&serverTimezone=UTC";
			String urlServer = "jdbc:mysql://localhost:3306/tiendita?useSSL=false&serverTimezone=UTC";
			String userName = "root";
			String password = "root";
			int rowsAffected = 0;
			
			String sentenciaSQLPreparedStatement = "INSERT INTO Empleados(nombreEmpleado, edadEmpleado,domicilioEmpleado, "
					+ "salarioEmpleado, departamentoEmpleado) VALUES(?,?,?,?,?)";
					
			
		//2. Declare Objects
			Connection conn = null;
			PreparedStatement pstmnt = null;
			ResultSet sr = null;
			
		//3. 
			try
			{
				//3. Instanciamos the Drive
				Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
				
				//4. Abrimos la conexcion
					conn = DriverManager.getConnection(urlServer,userName,password);
					
				//5. Configuramos el prepared statement
					pstmnt = conn.prepareStatement(sentenciaSQLPreparedStatement);
					pstmnt.setString(1, myEmployee.getNameEmployee());
					pstmnt.setInt(2, myEmployee.getAgeEmployee());
					pstmnt.setString(3, myEmployee.getAddressEmployee());
					pstmnt.setDouble(4, myEmployee.getSalaryEmployee());
					pstmnt.setString(5, myEmployee.getDepartmentEmployee());
					
				//6. 
					rowsAffected = pstmnt.executeUpdate();
					if(rowsAffected>0)
					{
						output.append("Registro agregado con exito");
					}
					else
					{
						output.append("Registro no agregado");
					}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
				try
				{
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		
		output.close();
	}

}
