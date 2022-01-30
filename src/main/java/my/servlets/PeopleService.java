package my.servlets;

import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "people", urlPatterns = {"/api/people"})
public class PeopleService extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Persona> people = new ArrayList<>();
        people.add( new Persona("Yuri","Andrienko", 12345.0));
        people.add( new Persona("Vasya","Pupkin", 77777.0));
        people.add( new Persona("Masha","Mashkina", 22222.0));
        Gson gson = new Gson();
        String people_serialized = gson.toJson(people);
        resp.getWriter().print(people_serialized);
    }
}
