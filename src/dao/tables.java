/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.*;
/**
 *
 * @author nhoan
 */
public class tables {
    public static void main(String[] args){
        try{
            String categoryTable = "create table category(id int AUTO_INCREMENT primary key, name varchar(200)";
            String billTable = "create table bill(id int primary key, memid int, name varchar(200), reg_date varchar(50), purchased int, total varchar(200), createdBy varchar(200))";
            //DbOperations.setDataOrDelete(billTable, "Bill Table created successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
