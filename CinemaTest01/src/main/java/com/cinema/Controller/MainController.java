package com.cinema.Controller;

import javax.servlet.http.HttpServlet;

import org.springframework.stereotype.Controller;

import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class MainController
 */

@Controller
@WebServlet(urlPatterns = "*.do")
public class MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public MainController() {
       
    }

}
