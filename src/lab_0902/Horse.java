package lab_0902;

import java.security.SecureRandom;

public class Horse extends Animal{
    @Override
    public int getSpeed() {
        return new SecureRandom().nextInt(100);
    }
}
