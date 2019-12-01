package com.pccalcul.servlets;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pccalcul.beans.Operations;

/**
 * Servlet implementation class Calcul
 */
@WebServlet("/Calcul")
public class Calcul extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calcul() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
	this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//récupérations des paramétres 
		String nmbr1 =request.getParameter("nombre1");
		String nmbr2 =request.getParameter("nombre2");
		 String operation = request.getParameter("operation");
	 
		 //convertir les nombre1 et nombre2 de null à 0
		 if (nmbr1==null || nmbr1.contentEquals("")) {
				nmbr1="0";
				}
			if (nmbr2==null || nmbr2.contentEquals("")) {
				nmbr2="0";
				}
			
			
			//signaler un eerreurs le cas ou l'utilisateur a saisi une lettre 
		/*	try {
				 
				Double.parseDouble(nmbr1);
			
			
		}catch(NumberFormatException e){
			
			
			throw new NumberFormatException("Erreurs de saisie ,veuillez entroduire un chiffre dans la première case.");
			 
		}
		
			
			try {
				 
				Double.parseDouble(nmbr2);
			
			
		}catch(NumberFormatException e){
			
			
			throw new NumberFormatException("Erreurs de saisie ,veuillez entroduire un chiffre dans la deuxième case.");
			 
		}*/
		
			//creation d'un objet operation 
			
		 Operations operationss =new Operations();
	
	operationss.setNombre1(nmbr1);
	operationss.setNombre2(nmbr2);
	operationss.setOperation(operation);
	operationss.calculer(nmbr1,nmbr2,operation);
	operationss.toString();
	//operationss.getMessage();
	
	
request.setAttribute("operationss",operationss);

this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request, response);

	}
	


}