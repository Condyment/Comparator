import java.util.Comparator;

public class Angajat implements Comparable {
	private String nume;
	private String prenume;
	private int varsta;

	public Angajat(String nume, String prenume, int varsta) {
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;

	}

	public String getnume() {
		return nume;
	}

	public String getprenume() {
		return prenume;
	}

	public int getvarsta() {
		return varsta;
	}

	@Override
	public int compareTo(Object arg0) {
		Angajat decomparat = (Angajat) arg0;
		int deptComp = nume.compareTo(decomparat.getnume());

		if ((nume.compareTo(decomparat.getnume())) == (prenume.compareTo(decomparat.getprenume()))) {
			if (varsta < decomparat.getvarsta()) {
				System.out.println("wow");
				return -1;
			} else {
				return 1;
			}
		}
		return ((deptComp == 0) ? prenume.compareTo(decomparat.getprenume()) : deptComp);

	}

	@Override
	public String toString() {
		return "Nume: " + this.nume + "  Prenume: " + this.prenume + " " + "Salariu: " + this.varsta;
	}

	@Override
	public int hashCode() {
		return 43 * prenume.hashCode() + nume.hashCode() + varsta;
	}

	public boolean equals(Object obj)
    {
        if (!(obj instanceof Angajat))
        {
            return false;
        }
        Angajat a = (Angajat)obj;
  return nume.equals(a.getnume()) &&
		  prenume.equals(a.getprenume());


}}
