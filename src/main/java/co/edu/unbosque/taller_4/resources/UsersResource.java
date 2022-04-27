package co.edu.unbosque.taller_4.resources;

import javax.swing.*;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import co.edu.unbosque.taller_4.DTO.User;
import co.edu.unbosque.taller_4.services.UserService;
import jakarta.ws.rs.core.Response;

import java.io.IOException;
import java.util.List;

@Path("/Usuarios")
public class UsersResource {
    @GET
    @Produces("application/json")

    public Response getAll() throws IOException {

        List<User> users = new UserService().getUsers();

        return Response.ok().entity(users).build();
    }

}
