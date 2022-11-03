package com.bitcamp.gabojago.dao;

import com.bitcamp.gabojago.vo.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MemberDao {

   int insertMember(Member member);
   
   Member findByIdPassword(
          @Param("id") String id,
          @Param("password") String password);

}