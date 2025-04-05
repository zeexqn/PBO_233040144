package pertemuan6;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TranskripNilai {

	    private Date tglCetak;
	    private double ipk;
	    private List<KartuHasilStudi> kartuHasilStudi;
	    private Mahasiswa mahasiswa;

	    public TranskripNilai(Mahasiswa mahasiswa) {
	        this.mahasiswa = mahasiswa;
	        kartuHasilStudi = new ArrayList<>();
	        tglCetak = new Date();
	    }

	    public void hitungIPK() {
	        double total = 0;
	        int totalSks = 0;
	        for (KartuHasilStudi khs : kartuHasilStudi) {
	            total += khs.hitungIPS() * khs.getTotalSks();
	            totalSks += khs.getTotalSks();
	        }
	        ipk = totalSks > 0 ? total / totalSks : 0;
	    }

	    public void addKHS(KartuHasilStudi khs) {
	        kartuHasilStudi.add(khs);
	    }

	    public void display() {
	        System.out.println(mahasiswa.display());
	        System.out.println("Tanggal Cetak: " + tglCetak.toString());
	        ipk = Math.round(ipk * 100.0) / 100.0;
	        System.out.println("IPK: " + ipk);
	        for (KartuHasilStudi khs : kartuHasilStudi) {
	            System.out.println("Semester: " + khs.getSemester());
	            System.out.println(khs.display());
	        }
	    }
	}

