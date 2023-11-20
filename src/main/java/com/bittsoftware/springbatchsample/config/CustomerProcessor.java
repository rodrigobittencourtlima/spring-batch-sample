package com.bittsoftware.springbatchsample.config;

import com.bittsoftware.springbatchsample.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

    // here you can add any logic to process each item if necessary
    @Override
    public Customer process(Customer item) throws Exception {
//        if (item.getCountry().equals("United States")) {
//            return item;
//        }
//        return null;
        return item;
    }
}
