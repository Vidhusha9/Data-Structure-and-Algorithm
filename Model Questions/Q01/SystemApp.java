package Q01;
import java.util.Arrays;

public class SystemApp {
    public static void selectionSort(AiPoweredRecommendation[] prediction){
        int n = prediction.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (prediction[j].confidenceLevel > prediction[maxIndex].confidenceLevel) {
                    maxIndex = j;
                }
            }
            AiPoweredRecommendation temp = prediction[maxIndex];
            prediction[maxIndex] = prediction[i];
            prediction[i] = temp;
        }
    }

    public static void Display(AiPoweredRecommendation[] prediction){
        System.out.println("-----------------------------------------------------");
        System.out.println("Predection ID\t|\tItem Name\t|\tConfidence Level");
        System.out.println("-----------------------------------------------------");

        for (AiPoweredRecommendation p : prediction) {
            System.out.printf("\t%-11d |\t%-11s |\t\t%-15.2f\n", p.predictionId, p.itemName, p.confidenceLevel);
        }
        System.out.println("-----------------------------------------------------");
    }

    public static void main(String[] args) {
        AiPoweredRecommendation[] prediction = {
            new AiPoweredRecommendation(101,"Laptop", 0.85),
            new AiPoweredRecommendation(102,"Smart Phone", 0.92),
            new AiPoweredRecommendation(103,"HeadPhone", 0.78),
            new AiPoweredRecommendation(104,"Smart Watch", 0.95),
            new AiPoweredRecommendation(105,"Tablet", 0.88)
        };

        System.out.println("Before Sorting:");
        Display(prediction);

        System.out.println();
        System.out.println();
        System.out.println();

        selectionSort(prediction);

        System.out.println("After Sorting:");
        Display(prediction);

    }
}
