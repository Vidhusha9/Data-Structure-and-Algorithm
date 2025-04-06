package Q03;
import java.util.Scanner;
import java.util.Stack;

public class SystemApp {
    public static void bubbleSort(TaskSheduling[] tasks){
        int n = tasks.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - 1 - i; j++){
                if (tasks[j].priorityLevel > tasks[j+1].priorityLevel){
                    TaskSheduling temp = tasks[j];
                    tasks[j] = tasks[j+1];
                    tasks[j+1] = temp;
                }
            }
        }
    }



    public static void display(TaskSheduling[] tasks){
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Task ID \t|\t\t Task Name \t\t\t\t|\t Priority Level");
        System.out.println("-------------------------------------------------------------------");
        for (TaskSheduling t : tasks){
            System.out.printf("\t%-7d |\t%-12s \t|\t\t%-15d\n", t.taskId, t.taskName, t.priorityLevel);
        }
    }

    public static TaskSheduling[] popByTaskId(TaskSheduling[] tasks, int taskId) {
        Stack<TaskSheduling> tempStack = new Stack<>();

        for (TaskSheduling t : tasks) {
            if (t.taskId != taskId) {
                tempStack.push(t);
            }
        }

        TaskSheduling[] updated = new TaskSheduling[tempStack.size()];
        for (int i = tempStack.size() - 1; i >= 0; i--) {
            updated[i] = tempStack.pop();
        }

        return updated;
    }

    public static void main(String[] args) {
        Stack<TaskSheduling> stack = new Stack<>();

        // Pushing tasks (LIFO)
        stack.push(new TaskSheduling(101,"Assemble Robot Arm......", 2));
        stack.push(new TaskSheduling(102,"Test Robot Sensors......", 1));
        stack.push(new TaskSheduling(103,"Recharge Robot Components", 4));
        stack.push(new TaskSheduling(104,"Product Safety Check...", 3));
        stack.push(new TaskSheduling(105,"Install Robot Software...", 5));
        stack.push(new TaskSheduling(106,"Perform Final Inventory", 6));

        // Convert Stack to Array
        TaskSheduling[] tasks = new TaskSheduling[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            tasks[i] = stack.pop();
        }

        System.out.println("Before Sorting:");
        display(tasks);

        System.out.println("\n\n");

        bubbleSort(tasks);

        System.out.println("After Sorting:");
        display(tasks);

        // Pop by Task ID
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Task ID to remove: ");
        int taskIdToRemove = scanner.nextInt();

        tasks = popByTaskId(tasks, taskIdToRemove);

        System.out.println("\nAfter Removing Task ID " + taskIdToRemove + ":");
        display(tasks);
    }
}
