package info.btsland.exchange.mapper;

import info.btsland.exchange.model.TypeUser;
import info.btsland.exchange.model.TypeUserExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface TypeUserMapper {
    @SelectProvider(type=TypeUserSqlProvider.class, method="countByExample")
    int countByExample(TypeUserExample example);

    @DeleteProvider(type=TypeUserSqlProvider.class, method="deleteByExample")
    int deleteByExample(TypeUserExample example);

    @Insert({
        "insert into type_user (id, type_no, ",
        "depict)",
        "values (#{id,jdbcType=INTEGER}, #{typeNo,jdbcType=INTEGER}, ",
        "#{depict,jdbcType=VARCHAR})"
    })
    int insert(TypeUser record);

    @InsertProvider(type=TypeUserSqlProvider.class, method="insertSelective")
    int insertSelective(TypeUser record);

    @SelectProvider(type=TypeUserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.INTEGER),
        @Result(column="type_no", property="typeNo", jdbcType= JdbcType.INTEGER),
        @Result(column="depict", property="depict", jdbcType= JdbcType.VARCHAR)
    })
    List<TypeUser> selectByExample(TypeUserExample example);

    @UpdateProvider(type=TypeUserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TypeUser record, @Param("example") TypeUserExample example);

    @UpdateProvider(type=TypeUserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TypeUser record, @Param("example") TypeUserExample example);
}