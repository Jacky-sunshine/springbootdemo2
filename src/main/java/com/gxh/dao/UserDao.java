package com.gxh.dao;

        import com.gxh.entity.User;
        import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {

}
