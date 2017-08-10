package com.facebook.presto.sql.tree;

import java.util.Set;

public class TableOperInfo {

    private String tableName;
    private Integer opType;//0 select;1 ddl(除select外所有操作，都需要all权限)
    private Set<String> cols;


    public String getTableName() {
        return tableName;
    }
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    public Integer getOpType() {
        return opType;
    }
    public void setOpType(Integer opType) {
        this.opType = opType;
    }
    public Set<String> getCols() {
        return cols;
    }
    public void setCols(Set<String> cols) {
        this.cols = cols;
    }



}
