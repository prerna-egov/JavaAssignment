public class Main {
    public static void main(String[] args) {
//        Account account = new Account();
//        account.withdrawFund(200.00);
//        account.depositFund(500.00);
//        account.withdrawFund(200.00);

//        Customer customer = new Customer("Prerna", "prerna@gmail.com", 1000.00);
//        System.out.println(customer.getName());
//        System.out.println(customer.getEmail());
//        System.out.println(customer.getCreditLimit());
//
//        Customer secondCustomer = new Customer();
//        System.out.println(secondCustomer.getName());
//        System.out.println(secondCustomer.getEmail());
//        System.out.println(secondCustomer.getCreditLimit());
//
//        Customer thirdCustomer = new Customer("Tim", "tim@gmail.com");
//        System.out.println(thirdCustomer.getName());
//        System.out.println(thirdCustomer.getEmail());
//        System.out.println(thirdCustomer.getCreditLimit());

        Employee employee = new Employee("Prerna", 20000.00, 2000.00, 19062023);
        employee.displayTotalSalary();
        employee.displayEmployeeRole();

        Engineer engineer = new Engineer("Prerna", 20000.00, 2000.00, 19062023, 1000.00);
        engineer.displayTotalSalary();
        engineer.displayEmployeeRole();
    }
}