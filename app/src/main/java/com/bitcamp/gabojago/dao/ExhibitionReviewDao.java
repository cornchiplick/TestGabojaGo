package com.bitcamp.gabojago.dao;

import com.bitcamp.gabojago.vo.Exhibition;
import com.bitcamp.gabojago.vo.ExhibitionReview;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ExhibitionReviewDao {
  List<ExhibitionReview> exhibitionReviewList(int exno);

}