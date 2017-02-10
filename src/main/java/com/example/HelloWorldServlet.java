package com.example;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet(urlPatterns = "/index.do")
public class HelloWorldServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //resp.getOutputStream().write("Hello World.".getBytes());
        req.getRequestDispatcher("/index.html").forward(req, resp);
    }
}

//public class HelloWorldServlet {
//
//}

