package todoList;

import java.util.Date;

public class TodoList {
    private long id;
    private String content;
    private Date createdTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public TodoList(){}

    public TodoList(long id, String content, Date createdTime) {
        this.id = id;
        this.content = content;
        this.createdTime = createdTime;
    }
}
