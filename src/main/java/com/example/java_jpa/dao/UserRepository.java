package com.example.java_jpa.dao;


import com.example.java_jpa.domain.test_data;
import com.example.java_jpa.domain.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigInteger;
import java.util.List;

/**
 * @author Zsw
 * @create 2023-03-28 10:57
 */
public interface UserRepository extends JpaRepository<user,Integer> {
    //获取user表所有数据通过原生sql
    @Query(value ="select * from user",nativeQuery = true)
    List<user> getAll();
}
