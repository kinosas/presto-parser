package com.facebook.presto.sql.parser;

import com.facebook.presto.sql.tree.Statement;
import com.facebook.presto.sql.tree.TableOperInfo;

import java.util.ArrayList;
import java.util.List;

public class PrestoParser {
    private List<TableOperInfo> res = new ArrayList<>();
    public List<TableOperInfo> getTableOperInfo(String sql){
        SqlParser parser = new SqlParser();
        res = parser.parse(sql);
        return res;
    }
}
