package todoList;

import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api")
public class TodoListController {
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/tasks")
    public List<TodoList> getAllTodoList()
    {
        return Database.queryAllTodoList();
    }

    @PostMapping("/tasks")
    public int addTodoList(@RequestParam(value = "content")String content)
    {
        TodoList todoList = new TodoList();
        todoList.setId(counter.incrementAndGet());
        todoList.setContent(content);
        todoList.setCreatedTime(new Date());
        return Database.addTodoList(todoList);
    }

    @GetMapping("/tasks/{id}")
    public TodoList getTodoListById(@PathVariable long id)
    {
        return Database.queryTodoListById(id);
    }

    @DeleteMapping("/tasks/{id}")
    public int deleteTodoListById(@PathVariable long id)
    {
        return Database.deleteTodoList(id);
    }
}
