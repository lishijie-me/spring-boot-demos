package io.adam.bean;

import java.math.BigDecimal;

/**
 * @author : 成行(lishijie-me)
 * @version : v1.0
 * @createTime : 2024/2/7 17:50
 * @description : 明细账单
 */
public class Ledgers {

    /**
     * ID
     * */
    private Long id;

    /**
     * 用户ID
     * */
    private Long userId;

    /**
     * 用户名
     * */
    private String userName;

    /**
     * 收支类型
     * */
    private String typeOfIncomeAndExpenses;

    /**
     * 金额
     * */
    private BigDecimal amount;

}
