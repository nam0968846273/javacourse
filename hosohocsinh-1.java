package class1;
import java.util.Scanner;

public class hosohocsinh {
	
	    private String lop;
	    private people people;
	     
	    public hosohocsinh() {
	        super();
	    }
	 
	    public hosohocsinh(String lop, people people) {
	        super();
	        this.lop = lop;
	        this.people = people;
	    }
	     
	    public String getLop() {
	        return lop;
	    }
	 
	    public void setLop(String lop) {
	        this.lop = lop;
	    }
	 
	    public people getPeople() {
	        return people;
	    }
	 
	    public void setPeople(people people) {
	        this.people = people;
	    }
	 
	    public void nhapThongTinHoSo() {
	        people = new people();
	        people.nhapThongTin();
	         
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập lớp: ");
	        lop = scanner.nextLine();
	    }
	     
	    public void hienThiThongTinHoSo() {
	        people.hienThiThongTin();
	        System.out.println("Lớp: " + lop);
	    }
	}
