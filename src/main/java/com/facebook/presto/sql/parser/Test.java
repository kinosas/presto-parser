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
        String testSql = "SELECT r.name AS \"餐厅名\"\n" +
                ",a.restaurant_id AS \"餐厅ID\"\n" +
                ",a.order_amt AS \"交易额\"\n" +
                ",concat(cast((CASE WHEN g.order_amt>0 AND a.order_amt>0\n" +
                "THEN round(a.order_amt/g.order_amt,4)\n" +
                "ELSE 0.0 END)*100 AS varchar),'%') AS \"交易额占比\"\n" +
                ",0 AS \"日均交易额\"\n" +
                ",total_subsidy \"总补贴金额\"\n" +
                ",CASE WHEN a.order_amt=0 THEN 0.00 ELSE total_subsidy/a.order_amt END AS \"补贴力度\"\n" +
                ",cut_money-total_subsidy AS \"餐厅自营销费用\"\n" +
                ",a.new_user_num AS \"新客数\"\n" +
                ",concat(cast((CASE WHEN g.new_user_num>0 AND a.new_user_num>0\n" +
                "THEN round(a.new_user_num/g.new_user_num,4)\n" +
                "ELSE 0.0 END)*100 AS varchar),'%') AS \"新客数占比\"\n" +
                ",a.order_num AS \"订单数\"\n" +
                ",concat(cast((CASE WHEN g.order_num>0 AND a.order_num>0\n" +
                "THEN round(a.order_num/g.order_num,4)\n" +
                "ELSE 0.0 END)*100 AS varchar),'%') AS \"订单数占比\"\n" +
                ",0 AS \"日均订单数\"\n" +
                ",CASE WHEN a.order_num>0 AND a.order_amt>0 THEN round(a.order_amt/a.order_num,2) ELSE 0.0 END AS \"客单价\"\n" +
                ",a.invalid_order_num AS \"无效订单数\"\n" +
                ",a.invalid_unpay_fail_order_num AS \"无效＆支付失败订单数\"\n" +
                ",a.online_pay_order_amt \"在线支付金额\"\n" +
                ",CASE WHEN r.certification_status = 0 THEN '已提交未认证'\n" +
                "WHEN r.certification_status = 1 THEN CASE WHEN r.certification_type =1 THEN '已认证（个人）'\n" +
                "WHEN r.certification_type =2 THEN '已认证（企业）'\n" +
                "ELSE '已认证（未知）' END\n" +
                "WHEN r.certification_status = -1 THEN '认证失败'\n" +
                "ELSE '未认证' END AS \"认证状态\"\n" +
                ",CASE WHEN a.saas_status = 0 THEN '停用'\n" +
                "WHEN a.saas_status = 1 THEN '免费试用'\n" +
                "WHEN a.saas_status = 2 THEN '需付费'\n" +
                "WHEN a.saas_status = 3 THEN '已付费'\n" +
                "WHEN a.saas_status = 4 THEN '暂不收费'\n" +
                "ELSE '其它' END \"收费状态\"\n" +
                ",r.address_text \"餐厅地址\"\n" +
                ",CASE WHEN r.order_mode = 2 THEN '短信处理'\n" +
                "WHEN r.order_mode = 3 THEN 'web napos 处理'\n" +
                "WHEN r.order_mode = 4 THEN '无线打印机'\n" +
                "WHEN r.order_mode = 5 THEN '第三方配送'\n" +
                "WHEN r.order_mode = 6 THEN '开放平台'\n" +
                "WHEN r.order_mode IN (7, 8) THEN 'eleme自配送'\n" +
                "WHEN r.order_mode = 9 THEN 'napos android 处理'\n" +
                "WHEN r.order_mode = 10 THEN 'napos ios 处理'\n" +
                "ELSE '其它' END \"订单模式\"\n" +
                ",CASE WHEN r.is_valid = 1 THEN '有效'\n" +
                "WHEN r.is_valid = 0 THEN '无效' END \"是否有效\"\n" +
                ",CASE WHEN r.is_premium = 1 THEN '是' ELSE '否' END \"是否品牌馆\"\n" +
                ",CASE WHEN r.online_payment = 1 THEN '是' ELSE '否' END \"是否支持在线支付\"\n" +
                ",CASE WHEN r.has_food_img = 1 THEN '是' ELSE '否' END \"是否支持有菜品图片\"\n" +
                ",CASE WHEN e.level = 1 THEN 'A'\n" +
                "WHEN e.level = 2 THEN 'B'\n" +
                "WHEN e.level = 3 THEN 'C'\n" +
                "WHEN e.level = 4 THEN 'D'\n" +
                "WHEN e.level = 5 THEN 'E'\n" +
                "ELSE '-' END \"餐厅级别\"\n" +
                ",a.flavor_names AS \"餐厅类型\"\n" +
                ",CASE WHEN a.exclusive_type = 1 THEN '是（饿了么）'\n" +
                "WHEN a.exclusive_type = 2 THEN '否（美团竞对、百度竞对）'\n" +
                "WHEN a.exclusive_type = 3 THEN '否（美团竞对）'\n" +
                "ELSE '否（百度竞对）' END \"是否独家\"\n" +
                ",CASE WHEN trim(coalesce(r.deliver_geojson,''))<>'' THEN '是' ELSE '否' END AS \"是否划分配送范围\"\n" +
                ",food_num AS \"菜品数量\"\n" +
                ",food_img_num AS \"菜品图片数\"\n" +
                ",f.utp_name \"餐厅所属业务包\"\n" +
                ",f.regiment_name \"餐厅所属战团\"\n" +
                ",f.battalion_name \"餐厅所属战营\"\n" +
                ",f.corps_name \"餐厅所属战区\"\n" +
                ",f.city_name \"餐厅所属城市\"\n" +
                ",CASE WHEN coalesce(r.food_activity_flag,0)=1 THEN '是' ELSE '否' END AS \"是否参与美食活动\"\n" +
                ",CASE WHEN coalesce(r.restaurant_activity_flag,0)=1 THEN '是' ELSE '否' END AS \"是否参与餐厅活动\"\n" +
                ",CASE WHEN coalesce(r.new_user_activity_flag,0)=1 THEN '是' ELSE '否' END AS \"是否参加新客活动\"\n" +
                ",a.order_date_num AS \"有交易天数\"\n" +
                ",s.agent_fee AS \"配送费\"\n" +
                ",s.min_deliver_amount AS \"起送价\"\n" +
                ",round(a.quality_score,2) AS \"餐厅质量得分\"\n" +
                ",a.restaurant_complain_value AS \"投诉分值\"\n" +
                ",r.is_exclusive AS \"是否勾选独家\"\n" +
                ",is_license_image AS \"是否有营业执照\"\n" +
                ",is_restaurant_service_license_copy AS \"是否有餐厅服务许可证\"\n" +
                ",front_phonto_num AS \"门店图片数\"\n" +
                ",hall_phonto_num AS \"大堂图片数\"\n" +
                ",kitchen_phonto_num AS \"后厨图片数\"\n" +
                ",CASE WHEN a.is_royalty=1 THEN '是' ELSE '否' END AS \"是否加入星火计划\"\n" +
                ",CASE WHEN a.is_sigrestaurant=1 THEN '是' ELSE '否' END AS \"是否SIG\"\n" +
                ",round(a.royalty_commission_amt,2) AS \"星火计划抽佣金额\"\n" +
                ",round(a.sig_commission_amt,2) AS \"SIG抽佣金额\"\n" +
                ",CASE WHEN a.deliver_type = 'TEAM' THEN '蜂鸟团队'\n" +
                "WHEN a.deliver_type = 'CROWD' THEN '蜂鸟众包'\n" +
                "WHEN a.deliver_type = 'BOD' THEN '饿配送'\n" +
                "WHEN a.deliver_type = 'OTH' THEN '其他'\n" +
                "ELSE '' END \"餐厅配送方式\"\n" +
                ",CASE WHEN a.is_controlled_by_eleme=1 THEN '是' ELSE '否' END AS \"是否采购标品\"\n" +
                ",CONCAT(CAST(round(a.commission_amount*100/a.goods_amount,2) AS varchar),'%') AS \"抽佣比例\"\n" +
                ",round(a.goods_amount,2) AS \"订单货价（抽佣基数）\"\n" +
                ",a.fn_order_num AS \"蜂鸟推单数\"\n" +
                "FROM\n" +
                "(SELECT a.restaurant_id,\n" +
                "sum(order_amt) AS order_amt,\n" +
                "sum(order_num) AS order_num,\n" +
                "sum(total_subsidy) total_subsidy,\n" +
                "sum(cut_money) cut_money,\n" +
                "sum(invalid_order_num) invalid_order_num,\n" +
                "sum(invalid_unpay_fail_order_num) invalid_unpay_fail_order_num,\n" +
                "sum(new_user_num) new_user_num,\n" +
                "sum(food_num) food_num,\n" +
                "sum(food_img_num) food_img_num,\n" +
                "sum(online_pay_order_amt) online_pay_order_amt,\n" +
                "count(DISTINCT CASE WHEN order_amt>0 THEN order_date END) order_date_num,\n" +
                "sum(restaurant_complain_value) restaurant_complain_value,\n" +
                "coalesce(max(CASE WHEN order_date ='2016-04-21' THEN quality_score END),0) quality_score,\n" +
                "coalesce(max(CASE WHEN order_date ='2016-04-21' THEN is_license_image END),0) is_license_image,\n" +
                "coalesce(max(CASE WHEN order_date ='2016-04-21' THEN is_restaurant_service_license_copy END),0) is_restaurant_service_license_copy,\n" +
                "coalesce(max(CASE WHEN order_date ='2016-04-21' THEN front_phonto_num END),0) front_phonto_num,\n" +
                "coalesce(max(CASE WHEN order_date ='2016-04-21' THEN hall_phonto_num END),0) hall_phonto_num,\n" +
                "coalesce(max(CASE WHEN order_date ='2016-04-21' THEN kitchen_phonto_num END),0) kitchen_phonto_num,\n" +
                "coalesce(max(CASE WHEN order_date ='2016-04-21' THEN is_royalty END),0) is_royalty,\n" +
                "coalesce(max(CASE WHEN order_date ='2016-04-21' THEN is_sigrestaurant END),0) is_sigrestaurant,\n" +
                "sum(royalty_commission_amt) royalty_commission_amt,\n" +
                "sum(sig_commission_amt) sig_commission_amt,\n" +
                "max(deliver_type) AS deliver_type,\n" +
                "max(is_controlled_by_eleme) AS is_controlled_by_eleme,\n" +
                "sum(fn_order_num) AS fn_order_num,\n" +
                "sum(commission_amount) AS commission_amount,\n" +
                "sum(goods_amount) AS goods_amount,\n" +
                "coalesce(max(case when order_date ='2016-04-21' then saas_status end),0) saas_status,\n" +
                "coalesce(max(case when order_date ='2016-04-21' then flavor_names end),'') flavor_names,\n" +
                "coalesce(max(case when order_date ='2016-04-21' then exclusive_type end),0) exclusive_type\n" +
                "FROM st.tbl0 a\n" +
                "WHERE dt='2016-04-24'\n" +
                "and order_date>='2016-04-20'\n" +
                "AND order_date<='2016-04-21'\n" +
                "GROUP BY a.restaurant_id) a\n" +
                "JOIN (select * from dw.tbl1 where dt='2016-04-24') r ON a.restaurant_id = r.id\n" +
                "LEFT OUTER JOIN (select * from st.tbl2 where dt='2016-04-24') s ON a.restaurant_id = s.id\n" +
                "LEFT OUTER JOIN (select * from st.tbl3 where dt='2016-04-24') e ON a.restaurant_id = e.restaurant_id\n" +
                "LEFT OUTER JOIN (select * from dim.tbl4 where dt='2016-04-24') f ON r.utp_id = f.utp_id\n" +
                "LEFT OUTER JOIN\n" +
                "(SELECT utp_id,\n" +
                "sum(order_amt) AS order_amt,\n" +
                "sum(order_num) AS order_num,\n" +
                "sum(new_user_num) new_user_num\n" +
                "FROM st.tbl5\n" +
                "WHERE dt='2016-04-24'\n" +
                "and order_date>='2016-04-20'\n" +
                "AND order_date<='2016-04-21'\n" +
                "AND utp_id IN (2508)\n" +
                "GROUP BY utp_id) g ON r.utp_id = g.utp_id\n" +
                "ORDER BY 3 DESC";
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
