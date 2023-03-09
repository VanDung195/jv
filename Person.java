package Str;

public class Person {
	private String id;
	private String firstName;
	private String lastName;
	private String ngaySinh;
	private String noiSinh;
	private String gioitinh;
	private String quequan;
	public Person(String id, String firstName, String lastName, String ngaySinh, String noiSinh, String gioitinh,
			String quequan) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.ngaySinh = ngaySinh;
		this.noiSinh = noiSinh;
		this.gioitinh = gioitinh;
		this.quequan = quequan;
	}
	@Override
	public String toString() {
		return String.format("P[id: %s,FullName: %s %s,gioitinh: %c,Que Quan: %s, Noi sinh: %s,Ngay Sinh: %s",id,firstName,lastName,gioitinh,quequan,noiSinh,ngaySinh);
	}
	public static Person parse(String str) {
		String[] rs=str.split("\\|");
		char q = rs[5].charAt(0);
		String g = null;
		if(q=='0')
			g="Male";
		else if(q=='1')
			g="Female";
		Person p = new Person(rs[0],rs[1],rs[2],rs[3],rs[4],g,rs[6]);
		return p;
		
	}
}
