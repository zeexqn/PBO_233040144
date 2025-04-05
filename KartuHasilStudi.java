package pertemuan6;

import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
	    private String semester;
	    private Double ips;
	    private List<MataKuliah> daftarMataKuliah;
	    
	    public KartuHasilStudi(String semester) {
	        this.semester = semester;
	        this.daftarMataKuliah = new ArrayList<>();
	    }

	    public void addMataKuliah(MataKuliah mataKuliah) {
	        daftarMataKuliah.add(mataKuliah);
	    }
	    
	    public String display() {
	        StringBuilder sb = new StringBuilder();
	        for (MataKuliah mk : daftarMataKuliah) {
	            sb.append(mk.display());
	            sb.append("\n");
	        }
	        return sb.toString();
	    }

	    public int getTotalSks() {
	        int totalSks = 0;
	        for (MataKuliah mk : daftarMataKuliah) {
	            totalSks += mk.getSks();
	        }
	        return totalSks;
	    }

	    public Double hitungIPS() {
	        double total = 0;
	        int totalSks = 0;
	        for (MataKuliah mk : daftarMataKuliah) {
	            total += mk.nilaiIndex() * mk.getSks();
	            totalSks += mk.getSks();
	        }
	        return total / totalSks;
	    }

	    public String getSemester() {
	        return semester;
	    }
	}

