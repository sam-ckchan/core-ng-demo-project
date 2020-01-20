package app.demo.api.customer;

import core.framework.api.json.Property;

import java.util.List;

public class SearchCustomerResponse {
    @Property(name = "total")
    public Long total;

    @Property(name = "customers")
    public List<CustomerView> customers;
}
