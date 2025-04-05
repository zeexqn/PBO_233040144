package pertemuan6;

public class Mahasiswa {
		private String NRP;
		private String Nama;
		
		public Mahasiswa(String nrp, String nama) {
			NRP = nrp;
			Nama = nama;
		}
		
		public String display() {
			return "NRP: " + NRP + ", Nama: " + Nama;
		}
		
//		Setter and Getter
		public String getNRP() {
			return NRP;
		}

		public void setNRP(String nrp) {
			NRP = nrp;
		}

		public String getNama() {
			return Nama;
		}

		public void setNama(String nama) {
			Nama = nama;
		}
}

