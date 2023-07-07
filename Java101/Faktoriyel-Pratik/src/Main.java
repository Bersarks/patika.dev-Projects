/*
Ödev
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
Java ile kombinasyon hesaplayan program yazınız.
Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)
 */
public class Main {
	public static void main(String[] args) {
		int n = 5;
		int r = 3;
		int nFaktoriyel = 1;
		int rFaktoriyel = 1;
		int nMinusRFaktoriyel = 1;
		int kombinasyon = 0;

		for (int i = 1; i <= n; i++) {
			nFaktoriyel *= i;
		}
		for (int i = 1; i <= r; i++) {
			rFaktoriyel *= i;
		}
		for (int i = 1; i <= (n - r); i++) {
			nMinusRFaktoriyel *= i;
		}
		kombinasyon = nFaktoriyel / (rFaktoriyel * nMinusRFaktoriyel);
		System.out.println("Kombinasyon: " + kombinasyon);
	}
}