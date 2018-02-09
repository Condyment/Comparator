import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		try {
			TreeSet<Angajat> nameComp = new TreeSet<Angajat>();
			
			Scanner x = new Scanner(new File("in.txt"));

			int q = 0;
			while (x.hasNext()) {
				String r[] = (x.nextLine()).split(" ");
				q++;
				
				String a = r[0];
				String b = r[1];
				int c = Integer.parseInt(r[2]);

				nameComp.add(new Angajat(a, b, c));

			}
			for (Angajat e : nameComp) {
				System.out.println(e);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
