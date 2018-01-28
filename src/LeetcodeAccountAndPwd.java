import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

/**
 * @Author lpf
 * @Date 1/28/18 11:47 PM
 */
public class LeetcodeAccountAndPwd {
    private static final String ALGORITHM = "AES";
    private static final String ALGORITHM_FORMAT = "AES/ECB/PKCS5Padding";
    /**
     * password must be 128/192/256 bits
     */
    private static final String DEFAULT_PASSWORD = "0eng873nvh31jfng";

    public static String encrypt(String content, String password) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGORITHM_FORMAT);
        byte[] byteContent = content.getBytes();
        SecretKeySpec keySpec = new SecretKeySpec(password.getBytes(), ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, keySpec);
        byte[] result = cipher.doFinal(byteContent);
        return Base64.getEncoder().encodeToString(result);
    }

    public static String decrypt(String content, String password) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGORITHM_FORMAT);
        SecretKeySpec keySpec = new SecretKeySpec(password.getBytes(), ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, keySpec);
        byte[] result = cipher.doFinal(Base64.getDecoder().decode(content));
        return new String(result, "utf-8");
    }

    public static void main(String[] args) throws Exception{}
}
