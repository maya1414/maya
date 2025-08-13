package lambda;

public class Task {

    public String name;
    public Boolean isDone;
    public int important;

    public Task(String name,Boolean isDone, int important){
        this.important = important;
        this.isDone = isDone;
        this.name = name;
    }

    public void updateIsDone(Boolean isDone){
        this.isDone = isDone;
    }

    public void updateImportant(int important){
        this.important = important;
    }

}
