package info.btsland.exchange.mapper;

import info.btsland.exchange.model.UserRecord;
import info.btsland.exchange.model.UserRecordExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface UserRecordMapper {
    @SelectProvider(type=UserRecordSqlProvider.class, method="countByExample")
    int countByExample(UserRecordExample example);

    @DeleteProvider(type=UserRecordSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserRecordExample example);

    @Delete({
        "delete from user_record",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into user_record (id, dealer_id, ",
        "in_clinch_count, in_having_count, ",
        "in_clinch_total, in_having_total, ",
        "out_clinch_count, out_having_count, ",
        "out_clinch_total, out_having_total, ",
        "time)",
        "values (#{id,jdbcType=INTEGER}, #{dealerId,jdbcType=VARCHAR}, ",
        "#{inClinchCount,jdbcType=INTEGER}, #{inHavingCount,jdbcType=INTEGER}, ",
        "#{inClinchTotal,jdbcType=DOUBLE}, #{inHavingTotal,jdbcType=DOUBLE}, ",
        "#{outClinchCount,jdbcType=INTEGER}, #{outHavingCount,jdbcType=INTEGER}, ",
        "#{outClinchTotal,jdbcType=DOUBLE}, #{outHavingTotal,jdbcType=DOUBLE}, ",
        "#{time,jdbcType=DOUBLE})"
    })
    int insert(UserRecord record);

    @InsertProvider(type=UserRecordSqlProvider.class, method="insertSelective")
    int insertSelective(UserRecord record);

    @SelectProvider(type=UserRecordSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
        @Result(column="dealer_id", property="dealerId", jdbcType= JdbcType.VARCHAR),
        @Result(column="in_clinch_count", property="inClinchCount", jdbcType= JdbcType.INTEGER),
        @Result(column="in_having_count", property="inHavingCount", jdbcType= JdbcType.INTEGER),
        @Result(column="in_clinch_total", property="inClinchTotal", jdbcType= JdbcType.DOUBLE),
        @Result(column="in_having_total", property="inHavingTotal", jdbcType= JdbcType.DOUBLE),
        @Result(column="out_clinch_count", property="outClinchCount", jdbcType= JdbcType.INTEGER),
        @Result(column="out_having_count", property="outHavingCount", jdbcType= JdbcType.INTEGER),
        @Result(column="out_clinch_total", property="outClinchTotal", jdbcType= JdbcType.DOUBLE),
        @Result(column="out_having_total", property="outHavingTotal", jdbcType= JdbcType.DOUBLE),
        @Result(column="time", property="time", jdbcType= JdbcType.DOUBLE)
    })
    List<UserRecord> selectByExample(UserRecordExample example);

    @Select({
        "select",
        "id, dealer_id, in_clinch_count, in_having_count, in_clinch_total, in_having_total, ",
        "out_clinch_count, out_having_count, out_clinch_total, out_having_total, time",
        "from user_record",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
        @Result(column="dealer_id", property="dealerId", jdbcType= JdbcType.VARCHAR),
        @Result(column="in_clinch_count", property="inClinchCount", jdbcType= JdbcType.INTEGER),
        @Result(column="in_having_count", property="inHavingCount", jdbcType= JdbcType.INTEGER),
        @Result(column="in_clinch_total", property="inClinchTotal", jdbcType= JdbcType.DOUBLE),
        @Result(column="in_having_total", property="inHavingTotal", jdbcType= JdbcType.DOUBLE),
        @Result(column="out_clinch_count", property="outClinchCount", jdbcType= JdbcType.INTEGER),
        @Result(column="out_having_count", property="outHavingCount", jdbcType= JdbcType.INTEGER),
        @Result(column="out_clinch_total", property="outClinchTotal", jdbcType= JdbcType.DOUBLE),
        @Result(column="out_having_total", property="outHavingTotal", jdbcType= JdbcType.DOUBLE),
        @Result(column="time", property="time", jdbcType= JdbcType.DOUBLE)
    })
    UserRecord selectByPrimaryKey(Integer id);

    @Select({
            "select",
            "id, dealer_id, in_clinch_count, in_having_count, in_clinch_total, in_having_total, ",
            "out_clinch_count, out_having_count, out_clinch_total, out_having_total, time",
            "from user_record",
            "where dealer_id = #{param1,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
            @Result(column="dealer_id", property="dealerId", jdbcType= JdbcType.VARCHAR),
            @Result(column="in_clinch_count", property="inClinchCount", jdbcType= JdbcType.INTEGER),
            @Result(column="in_having_count", property="inHavingCount", jdbcType= JdbcType.INTEGER),
            @Result(column="in_clinch_total", property="inClinchTotal", jdbcType= JdbcType.DOUBLE),
            @Result(column="in_having_total", property="inHavingTotal", jdbcType= JdbcType.DOUBLE),
            @Result(column="out_clinch_count", property="outClinchCount", jdbcType= JdbcType.INTEGER),
            @Result(column="out_having_count", property="outHavingCount", jdbcType= JdbcType.INTEGER),
            @Result(column="out_clinch_total", property="outClinchTotal", jdbcType= JdbcType.DOUBLE),
            @Result(column="out_having_total", property="outHavingTotal", jdbcType= JdbcType.DOUBLE),
            @Result(column="time", property="time", jdbcType= JdbcType.DOUBLE)
    })
    UserRecord selectByDealerId(String dealerId);

    @UpdateProvider(type=UserRecordSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserRecord record, @Param("example") UserRecordExample example);

    @UpdateProvider(type=UserRecordSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UserRecord record, @Param("example") UserRecordExample example);

    @UpdateProvider(type=UserRecordSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserRecord record);

    @Update({
        "update user_record",
        "set dealer_id = #{dealerId,jdbcType=VARCHAR},",
          "in_clinch_count = #{inClinchCount,jdbcType=INTEGER},",
          "in_having_count = #{inHavingCount,jdbcType=INTEGER},",
          "in_clinch_total = #{inClinchTotal,jdbcType=DOUBLE},",
          "in_having_total = #{inHavingTotal,jdbcType=DOUBLE},",
          "out_clinch_count = #{outClinchCount,jdbcType=INTEGER},",
          "out_having_count = #{outHavingCount,jdbcType=INTEGER},",
          "out_clinch_total = #{outClinchTotal,jdbcType=DOUBLE},",
          "out_having_total = #{outHavingTotal,jdbcType=DOUBLE},",
          "time = #{time,jdbcType=DOUBLE}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UserRecord record);
}