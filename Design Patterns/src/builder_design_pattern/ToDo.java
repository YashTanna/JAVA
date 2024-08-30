package builder_design_pattern;

public class ToDo{

    private long id;
    private String title;
    private String discription;
    private String status;
    private boolean completed;
    public ToDo(long id) {
        this.id = id;
    }

    public ToDo(long id, String title, String discription, String status, boolean completed) {
        this.id = id;
        this.title = title;
        this.discription = discription;
        this.status = status;
        this.completed = completed;
    }


    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDiscription() {
        return discription;
    }

    public String getStatus() {
        return status;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return String.format("{ToDo:%d,\n\t{title:%s},\n\t{description:%s},\n\t{status:%s},\n\t{completed:%b}\n}",id,title,discription,status,completed);
    }
}
