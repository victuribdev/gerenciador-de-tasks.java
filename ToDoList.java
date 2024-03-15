import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<Task> tasks;

    public ToDoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String description) {
        Task task = new Task(description);
        tasks.add(task);
        System.out.println("Tarefa adicionada com sucesso");
    }

    
    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Lista de tarefas vazia");
        } else {
            System.out.println("Lista de tarefas");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i).getDescription());
            }
        }
    }

    public void removeTasks(int index) {
        if (index >=1 && index <= tasks.size()) {
            tasks.remove(index - 1);
            System.out.println("Tarefa removidas com sucesso");
        } else {
            System.out.println("índice inválido.");
        }
    }
    public void clearTasks() {
        tasks.clear();
        System.out.println("Lista de tarefas limpas.");
    }    
}
