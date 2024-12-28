public class DemoBufferString {
  public static void main(String[] args) {
   StringBuffer sb = new StringBuffer();
   sb.append("Abdulrahman Al Shagawi");
   System.out.println(sb);
   System.out.println(sb.length());
   sb.insert(11, " Nasser");
   System.out.println(sb);
  }
}
