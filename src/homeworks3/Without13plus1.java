package homeworks3;

public class Without13plus1 {

	public static void main(String[] args) {
		// Bir dizide bulunan 13 ve 13 ten sonra gelen sayıları eklemeden
		// toplam sonucu yazan program.
		
		int [] numbers = {1, 13, 13, 13, 2, 5, 13, 1};
		
		int toplam = 0;
		boolean flag = false;
		boolean durum = true;
		
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]!=13) {
				flag = true;
				if(flag && durum) {
					toplam += numbers[i];
				}
				else {
					durum = true;
				}
			}
			else {
				durum = false;
			}
		}

		System.out.println(toplam);
	}
}
