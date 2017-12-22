package info.btsland.exchange.mapper;

import info.btsland.exchange.model.StatUser;
import info.btsland.exchange.model.StatUserExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface StatUserMapper {
    @SelectProvider(type=StatUserSqlProvider.class, method="countByExample")
    int countByExample(StatUserExample example);

    @DeleteProvider(type=StatUserSqlProvider.class, method="deleteByExample")
    int deleteByExample(StatUserExample example);

    @Delete({
        "delete from stat_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into stat_user (id, stat_no, ",
        "depict)",
        "values (#{id,jdbcType=INTEGER}, #{statNo,jdbcType=INTEGER}, ",
        "#{depict,jdbcType=VARCHAR})"
    })
    int insert(StatUser record);

    @InsertProvider(type=StatUserSqlProvider.class, method="insertSelective")
    int insertSelective(StatUser record);

    @SelectProvider(type=StatUserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
        @Result(column="stat_no", property="statNo", jdbcType= JdbcType.INTEGER),
        @Result(column="depict", property="depict", jdbcType= JdbcType.VARCHAR)
    })
    List<StatUser> selectByExample(StatUserExample example);

    @Select({
        "select",
        "id, stat_no, depict",
        "from stat_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
        @Result(column="stat_no", property="statNo", jdbcType= JdbcType.INTEGER),
        @Result(column="depict", property="depict", jdbcType= JdbcType.VARCHAR)
    })
    StatUser selectByPrimaryKey(Integer id);

    @UpdateProvider(type=StatUserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") StatUser record, @Param("example") StatUserExample example);

    @UpdateProvider(type=StatUserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") StatUser record, @Param("example") StatUserExample example);

    @UpdateProvider(type=StatUserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(StatUser record);

    @Update({
        "update stat_user",
        "set stat_no = #{statNo,jdbcType=INTEGER},",
          "depict = #{depict,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(StatUser record);
}