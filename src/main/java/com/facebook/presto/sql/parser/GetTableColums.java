package com.facebook.presto.sql.parser;


import com.facebook.presto.sql.tree.TableOperInfo;

import java.util.*;
import java.util.concurrent.Future;

public class GetTableColums {
    public List<TableOperInfo>parse(String sqls) throws Exception {
        long start = System.currentTimeMillis();
        List<TableOperInfo> list = new ArrayList<TableOperInfo>();

        sqls = sqls.replaceAll("#(?!(\"|')).+[\n]"," ");
        sqls = sqls.replaceAll("--.+", " ");
        String[] sqlarr = sqls.split(";");

        int sqlarrLen = sqlarr.length;
        List<String> sqlTemp = null;
        List<Future<Object>> futures = new ArrayList<>();
        int totalApi = (sqlarrLen+11)/12;//每次执行12个sql语句
        int cur = 0;

        String tablename = "";
        Map<String,TableOperInfo> result = new HashMap<String, TableOperInfo>();
        Set<String> allTables = null;
        String[] tablearr = null;
        TableOperInfo toperInfo = null;



        return list;
    }
}
