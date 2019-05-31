package java_util;

import java.util.Scanner;

public class SoSanhVoiSo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float number;
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Nhập vào số cần so sánh: ");
        number = scanner.nextFloat();
         
        if (number < 10) {
            System.out.println("Số bạn vừa nhập nh�? hơn 10");
        } else if (number == 10) {
            System.out.println("Số bạn vừa nhập bằng 10");
        } else {
            System.out.println("Số bạn vừa nhập lớn hơn 10");
        }
        scanner.close();

	}

}
