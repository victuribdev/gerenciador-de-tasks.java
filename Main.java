import java.util.Scanner;

public class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();

        
        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Visualizar Tarefas");
            System.out.println("3. Remover Tarefa");
            System.out.println("4. Limpar Lista de Tarefas");
            System.out.println("5. Sair");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Para consumir a quebra de linha

            switch (choice) {
                case 1:
                    System.out.println("Digite a tarefa: ");
                    String taskDescription = scanner.nextLine();
                    toDoList.addTask(taskDescription);
                    break;
                case 2:
                    toDoList.viewTasks();
                    break;
                case 3:
                    System.out.println("Digite o índice da tarfea a ser removida: ");
                    int index = scanner.nextInt();
                    toDoList.removeTasks(index);
                    break;
                case 4:
                    toDoList.clearTasks();
                    break;
                case 5:
                    System.out.println("Saindo..");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente."); 
                    break;
            }
        }
    }
} 