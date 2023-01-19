public class Quiz { 
  
    private int id;
    private int maxScore;
    private int totalScore; 
    private Student student; 
    private double grade;
  
    public Quiz (int id, int maxScore, int totalScore, Student student) { 
        this.id = id;  
        this.maxScore = maxScore; 
        this.totalScore = totalScore;
        this.student = student; 
    } 
  
    public int getId(){ 
        return id; 
    } 
  
    public void setId(int id){ 
        this.id = id; 
    } 
  
    public int getMaxScore(){ 
        return maxScore; 
    } 
  
    public void setMaxScore(int maxScore){ 
        this.maxScore = maxScore; 
    } 
  
    public int getTotalScore(){ 
        return totalScore; 
    } 
  
    public void setTotalScore(int totalScore){ 
        this.totalScore = totalScore; 
    } 
  
    public double grade() { 
        this.grade = totalScore * 100 / maxScore;
        return grade; 
    } 
     
}