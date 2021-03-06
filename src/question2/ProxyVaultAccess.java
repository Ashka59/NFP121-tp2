package question2;

public class ProxyVaultAccess extends AbstractVaultAccess {

    @Override
    public String accessVault(String key, boolean fingerprint, String password, boolean eyeScanner) {
        if(key.equals("vault_key") && fingerprint && password.equals("vault_password") && eyeScanner){
            AbstractVaultAccess realVaultAccess = new RealVaultAccess();
            return realVaultAccess.accessVault(key, fingerprint, password, eyeScanner);
        }
        else{
            return "access_denied";
        }
    }
}
