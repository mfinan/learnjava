public class WhileTest {

	public static void main(String[] args) {
    int k = 16;
    int result = 1;
    while (k > 0){
      result = result * 2;
      System.out.println("2^"+(16 - k + 1)+"="+result);
      k--;
}
	}
}
