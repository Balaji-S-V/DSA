import java.math.BigInteger;
import java.util.Random;

public class RSA 
{
    private BigInteger p;
    private BigInteger q;
    private BigInteger n;
    private BigInteger phi;
    private BigInteger e;
    private BigInteger d;
    private int bitlength = 1024;
    private Random r;

    public RSA() {
        r = new Random();
        p = BigInteger.probablePrime(bitlength, r);
        q = BigInteger.probablePrime(bitlength, r);
        n = p.multiply(q);
        phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
        e = BigInteger.probablePrime(bitlength / 2, r);
        while (phi.gcd(e).compareTo(BigInteger.ONE) > 0 && e.compareTo(phi) < 0) {
            e.add(BigInteger.ONE);
        }
        d = e.modInverse(phi);
    }

    public String encrypt(String message) {
        return (new BigInteger(message.getBytes())).modPow(e, n).toString();
    }

    public String decrypt(String encrypted) {
        BigInteger decrypt = new BigInteger(encrypted).modPow(d, n);
        return new String(decrypt.toByteArray());
    }
    public static void main(String[] args)
    {
    RSA rsa = new RSA();
    String message = "congrats";
    String encrypted = rsa.encrypt(message);
    String decrypted = rsa.decrypt(encrypted);

    System.out.println("Message: " + message);
    System.out.println("Encrypted: " + encrypted);
    System.out.println("Decrypted: " + decrypted);
}
}


