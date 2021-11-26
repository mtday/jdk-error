package test;

import jakarta.ws.rs.core.Application;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.Response;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class GetAllTodoListsResourceIT extends JerseyTest {
    @Override
    protected Application configure() {
        return new App();
    }

    @Test
    public void test() {
        List<TodoList> lists = Arrays.asList(
                new TodoList().setId("id1").setName("Name 1"),
                new TodoList().setId("id2").setName("Name 2")
        );

        Response response = target("/lists").request().get();

        // This line FAILS to compile with a NullPointerException:
        Assertions.assertEquals(lists, response.readEntity(new GenericType<>() {}));

        // This line compiles just fine:
        Assertions.assertEquals(lists, response.readEntity(new GenericType<List<TodoList>>() {}));

        // This line also compiles just fine:
        List<TodoList> results = response.readEntity(new GenericType<>() {});
        Assertions.assertEquals(lists, results);
    }
}
