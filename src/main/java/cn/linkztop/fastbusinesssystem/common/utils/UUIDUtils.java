package cn.linkztop.fastbusinesssystem.common.utils;

import java.util.UUID;

/**
 * @author nasico
 */
public class UUIDUtils {
    public final static String getUUID(){
        return UUID.randomUUID().toString().replace("-", "");
    }
}
