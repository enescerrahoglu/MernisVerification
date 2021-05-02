package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) throws Exception {
		System.out.println("Save to DataBase : " + customer.getFirstName() + " " + customer.getLastName());
	}

}
