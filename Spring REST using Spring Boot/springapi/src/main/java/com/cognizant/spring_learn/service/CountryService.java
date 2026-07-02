package com.cognizant.spring_learn.service;

import com.cognizant.spring_learn.model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    private final ApplicationContext applicationContext;

    public CountryService(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public List<Country> getAllCountries()
    {
        List<Country> countryList = (List<Country>) applicationContext.getBean("countryList");
        return countryList;
    }

    public Country getCountry(String code)
    {
        List<Country> countryList = getAllCountries();

        for(Country country: countryList)
        {
            if(country.getCode().equalsIgnoreCase(code))
            {
                return country;
            }
        }
        return null;
    }
}
