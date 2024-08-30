package builder_design_pattern;

public class ToDoBuilder {

    private long id;
    private String title = "ToDo Title";
    private String discription = "ToDo Discription";
    private String status = "ToDo Status";
    private boolean completed = false;

    ToDoBuilder withId(long id){
        this.id = id;
        return this;
    }

    ToDoBuilder title(String title){
        this.title = title;
        return this;
    }

    ToDoBuilder discription(String discription){
        this.discription = discription;
        return this;
    }
    ToDoBuilder status(String status){
        this.status = status;
        return this;
    }

    ToDoBuilder completed(boolean completed){
        this.completed = completed;
        return this;
    }

    ToDo build(){
        return new ToDo(id,title,discription,status,completed);
    }

}
