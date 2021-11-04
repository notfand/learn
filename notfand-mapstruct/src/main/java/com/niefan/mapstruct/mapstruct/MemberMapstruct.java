package com.niefan.mapstruct.mapstruct;

import com.niefan.mapstruct.dto.MemberDTO;
import com.niefan.mapstruct.po.Member;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * 会员对象映射
 * @author Niefan
 * @date 2021/11/4
 */
@Mapper
public interface MemberMapstruct {
	MemberMapstruct INSTANCE = Mappers.getMapper(MemberMapstruct.class);

	/**
	 * 将Member转为MemberDTO
	 * @param member 会员对象
	 * @see com.niefan.mapstruct.po.Member
	 * @return MemberDTO
	 * @see com.niefan.mapstruct.dto.MemberDTO
	 */
	@Mapping(source = "phone", target = "phoneNumber")
	@Mapping(source = "birthday", target = "birthday", dateFormat = "yyyy-MM-dd")
	MemberDTO toMemberDTO(Member member);
}
