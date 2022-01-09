    package controller;
    import java.sql.ResultSet;
    import database.DbConnection;
    import model.Customer;

    public class CustomerController {
        
        DbConnection db;

        public int registerCustomer(Customer customer){
            String query;
            query = "insert into customer(custFname,custLname,gender,phoneNo,address," + "username,password) values('"+
            customer.getCustFname()+"','"+
            customer.getCustLname()+"','"+
            customer.getGender()+"','"+
            customer.getPhoneNo()+"','"+
            customer.getAddress()+"','"+
            customer.getUsername()+"','"+
            customer.getPassword()+"');";
        db = new DbConnection();
        return db.maniulate(query);

        
    }
        //Login customer
    public Customer loginCustomer(String username,
    String password) {
        String query;
        query ="select * from customer where username = '"
        + username +
        "' and password = '" + password +"';";
        db = new DbConnection(); 
        ResultSet rs = db.retrieve(query);
        Customer customer = null;
        try{
            while (rs.next()){
                customer = new Customer();
                customer.setCustId(rs.getInt("custId"));
                customer.setCustFname(rs.getString("custFname"));
                customer.setCustLname(rs.getString("custlname"));
                customer.setGender(rs.getString("gender").charAt(0));
                customer.setAddress(rs.getString("address"));
                customer.setUsername(rs.getString("username"));
            }
        } catch (Exception ex){
            System.out.println("eroor" + ex);
        }
        return customer;
    }
}

