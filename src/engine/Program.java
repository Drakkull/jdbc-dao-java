package engine;

import entities.DB;
import entities.DbException;
import entities.Department;
import entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement st = null;
        System.out.println("--------------Testing DB connectivity----------");
        try{
            conn = DB.getConnection();

        }
        catch (DbException e){
            e.printStackTrace();

        }

        //Applying a new change
        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
        System.out.println("-----------Testing Seller---------------");
        Seller sel = new Seller(1,"Pililiu","pil@gmail.com", new Date(),3.000, new Department(1, "xiii"));
        System.out.println(sel);


        System.out.println("-----------Testing Department------------");
        Department dep = new Department(1,"Oeeeee");
        System.out.println(dep);

    }
}
