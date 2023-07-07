/*Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int distance, age, tripType;
		double pricePerKm = 0.10, totalPrice, discount = 0, discountedPrice;
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter the distance: ");
		distance = scn.nextInt();
		System.out.println("Enter your age: ");
		age = scn.nextInt();
		System.out.println("Enter your trip type (1 for one way, 2 for round trip): ");
		tripType = scn.nextInt();
		if (distance <= 0 || age < 0 || (tripType < 1 || tripType > 2)){
			System.out.println("Invalid data");
		} else {
			totalPrice = distance * pricePerKm;
			if (age < 12) {
				discount = 0.5;
			} else if (age >= 12 && age <= 24) {
				discount = 0.1;
			} else if (age > 65) {
				discount = 0.3;
			}
			discountedPrice = totalPrice - (totalPrice * discount);
			if (tripType == 2) {
				discount = 0.2;
				totalPrice = discountedPrice - (discountedPrice * discount);
				System.out.println("Total price: " + (totalPrice * 2));
			}
			else {
				System.out.println("Discounted price: " + discountedPrice);
			}
		}

	}
}