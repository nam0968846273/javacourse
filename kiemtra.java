package class1;
import java.util.ArrayList;
import java.util.Scanner;
 
public class kiemtra {
 
    public static void main(String[] args) {
        ArrayList<hosohocsinh> arrHoSo = new ArrayList<>();
        int n;
        hosohocsinh hoSoHocSinh;
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Nhập số học sinh: ");
        n = scanner.nextInt();
         
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin học sinh thứ " + (i + 1) + ": ");
            hoSoHocSinh = new hosohocsinh();
            hoSoHocSinh.nhapThongTinHoSo();
            arrHoSo.add(hoSoHocSinh);
        }
         
        for (int i = 0; i < arrHoSo.size(); i++) {
            System.out.println("\nThông tin học sinh thứ " + (i+1) + ": ");
            arrHoSo.get(i).hienThiThongTinHoSo();
        }
         
        System.out.println("\nNhững Học Sinh có quê ở Hà Tĩnh là: ");

        for (int i = 0; i < arrHoSo.size(); i++) {
            if (arrHoSo.get(i).getPeople().getQueQuan().equalsIgnoreCase("Hà Tĩnh")) {
                arrHoSo.get(i).hienThiThongTinHoSo();
            }
        }
         
        System.out.println("\nNhững học sinh học lớp 10A là: ");
        for (int i = 0; i < arrHoSo.size(); i++) {
            if (arrHoSo.get(i).getLop().equalsIgnoreCase("10A")) {
                arrHoSo.get(i).hienThiThongTinHoSo();
            }
        }
    }
 
}