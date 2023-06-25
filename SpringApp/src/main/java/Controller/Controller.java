package Controller;

import Units.PaymentRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@org.springframework.stereotype.Controller
public class Controller extends HttpServlet {

    @GetMapping("/Egor")// URI (Uniform Resources Identifier)
    public String getNameAndAge() {
        PaymentRequest egor = new PaymentRequest("Egor", 15);

        return "index"; // return templates.html from package /resources/templates

    }

    @PostMapping("NameAndAge")
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
