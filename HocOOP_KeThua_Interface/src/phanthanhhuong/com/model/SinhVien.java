package phanthanhhuong.com.model;

public class SinhVien implements ILamViec, IGiaiTri{

	@Override
	public void complexity() {
		System.out.println("Công việc phức tạp");
	}

	@Override
	public void difficulty() {
		System.out.println("Công việc khó");
	}

	@Override
	public void hatHo() {
		System.out.println("Giải trí hát hò");
	}
	
}
