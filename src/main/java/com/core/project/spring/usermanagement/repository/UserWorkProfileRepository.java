/**
 * 
 */
package com.core.project.spring.usermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.core.project.spring.usermanagement.entitybean.UserWorkProfile;

/**
 * @author anjali
 *
 */
public interface UserWorkProfileRepository extends JpaRepository<UserWorkProfile, Integer> {

}
