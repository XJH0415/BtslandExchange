package info.btsland.exchange.mapper;

import info.btsland.exchange.model.UserInfo;
import info.btsland.exchange.model.UserInfoExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface UserInfoMapper {
    @SelectProvider(type=UserInfoSqlProvider.class, method="countByExample")
    int countByExample(UserInfoExample example);

    @DeleteProvider(type=UserInfoSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserInfoExample example);

    @Delete({
        "delete from user_info",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into user_info (id, dealer_id, ",
        "name, sex, phone, ",
        "card_no, level, type, ",
        "c2c_account)",
        "values (#{id,jdbcType=INTEGER}, #{dealerId,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{sex,jdbcType=VARCHAR}, #{phone,jdbcType=VARCHAR}, ",
        "#{cardNo,jdbcType=VARCHAR}, #{level,jdbcType=DOUBLE}, #{type,jdbcType=INTEGER}, ",
        "#{c2cAccount,jdbcType=VARCHAR})"
    })
    int insert(UserInfo record);

    @InsertProvider(type=UserInfoSqlProvider.class, method="insertSelective")
    int insertSelective(UserInfo record);

    @SelectProvider(type=UserInfoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
        @Result(column="dealer_id", property="dealerId", jdbcType= JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType= JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType= JdbcType.VARCHAR),
        @Result(column="card_no", property="cardNo", jdbcType= JdbcType.VARCHAR),
        @Result(column="level", property="level", jdbcType= JdbcType.DOUBLE),
        @Result(column="type", property="type", jdbcType= JdbcType.INTEGER),
        @Result(column="c2c_account", property="c2cAccount", jdbcType= JdbcType.VARCHAR)
    })
    List<UserInfo> selectByExample(UserInfoExample example);

    @Select({
        "select",
        "id, dealer_id, name, sex, phone, card_no, level, type, c2c_account",
        "from user_info",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
        @Result(column="dealer_id", property="dealerId", jdbcType= JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType= JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType= JdbcType.VARCHAR),
        @Result(column="card_no", property="cardNo", jdbcType= JdbcType.VARCHAR),
        @Result(column="level", property="level", jdbcType= JdbcType.DOUBLE),
        @Result(column="type", property="type", jdbcType= JdbcType.INTEGER),
        @Result(column="c2c_account", property="c2cAccount", jdbcType= JdbcType.VARCHAR)
    })
    UserInfo selectByPrimaryKey(Integer id);

    @UpdateProvider(type=UserInfoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    @UpdateProvider(type=UserInfoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    @UpdateProvider(type=UserInfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserInfo record);

    @Update({
        "update user_info",
        "set dealer_id = #{dealerId,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "sex = #{sex,jdbcType=VARCHAR},",
          "phone = #{phone,jdbcType=VARCHAR},",
          "card_no = #{cardNo,jdbcType=VARCHAR},",
          "level = #{level,jdbcType=DOUBLE},",
          "type = #{type,jdbcType=INTEGER},",
          "c2c_account = #{c2cAccount,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UserInfo record);
}