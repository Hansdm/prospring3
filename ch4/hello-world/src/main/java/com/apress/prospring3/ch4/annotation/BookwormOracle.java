package com.apress.prospring3.ch4.annotation;

import com.apress.prospring3.ch4.Oracle;
import org.springframework.stereotype.Service;

@Service("oracle")
public class BookwormOracle implements Oracle {
    public String defineMeaningOfLife() {
        return "Encyclopedia's are a waste of money - use the Internet";
    }

}
