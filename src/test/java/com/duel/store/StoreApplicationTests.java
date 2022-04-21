package com.duel.store;

import com.duel.store.service.IStoreDataService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.yml")
public class StoreApplicationTests {

    @Autowired
    private IStoreDataService storeDataService;

    @Test
    void contextLoads() {
        storeDataService.init("11");
        System.out.println(1);
    }

}
