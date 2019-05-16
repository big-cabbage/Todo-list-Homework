package todoList;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Database {
    private static Map<Long, TodoList> map = new HashMap<>();
    public static int addTodoList(TodoList todoList)
    {
        if(todoList != null && todoList.getId() >= 0 && !map.containsKey(todoList.getId()))
        {
            map.put(todoList.getId(), todoList);
            return 1;
        }
        return 0;
    }

    public static int deleteTodoList(long id)
    {
        if(id >= 0 && map.containsKey(id))
        {
            map.remove(id);
            return 1;
        }
        return 0;
    }

    public static List<TodoList> queryAllTodoList()
    {
        List<TodoList> list = null;
        if(!map.isEmpty())
        {
            list = new ArrayList<>();
            for (long key : map.keySet())
            {
                list.add(map.get(key));
            }
        }
        return list;
    }

    public static TodoList queryTodoListById(long id)
    {
        TodoList todoList = null;
        if(map.containsKey(id))
        {
            todoList = map.get(id);
        }
        return todoList;
    }
}
