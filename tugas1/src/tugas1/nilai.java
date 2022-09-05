package tugas1;
import java.util.*;

public class nilai {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nilai Tugas : ");
		int nTugas = input.nextInt();
		System.out.print("Nilai UTS : ");
		int nUTS = input.nextInt();
		System.out.print("Nilai UAS : ");
		int nUAS = input.nextInt();
		
		double nAkhir = (nTugas*0.20)+(nUTS*0.35)+ (nUAS*0.45);
		
		System.out.print("Nilai Akhir : ");
		System.out.println(nAkhir);
		System.out.print("Grade : ");
		
		if (nAkhir >= 85) {
			System.out.println("A");
		}else if (nAkhir >= 75 && nAkhir < 85) {
			System.out.println("B");
		}else if (nAkhir >= 65 && nAkhir < 75) {
			System.out.print("C");
		}else if (nAkhir >= 50 && nAkhir < 65) {
			System.out.println("D");
		}else {
			System.out.println("E");
		}
	}
}
