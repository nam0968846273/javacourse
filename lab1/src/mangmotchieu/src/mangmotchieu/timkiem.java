package mangmotchieu;
import java.util.Scanner;
class timkiem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, max = 100, i;
	    int[] A = new int[max];
	    Scanner scanner = new Scanner(System.in);
	         
	    do {
	        System.out.println("Nhập số phần tử của mảng: ");
	        n = scanner.nextInt();
	    } while (n <= 0 || n > max - 1);
	         
	    System.out.println("Nhập giá trị cho các phần tử của mảng: ");
	    for (i = 0; i < n; i++) {
	        System.out.print("A[" + i + "] = ");
	        A[i] = scanner.nextInt();
	    }
	         
	    System.out.println("Nhập số nguyên k cần tìm: ");
	    int k = scanner.nextInt();
	         
	    i = 0;
	    while ((i < n) && (A[i] != k)) {
	        i++;
	    }
	    if (i > n-1) {
	        System.out.println("Trong mảng không có phần tử nào chứa giá trị cần tìm.");
	    } else {
	        System.out.println("Phần tử đầu tiên có giá trị bằng " + k + " tại vị trí = " + i);
	    }

	}

}
