package com.GJJ.repository;

import com.GJJ.entity.Htb105;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface Htb105Repository extends JpaRepository<Htb105, String> {
    //自定义SQL,调用这个方法无论送入什么名字都只会查John得信息
    @Query(value = "SELECT * FROM htb105 WHERE name = 'John'", nativeQuery = true)
    Optional<Htb105> findByJohn(@Param("name") String name);
}