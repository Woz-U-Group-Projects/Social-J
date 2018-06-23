package com.socialj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.socialj.model.socialjinfo;

@Repository
public interface socialjinfoRespository extends JpaRepository<socialjinfo, Integer>{

}
