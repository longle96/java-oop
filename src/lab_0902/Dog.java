package lab_0902;

import java.security.SecureRandom;

public class Dog extends Animal{
    @Override
    public int getSpeed() {
        return new SecureRandom().nextInt(100);
    }
}
