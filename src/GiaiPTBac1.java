import java.util.Scanner;

public class GiaiPTBac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);
    System.out.print("Nhập hệ số bậc 1, a = ");
    float a = scan.nextFloat();
    System.out.print("Nhập hệ số tự do, b = ");
    float b = scan.nextFloat();
    GiaiPTBac1.GiaiPhuongTrinhBac1(a, b);
	}
    public static void GiaiPhuongTrinhBac1(float a, float b) {
    	// xét a 
    	if (a == 0) {
    		if (b == 0) {
    			System.out.println("Phương trình có vô số nghiệm");
    		}else {
    			System.out.println("Phương trình vô nghiệm");
    		}
    		
    	}
    	else {
    		System.out.println("Phương trình có nghiệm x = " + (- b / a));
    	}
    }
}
