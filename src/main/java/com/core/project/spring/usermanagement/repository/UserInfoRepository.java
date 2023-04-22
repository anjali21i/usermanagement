package com.core.project.spring.usermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.core.project.spring.usermanagement.entitybean.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {

}
