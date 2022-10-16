package com.assignment.MarketApplication.dao;

import com.assignment.MarketApplication.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    @Query("""
            SELECT COUNT(*)
            FROM User AS usr
            WHERE usr.username = :username
            """)
    public Long countUsername(@Param("username") String username);

}
