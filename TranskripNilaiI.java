package pertemuan6;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TranskripNilai {

		private Date tglCetak1;


			private Date tglCetak;
			private double ipk;
			private List<KartuHasilStudi> kartuHasilStudi;
			private Mahasiswa mahasiswa;
			
			public void TranskipNilai(Mahasiswa mahasiswa) {
				super();
				this.mahasiswa = mahasiswa;
				
				kartuHasilStudi = new ArrayList<>();
				tglCetak1 = new Date();
			}
			
			public void hitungIPK() {
				double total = 0;
				int totalSks = 0;
				for (KartuHasilStudi khs : kartuHasilStudi) {
					total += khs.hitungIPS() * khs.getTotalSks();
					totalSks += khs.getTotalSks();
				}
				ipk = total / totalSks;
			}
			
			public void addKHS(KartuHasilStudi khs) {
				kartuHasilStudi.add(khs);
			}
			
			public void display() {
				System.out.println(mahasiswa.display());
				System.out.println("Tanggal Cetak: " + tglCetak1.toString());
			}
		}