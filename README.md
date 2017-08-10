# presto-parser

## 说明
本项目基础为facebook公司开源的Presto项目中的presto-parser子项目，针对个人需求，进行了一些改动。

改动：
* 完善SQL语句的生成树，按照Presto 0.182 Documentation的说明，进一步补全了TreePrinter函数，支持所有说明的语法。
* 增设TableOperInfo数据结构，用来存储SQL语句中涉及到的表、操作和字段。
* 编写PrestoParser类，方便调用。

## 使用方式
测试类如下：

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
