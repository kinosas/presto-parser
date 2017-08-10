package com.facebook.presto.sql.parser;

import com.facebook.presto.sql.tree.Statement;
import com.facebook.presto.sql.tree.Table;
import com.facebook.presto.sql.tree.TableOperInfo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception {
        List<TableOperInfo> result = new ArrayList<TableOperInfo>();
        String testSql = "WITH\n" +
                "  t1 AS (SELECT a, MAX(b) AS b FROM x GROUP BY a),\n" +
                "  t2 AS (SELECT a, AVG(d) AS d FROM y GROUP BY a)\n" +
                "SELECT t1.*, t2.*\n" +
                "FROM t1\n" +
                "JOIN t2 ON t1.a = t2.a";
        PrestoParser pp = new PrestoParser();
        result = pp.getTableOperInfo(testSql);

        //结果输出
        System.out.println("-------------------------------------------");
        for (TableOperInfo item : result){
            System.out.println("TableName: "+item.getTableName()+"\t"+"Operator: "+(item.getOpType()==0?"SELECT":"NOT SELECT"));
        }
        System.out.println("-------------------------------------------");
    }
}
