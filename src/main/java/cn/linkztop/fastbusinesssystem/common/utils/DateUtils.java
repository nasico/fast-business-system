package cn.linkztop.fastbusinesssystem.common.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;

/**
 * @author nasico
 */
public class DateUtils {
    public static long getMillSecond(LocalDateTime time){
        if(time == null){
            throw new IllegalArgumentException("time is null");
        }
        return time.toInstant(ZoneOffset.ofHours(8)).toEpochMilli();
    }

    public static long getMillSecond(LocalDate time){
        if(time == null){
            throw new IllegalArgumentException("time is null");
        }
        return Date.from(time.atStartOfDay(ZoneId.systemDefault()).toInstant()).getTime();
    }

    public static LocalDateTime getTimeNow(){
        return LocalDateTime.now(ZoneOffset.ofHours(8));
    }

    public static LocalDate getDateNow(){
        return LocalDate.now(ZoneOffset.ofHours(8));
    }
}
