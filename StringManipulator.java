/**
 * manipulates a string
 * @author Melisa Ates-atesmel12@gmail.com
 * 19.03.2021
 */

import static java.lang.String.valueOf;
public class StringManipulator {

	/**
	 * returns intiail of the given name
	 * e.g.: if name is "ALI VELI", it returns "AV".
	 * Verilen ismin bas harflerini bulur, ornegin "Ayse Fatma" icin
	 * "AF" return eder
	 * ismin sadece 2 kelimeden olustugunu varsayabilirsiniz.
	 * @param name
	 * @return the initials
	 */
	String findInitials(String name) {
		name=name.toUpperCase();//Metnin harflerini buyuk harfe cevirdim.

		int m=name.indexOf(" ");//m'ye boslugun indeksini atadim.
		char r=name.charAt(0);//ilk harfi r degiskeninde tuttum.
		char s=name.charAt(m+1);//Bosluktan sonraki ilk harfi yani soyadin ilk harfini s'ye atadim.

		//r ve s char degiskenlerini stringe ceviren fonksiyon kullandim.
		String o=valueOf(r);
		String p=valueOf(s);

		String k=o.concat(p);//o metninin sonuna p'yi ekledim.
		return k;

	}


	/**
	 * changes the extension of the filename
	 * e.g. if filename is "data.txt" and ext is "java"
	 * it returns "data.java"
	 * tr: verilen dosyanin uzantisini degistirir. Ornegin
	 * e.g.  filename icin "data.txt" ve ext icin "java" verilirse
	 * "data.java" yi  return eder
	 * @param filename
	 * @param ext
	 * @return
	 */

	String changeExtension(String filename, String ext) {

		int m=filename.indexOf(".");//Dosya ismindeki noktanin indeksini m degiskenine atadim.
		String k=filename.substring(0,m+1);//Dosya isminin noktaya kadar olan kismini k'ya atadim.
		String t=k.concat(ext);//Dosya ismindeki noktaya kadar olan kisma istenilen uzatiyi ekledim.
		return t;

	}

	public static void main(String[] args) {
		/*This part is not tested and graded.
		You can try to manually test your program from here
		bu kisim proje kapsaminda degerlendirilmeyecektir.
		*/

	}

}
