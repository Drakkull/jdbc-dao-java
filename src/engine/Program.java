package engine;

import entities.DB;
import entities.DbException;
import entities.Department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement st = null;

        try{
            conn = DB.getConnection();

        }
        catch (DbException e){
            e.printStackTrace();

        }


        Department dep = new Department(1,"Oeeeee");
        System.out.println(dep);

    }
}
