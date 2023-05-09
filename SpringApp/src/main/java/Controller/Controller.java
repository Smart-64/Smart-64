package Controller;

import mySpringApp.ru.PaymentRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@org.springframework.stereotype.Controller
public class Controller extends HttpServlet {

    @GetMapping("/Egor")
    public String getNameAndAge() {
        PaymentRequest egor = new PaymentRequest("Egor", 15);
        

        return "Egor";

    }

    @PostMapping("loginServlet")
    public void postNameAndAge(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));

        PrintWriter writer = response.getWriter();

        String htmlRespone = "<html>";
        htmlRespone += "<h2>Your name is: " + name + "</h2>";
        htmlRespone += "<h2>Your age is: " + age + "</h2>";
        htmlRespone += "</html>";

        writer.println(htmlRespone);
    }
}
