package test;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

import static java.util.Arrays.asList;

@Path("/lists")
public class GetAllTodoListsResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<TodoList> getAllTodoLists() {
        return asList(
                new TodoList().setId("id1").setName("Name 1"),
                new TodoList().setId("id2").setName("Name 2")
        );
    }
}
