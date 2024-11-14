public class DemoForLoopDaysAndHours {
    public static void main(String[] args) {
        for (int i = 1;i<=7;i++){
            for(int j=0;j<24;j++){
                if (j == 0) {
                    System.out.println("Day: " + i + " Hour: " + j);
                } else {
                    System.out.println("      "+ " Hour: " + j);
                }
            }
        }
    }
}
