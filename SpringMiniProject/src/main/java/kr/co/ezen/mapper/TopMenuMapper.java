package kr.co.ezen.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import kr.co.ezen.beans.BoardInfoBean;

public interface TopMenuMapper {

	@Select("select * from board_info_table order by board_info_idx")
		List<BoardInfoBean> getTopMenuList();
}
