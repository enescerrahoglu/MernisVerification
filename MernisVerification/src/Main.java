import java.time.LocalDate;
import java.util.Date;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		Customer customer1 = new Customer(1, "Enes", "Cerrahoðlu", LocalDate.of(2000,2,8), "12345678910");
        CustomerCheckService customerCheckService = new MernisServiceAdapter();
        BaseCustomerManager customerManager = new NeroCustomerManager(customerCheckService);
        customerManager.save(customer1);
	}

}
