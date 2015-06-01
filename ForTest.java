public class ForTest {

	public static void main(String[] args) {
    int result = 1;
    for (int k = 16; k>0; k--){
        result = result * 2;
        System.out.println("2^"+(16 - k + 1)+"="+result);
}
	}
}
