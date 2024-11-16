public class DemoForLoopDaysAndHours {
    public static void main(String[] args) {
        for (int i = 1;i<=5;i++){
            for(int j=9;j<19;j++){
                if (j == 9) {
                    System.out.println("Day: " + i + " Hour: " + j);
                } else {
                    System.out.println("      "+ " Hour: " + j);
                }
            }
        }
    }
}
