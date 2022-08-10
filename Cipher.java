/**
 * Project 2 -- Cipher
 *
 * This is an implementation of encryption and decryption algorithms of a
 * substitution cipher
 *
 * @author Melisa Ates-20120205045
 *
 * atesmel12@gmail.com
 *
 * @class BIL 122
 *
 * @date 08.04.2021
 *
 */

public class Cipher {

    final String plaintextAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; // Plaintext
    // Alphabet
    private String keyword; // The Secret Keyword
    private String ciphertextAlphabet; // Ciphertext Alphabet

    /**
     * Class constructor initializes the keyword and creates the Ciphertext Alphabet
     *
     * @param key the secret keyword used to create the ciphertext alphabet
     */
    public Cipher(String key) {
        this.keyword = key;
        ciphertextAlphabet = initCiphertextAlphabet();

    }

    /**
     * removes all duplicate occurrences of characters from a String
     *
     * @param s String with duplicate occurrences of characters
     * @return String with no duplicate characters in it
     */
    public static String removeDups(String s) {
        if (s.length() > 0) {//Bos bir string girdigimizde problem olmasin diye uzunlugu 0'dan buyuk aldim.
            String result = "";

            for (int i = 0; i < s.length();i++) {//s'nin uzunlugu kadar calisan for dongusu olusturdum.

                if (!(result.contains(String.valueOf(s.charAt(i))))){//s'nin karakterin eger result icermiyorsa diye sart kostum ayni olanlari eleyebilmek icin.

                    result +=String.valueOf(s.charAt(i));//result'un sonuna sarti saglayan karakteri stringe cevirip ekledim.
                }
            }
            return result;//En son deger dondurulur.
        }
        return s;//Uzunluk 0'dan kucukse bossa yani oldugu gibi dondurulur.
    }

    /**
     * generates the ciphertext alphabet from the keyword
     *
     * @return String of ciphertext alphabet generated from the keyword
     */
    public String initCiphertextAlphabet() {

        String text = removeDups(keyword.toUpperCase());//Anahtar kelimenin harflerini buyuk harfe cevirip removeDups ile ayni karakterleri cikardim.

        for (int i = 0; i < plaintextAlphabet.length(); i++) {//plaintextAlphabet'in indeksini kontrol eden bir for dongusu olusturdum.

            if (!(text.contains(String.valueOf(plaintextAlphabet.charAt(i))))) {//Eger text isimli string plaintextAlphabet'teki herhangi bir karakteri icermiyorsa diye sart kostum.

                text +=String.valueOf(plaintextAlphabet.charAt(i));//Eger sarti saglarsa o karakteri stringe cevirip concatla text'in sonuna ekledim.
            }

        }
        return text;

    }

    /**
     * Encrypts a message in plaintext
     *
     * @param message the message to be encrypted in ciphertext alphabet
     * @return the encrypted message in ciphertext alphabet
     */
    public String encrypt(String message) {
        String newMessage="";
        message = message.toUpperCase();//Parametre olarak alinan message metninin harflerini toupperla buyuk harfe cevirdim.

        for (int i = 0; i < message.length(); i++) {//message metninin icinde gezen bir for dongusu olusturdum.

            if (plaintextAlphabet.contains(String.valueOf(message.charAt(i)))) {//plaintextAlphabet eger message'nin herhangi bir karakterini iceriyorsa diye sart kostum.

                int indks=plaintextAlphabet.indexOf(message.charAt(i));//indks degiskenine message'nin plaintextAlphabet'te olan karakterin indeksini atadim.
                newMessage+=String.valueOf(ciphertextAlphabet.charAt(indks));//newMessage'a, plaintextAlphabet'teki harfin ciphertextAlphabet'teki indks indeksinden karsiligini bulup ekledim.
            }
            else {
                newMessage+=String.valueOf(message.charAt(i));//Eger karakter plaintextAlphabet'te yoksa direk newMessage'nin sonuna ekledim.
            }
        }

        return newMessage;//En son stringimizi dondurdum.
    }

    /**
     * Encrypts a message in plaintext
     *
     * @param ciphertext ciphertext in ciphertext alphabet
     * @return the decrypted message in plaintext alphabet
     */
    public String decrypt(String ciphertext) {
        String newMessage2="";
        ciphertext=ciphertext.toUpperCase();

        for (int j = 0; j < ciphertext.length(); j++) {//ciphertext metninin icinde gezen bir for dongusu olusturdum.

            if (ciphertextAlphabet.contains(String.valueOf(ciphertext.charAt(j)))) {//ciphertextAlphabet eger ciphertext'in herhangi bir karakterini iceriyorsa diye sart kostum.

                int indks2=ciphertextAlphabet.indexOf(ciphertext.charAt(j));//indks2 degiskenine ciphertext'in ciphertextAlphabet'te olan karakterin indeksini atadim.
                newMessage2+=String.valueOf( plaintextAlphabet.charAt(indks2));//newMessage2'ye, ciphertextAlphabet'teki harfin plaintextAlphabet'teki indks2 indeksinden karsiligini bulup ekledim.

            } else {
                newMessage2+=String.valueOf(ciphertext.charAt(j));//Eger karakter ciphertextAlphabet'te yoksa direk newMessage2'nin sonuna ekledim.
            }
        }

        return newMessage2;//En sonda metnin karakterlerini toUpperCase ile buyuk harfe cevirdim.
    }

    public static void main(String[] args) {
        Cipher c = new Cipher("medeniyet2021");
        System.out.println(c.encrypt("THIS IS A SECRET"));
        System.out.println(c.decrypt("O20L 0L M LIDKIO"));
    }
}