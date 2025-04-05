package pertemuan6;

public class MataKuliah {

	    private String kode;
	    private String nama;
	    private String index;
	    private int sks;
	    private String dosenPengampu;

	    // Konstruktor
	    public MataKuliah(String kode, String nama, String index, int sks, String dosenPengampu) {
	        this.kode = kode;
	        this.nama = nama;
	        this.index = index;
	        this.sks = sks;
	        this.dosenPengampu = dosenPengampu;
	    }

	    public double nilaiIndex() {
	        switch (index) {
	            case "A": return 4.0;
	            case "AB": return 3.5;            
	            case "B": return 3.0;
	            case "BC": return 2.5; 
	            case "C": return 2.0;
	            case "D": return 1.0;  
	            case "E": return 0.0;
	            default: return 0.0;
	        }
	    }

	    public String display() {
	        return kode + " - " + nama + " - " + index + " - Dosen: " + dosenPengampu;
	    }

	    public int getSks() {
	        return sks;
	    }
	}

