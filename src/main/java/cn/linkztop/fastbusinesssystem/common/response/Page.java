package cn.linkztop.fastbusinesssystem.common.response;

import lombok.Data;

/**
 *
 * @author nasico
 */
@Data
public class Page {
    private int count;
    private int currentPageNo;
    private int pageSize;
}
