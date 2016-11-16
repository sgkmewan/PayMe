/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PayMe;

/**
 *
 * @author team cooba
 */
public class Employee {
    
    public String addEmployee(String[] details){
        
        /*to do
        1.verify deptid,emptype
        2.put array details to variables
        3.generate empid(using generateEmpId(deptid,emptype) method)
        4.add record to database.
            update employee table
        */
    return "empid";
    }
    
    public boolean editEmployee(String empid,String[] details){
    boolean status=false;//if task succeed set to true
        /*to do
        
        1.put array details to var's
        2.update employee table
    
        */
    return status;
    }
    
    public boolean deleteEmployee(String empid,String[] details){
    boolean status=false;//if task succeed set to true
        /*to do
        
        1.delete record from employee table
        2.delete records related to empid from
                attendace,overtime,allowances,salary,payslip tables
                write a log of deleted details(optional)
    
        */
    return status;
    }
    
    public String[] viewEmployee(String empid){
        String[] details = null;
        /*to do
        1.get details from employee table,set to details
        */
        
        return details;
    
    }
    
    public String viewAttendance(String empid){
    String jsonfile = null;
        /*to do
        1.get details from attendance table
        2.add all records to jsonfile
        3.return jsonfile
        
        */
    return jsonfile;
    }
    
    
    
    public String generateEmpId(String deptid,String emptype){
    String empid=deptid+emptype;
        /*to do
        1.select empid(varchar(10)) of last added record from employee table where deptid=deptid & emptype=emptype
        2.convert empid(5-9) char's to int,-----> 
            +1 ------>  
            convert to String-----> 
            concate with empid
        3.return empid
        */
    
    return "empid";
    }
    
    public boolean verifyEmpId(String empid){
        boolean check=false;
        /*to do
        1.check whether empid exists in employee table
        2.update check status
        3. return
        */
        return check;
    }
}
