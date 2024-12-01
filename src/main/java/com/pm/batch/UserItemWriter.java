package com.pm.batch;

import com.pm.model.User;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

public class UserItemWriter implements ItemWriter<User> {

    @Override
    public void write(List<? extends User> users) throws Exception {
        users.forEach(user -> {
            System.out.println("In Writer User is >>> "+ user.toString());
        });
    }
}
