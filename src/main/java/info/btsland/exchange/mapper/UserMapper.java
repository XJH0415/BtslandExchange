package info.btsland.exchange.mapper;

import info.btsland.exchange.model.User;
import info.btsland.exchange.model.UserExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface UserMapper {
    @SelectProvider(type=UserSqlProvider.class, method="countByExample")
    int countByExample(UserExample example);

    @DeleteProvider(type=UserSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserExample example);

    @Delete({
        "delete from user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into user (id, dealer_id, ",
        "dealer_name, password, ",
        "account, brokerage_in, ",
        "brokerage_out, depict, ",
        "stat, type, lower_limit_in, ",
        "upper_limit_out, lower_limit_out)",
        "values (#{id,jdbcType=INTEGER}, #{dealerId,jdbcType=VARCHAR}, ",
        "#{dealerName,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
        "#{account,jdbcType=VARCHAR}, #{brokerageIn,jdbcType=DOUBLE}, ",
        "#{brokerageOut,jdbcType=DOUBLE}, #{depict,jdbcType=VARCHAR}, ",
        "#{stat,jdbcType=INTEGER}, #{type,jdbcType=INTEGER}, #{lowerLimitIn,jdbcType=DOUBLE}, ",
        "#{upperLimitOut,jdbcType=DOUBLE}, #{lowerLimitOut,jdbcType=DOUBLE})"
    })
    int insert(User record);

    @InsertProvider(type=UserSqlProvider.class, method="insertSelective")
    int insertSelective(User record);

    @SelectProvider(type=UserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
        @Result(column="dealer_id", property="dealerId", jdbcType= JdbcType.VARCHAR),
        @Result(column="dealer_name", property="dealerName", jdbcType= JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType= JdbcType.VARCHAR),
        @Result(column="account", property="account", jdbcType= JdbcType.VARCHAR),
        @Result(column="brokerage_in", property="brokerageIn", jdbcType= JdbcType.DOUBLE),
        @Result(column="brokerage_out", property="brokerageOut", jdbcType= JdbcType.DOUBLE),
        @Result(column="depict", property="depict", jdbcType= JdbcType.VARCHAR),
        @Result(column="stat", property="stat", jdbcType= JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType= JdbcType.INTEGER),
        @Result(column="lower_limit_in", property="lowerLimitIn", jdbcType= JdbcType.DOUBLE),
        @Result(column="upper_limit_out", property="upperLimitOut", jdbcType= JdbcType.DOUBLE),
        @Result(column="lower_limit_out", property="lowerLimitOut", jdbcType= JdbcType.DOUBLE)
    })
    List<User> selectByExample(UserExample example);

    @Select({
        "select",
        "id, dealer_id, dealer_name, password, account, brokerage_in, brokerage_out, ",
        "depict, stat, type, lower_limit_in, upper_limit_out, lower_limit_out",
        "from user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
        @Result(column="dealer_id", property="dealerId", jdbcType= JdbcType.VARCHAR),
        @Result(column="dealer_name", property="dealerName", jdbcType= JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType= JdbcType.VARCHAR),
        @Result(column="account", property="account", jdbcType= JdbcType.VARCHAR),
        @Result(column="brokerage_in", property="brokerageIn", jdbcType= JdbcType.DOUBLE),
        @Result(column="brokerage_out", property="brokerageOut", jdbcType= JdbcType.DOUBLE),
        @Result(column="depict", property="depict", jdbcType= JdbcType.VARCHAR),
        @Result(column="stat", property="stat", jdbcType= JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType= JdbcType.INTEGER),
        @Result(column="lower_limit_in", property="lowerLimitIn", jdbcType= JdbcType.DOUBLE),
        @Result(column="upper_limit_out", property="upperLimitOut", jdbcType= JdbcType.DOUBLE),
        @Result(column="lower_limit_out", property="lowerLimitOut", jdbcType= JdbcType.DOUBLE)
    })
    User selectByPrimaryKey(Integer id);

    @Select({
            "select",
            "id, dealer_id, dealer_name, password, account, brokerage_in, brokerage_out, ",
            "depict, stat, type, lower_limit_in, upper_limit_out, lower_limit_out",
            "from user",
            "where dealer_id = #{param1,jdbcType=VARCHAR} and password = #{param2,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
            @Result(column="dealer_id", property="dealerId", jdbcType= JdbcType.VARCHAR),
            @Result(column="dealer_name", property="dealerName", jdbcType= JdbcType.VARCHAR),
            @Result(column="password", property="password", jdbcType= JdbcType.VARCHAR),
            @Result(column="account", property="account", jdbcType= JdbcType.VARCHAR),
            @Result(column="brokerage_in", property="brokerageIn", jdbcType= JdbcType.DOUBLE),
            @Result(column="brokerage_out", property="brokerageOut", jdbcType= JdbcType.DOUBLE),
            @Result(column="depict", property="depict", jdbcType= JdbcType.VARCHAR),
            @Result(column="stat", property="stat", jdbcType= JdbcType.INTEGER),
            @Result(column="type", property="type", jdbcType= JdbcType.INTEGER),
            @Result(column="lower_limit_in", property="lowerLimitIn", jdbcType= JdbcType.DOUBLE),
            @Result(column="upper_limit_out", property="upperLimitOut", jdbcType= JdbcType.DOUBLE),
            @Result(column="lower_limit_out", property="lowerLimitOut", jdbcType= JdbcType.DOUBLE)
    })
    User selectByIdAndPwd(String dealerId,String password);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(User record);

    @Update({
        "update user",
        "set dealer_id = #{dealerId,jdbcType=VARCHAR},",
          "dealer_name = #{dealerName,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "account = #{account,jdbcType=VARCHAR},",
          "brokerage_in = #{brokerageIn,jdbcType=DOUBLE},",
          "brokerage_out = #{brokerageOut,jdbcType=DOUBLE},",
          "depict = #{depict,jdbcType=VARCHAR},",
          "stat = #{stat,jdbcType=INTEGER},",
          "type = #{type,jdbcType=INTEGER},",
          "lower_limit_in = #{lowerLimitIn,jdbcType=DOUBLE},",
          "upper_limit_out = #{upperLimitOut,jdbcType=DOUBLE},",
          "lower_limit_out = #{lowerLimitOut,jdbcType=DOUBLE}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(User record);
}