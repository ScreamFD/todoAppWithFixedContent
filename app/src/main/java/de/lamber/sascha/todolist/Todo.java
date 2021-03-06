package de.lamber.sascha.todolist;

/**
 * Created by Sascha on 05.01.2016.
 */
public class Todo {

    private int id;
    private String title;
    private boolean isDone;

    public Todo(String title){
        id = (int)(Math.random() * 500000) + 1;
        this.title = title;

        this.isDone = false;
        if (this.getId() % 2 == 0){
            this.isDone = true;

        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
