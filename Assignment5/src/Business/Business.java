package Business;

/**
 * 
 */
public class Business {

    private SupplierDirectory supplierDirectory;
    private CustomerDirectory customerDirectory;
    private EmployeeDirectory employeeDirectory;
    private MasterOrderCatalog moc;
    private Order order;

    public Business() {
        supplierDirectory = new SupplierDirectory();
        moc = new MasterOrderCatalog();
        employeeDirectory = new EmployeeDirectory();
        customerDirectory = new CustomerDirectory();
        order = new Order();
    }

    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public void setSupplierDirectory(SupplierDirectory supplierDirectory) {
        this.supplierDirectory = supplierDirectory;
    }

    public MasterOrderCatalog getMasterOrderCatalog() {
        return moc;
    }

    public void setMasterOrderCatalog(MasterOrderCatalog masterOrderCatalog) {
        this.moc = masterOrderCatalog;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

}

        

