package class1;
import java.util.Scanner;

public class sinhvien {
	 private String name;
	    private int numberOfPupils;
	     
	    public void inputYourClass() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("nhap ten lop: ");
	        name = scanner.nextLine();
	        System.out.println("nhap so sinh vien cua lop: ");
	        numberOfPupils = scanner.nextInt();
	    }
	     
	    public void showInformation() {
	        System.out.println("ten lop la " + name + ", so sinh vien =  " + numberOfPupils + ".");
	    }

}
