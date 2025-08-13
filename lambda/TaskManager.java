package lambda;

import java.util.ArrayList;

public class TaskManager {
    private final ArrayList<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void printTasksByFilter(TaskFilter taskFilter) {
        for (Task task : tasks) {
            if (taskFilter.check(task)) {
                System.out.println(task.name);
            }
        }
    }

    public void deleteTasksByFilter(TaskFilter taskFilter) {
        tasks.removeIf(task -> taskFilter.check(task));
    }

    public void changeImportant(TaskFilter filter, int delta) {
        for (Task task : tasks) {
            if (filter.check(task)) {
                task.important += delta;
            }
        }
    }

    public void raiseImportant(TaskFilter filter, int amount) {
        changeImportant(filter, amount);
    }

    public void lessImportant(TaskFilter filter, int amount) {
        changeImportant(task -> !filter.check(task), -amount);
    }

}
