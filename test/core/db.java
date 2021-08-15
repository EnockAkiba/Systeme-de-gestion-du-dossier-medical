/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author akiba
 */
public class db {
    public Connection con = null; 
//    private String Username="izindure_admin";
//    private String Passwword="rW0w]tG}b4z2";
//    private String Url="jdbc:postgresql://localhost:5432/izindure_terapreneur";

    private String Username = "postgres";
    private String Passwword = "Ganter1996";
    private String Url = "jdbc:postgresql://localhost:5433/finance_mis";
//  private String Url = "jdbc:postgresql://10.10.93.213:5432/finance_mis";

    private Statement Stmt = null;
    private PreparedStatement psmt = null;
    private String SQL = "";

    public Connection getcon() throws SQLException {
        con = DriverManager.getConnection(Url, Username, Passwword);
        return con;
    }

    public void GetDrive() throws ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
    }

    public String uploadUrl() {

//        String url="/home/izindure/tomcat/webapps/terapreneur.com/ROOT/images/";
          String url="/home/progressmih/NetBeansProjects/Terapreneur/web/images/";
//        String url ="/Users/olivier/NetBeansProjects/Terapreneur/web/images/";       
//        String url = "/home/zawadi/NetBeansProjects/terapreneur/web/images/";
//        String url ="/opt/glassfish4/glassfish/domains/domain1/applications/terapreneur/images/";   


        return url;
    }

    public void connection() throws ClassNotFoundException, SQLException {
        GetDrive();

    }

    /*
     * Insert data into the database
     * @param string name of the tablepsmt.close();
     * @param Map the Data for inserting into the table
     */
    public boolean insert(String Table, Map Data) throws SQLException, ClassNotFoundException {
        connection();
        getcon();
        String Columns = "";
        String Values = "";
        int i = 0;

        String pre = " ";
        if (!Data.isEmpty()) {
            Set<String> keys = Data.keySet();
            for (String key : keys) {
                pre = (i > 0) ? " , " : " ";
                Columns += pre + key;
                Values += pre + "'" + Data.get(key) + "'";
                i++;
            }
            SQL = "insert into " + Table + " (" + Columns + ") values (" + Values + ") ";

            psmt = getcon().prepareStatement(SQL);
            if (psmt.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }

        }
//           psmt.close();
        getcon().close();
        return false;
    }

    /*
     * Update data into the database
     * @param string name of the table
     * @param Map the data for updating into the table
     * @param Map where condition on updating data
     */
    public boolean Update(String Table, Map Data, Map Conditions) throws SQLException, ClassNotFoundException {
        connection();
        getcon();
        String ColValSet = "";
        String WhereSql = "  where   ";
        int i = 0;
        String pre = " ";
        if (!Data.isEmpty()) {
            Set<String> keys = Data.keySet();
            for (String key : keys) {
                pre = (i > 0) ? " , " : " ";
                ColValSet += pre + key + "='" + Data.get(key) + "'";

                i++;
            }
        }
        i = 0;
        if (!Conditions.isEmpty()) {
            Set<String> kys = Conditions.keySet();
            for (String ky : kys) {
                pre = (i > 0) ? " AND " : " ";
                WhereSql += pre + ky + "='" + Conditions.get(ky) + "'";

                i++;
            }
        }
        SQL = " update  " + Table + " set " + ColValSet + WhereSql;

        psmt = getcon().prepareStatement(SQL);
        if (psmt.executeUpdate() > 0) {
            return true;
        }
        getcon().close();
        return false;
    }

    /*
     * Delete data from the database
     * @param string name of the table
     * @param Map  where condition on deleting data
     */
    public boolean delete(String Table, Map Conditions) throws SQLException, ClassNotFoundException {
        connection();
        getcon();
        String WhereSql = "  where   ";
        int i = 0;
        String pre = " ";
        if (!Conditions.isEmpty()) {
            Set<String> keys = Conditions.keySet();
            for (String key : keys) {
                pre = (i > 0) ? " AND " : " ";
                WhereSql += pre + key + "='" + Conditions.get(key) + "'";
                i++;
            }
        }
        SQL = " delete  from   " + Table + "  " + WhereSql;
//                 connection();

        psmt = getcon().prepareStatement(SQL);
        if (psmt.executeUpdate() > 0) {
            return true;
        }
        psmt.close();
        getcon().close();
        return false;

    }

    
    
    
    public ResultSet getrows(String Table, Map Conditions) throws SQLException, ClassNotFoundException {
        connection();
        getcon();
        ResultSet rows = null;
        String sql = "SELECT  ";

        if (!Conditions.isEmpty()) {
            int i = 0;
            sql += (Conditions.containsKey("select") ? Conditions.get("select") : " * ");
            sql += " FROM  " + Table;

            if (Conditions.containsKey("where")) {
                sql += " WHERE ";
                Map where = (Map) Conditions.get("where");
                Set<String> keys = where.keySet();
                for (String key : keys) {

                    String pre = (i > 0) ? " AND " : " ";
                    sql += pre + key + " = '" + where.get(key) + "'";
                    i++;
                }
            }
               if (Conditions.containsKey("where_or")) {
                sql += " WHERE ";
                Map where = (Map) Conditions.get("where_or");
                Set<String> keys = where.keySet();
                for (String key : keys) {

                    String pre = (i > 0) ? " OR  " : " ";
                    sql += pre + key + " = '" + where.get(key) + "'";
                    i++;
                }
            }

            if (Conditions.containsKey("wherelike")) {
                sql += " WHERE ";
                Map wherelike = (Map) Conditions.get("wherelike");
                Set<String> keys = wherelike.keySet();
                for (String key : keys) {

                    String pre = (i > 0) ? " OR " : " ";
                    sql += pre + key + " LIKE '%" + wherelike.get(key) + "%'";
                    i++;
                }
            }

            if (Conditions.containsKey("order_by")) {
                sql += " ORDER BY      " + Conditions.get("order_by");

            }

            if (Conditions.containsKey("start") && Conditions.containsKey("limit")) {
                sql += " LIMIT   " + Conditions.get("start") + ", " + Conditions.get("limit");

            } else if (!Conditions.containsKey("start") && Conditions.containsKey("limit")) {
                sql += " LIMIT   " + Conditions.get("limit");

            }
//                   connection();
            psmt = getcon().prepareStatement(sql);
            rows = psmt.executeQuery();
             
            getcon().close();
        }
        return rows;

    }

    /*
     * Returns a  Max value of specific column   from the database table  
     * @param String Object is the name of the specific  column   of the table
     * @param String Table  is the name of the target table
     * @param array Conditions :  select, where, order_by, limit, whereless, wheregreater, wheregreaterequal, wherelessequal,Conditions
     */
    public double GetMax(String Object, String Table, Map Conditions) throws SQLException, ClassNotFoundException {
        String sql = "SELECT  MAX(" + Object + ")   FROM " + Table + "";
        double max = 0.0;
        ResultSet data = null;

        int i = 0;

        if (!Conditions.isEmpty()) {

            if (Conditions.containsKey("where")) {
                sql += " WHERE ";
                Map where = (Map) Conditions.get("where");
                Set<String> keys = where.keySet();
                for (String key : keys) {

                    String pre = (i > 0) ? " AND " : " ";
                    sql += pre + key + " = '" + where.get(key) + "'";
                    i++;
                }
            }

            if (Conditions.containsKey("whereless")) {
                sql += " WHERE ";
                Map whereless = (Map) Conditions.get("whereless");
                Set<String> keys = whereless.keySet();
                for (String key : keys) {

                    String pre = (i > 0) ? " AND " : " ";
                    sql += pre + key + " < '" + whereless.get(key) + "'";
                    i++;
                }
            }

            if (Conditions.containsKey("wheregreater")) {
                sql += " WHERE ";
                Map wheregreater = (Map) Conditions.get("wheregreater");
                Set<String> keys = wheregreater.keySet();
                for (String key : keys) {

                    String pre = (i > 0) ? " AND " : " ";
                    sql += pre + key + " > '" + wheregreater.get(key) + "'";
                    i++;
                }
            }

            if (Conditions.containsKey("wheregreaterequal")) {
                sql += " WHERE ";
                Map wheregreaterequal = (Map) Conditions.get("wheregreaterequal");
                Set<String> keys = wheregreaterequal.keySet();
                for (String key : keys) {

                    String pre = (i > 0) ? " AND " : " ";
                    sql += pre + key + " >= '" + wheregreaterequal.get(key) + "'";
                    i++;
                }
            }

            if (Conditions.containsKey("wherelessequal")) {
                sql += " WHERE ";
                Map wherelessequal = (Map) Conditions.get("wherelessequal");
                Set<String> keys = wherelessequal.keySet();
                for (String key : keys) {

                    String pre = (i > 0) ? " AND " : " ";
                    sql += pre + key + " <= '" + wherelessequal.get(key) + "'";
                    i++;
                }
            }

        }

        connection();
        psmt = getcon().prepareStatement(sql);
        data = psmt.executeQuery();
        if (data.next()) {
            max = data.getDouble(1);
        }
        data.close();
        getcon().close();
        //psmt.close();
        return max;

    }
    
    
    
    
        public int Getmax(String Table) throws SQLException, ClassNotFoundException {
        String sql = "SELECT  MAX(id)   FROM " + Table ;
        int max = 0;
        ResultSet data = null;
        connection();
        psmt = getcon().prepareStatement(sql);
        data = psmt.executeQuery();
        if (data.next()) {
            max = data.getInt(1);
        }
        data.close();
        getcon().close();
        return max;
        
    }

}
