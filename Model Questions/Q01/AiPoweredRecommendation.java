package Q01;

public class AiPoweredRecommendation {
    public int predictionId;
    public String itemName;
    public double confidenceLevel;

    public AiPoweredRecommendation(int predictionId, String itemName, double confidenceLevel){
        this.predictionId = predictionId;
        this.itemName = itemName;
        this.confidenceLevel = confidenceLevel;
    }
}
