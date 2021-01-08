package Jan08;

public class Tv implements Device {

	@Override
	public void on() {
		System.out.println("TV가 켜졌습니다.");
	}

	@Override
	public void off() {
		System.out.println("TV가 꺼졌습니다.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
