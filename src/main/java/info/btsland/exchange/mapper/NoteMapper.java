package info.btsland.exchange.mapper;

import info.btsland.exchange.model.Note;
import info.btsland.exchange.model.NoteExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface NoteMapper {
    @SelectProvider(type=NoteSqlProvider.class, method="countByExample")
    int countByExample(NoteExample example);

    @DeleteProvider(type=NoteSqlProvider.class, method="deleteByExample")
    int deleteByExample(NoteExample example);

    @Delete({
        "delete from note",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into note (id, dealer_id, ",
        "note_no, asset_num, ",
        "asset_coin, brokerage, ",
        "account, real_no, ",
        "real_type, real_depict, ",
        "start_time, account_re_time, ",
        "dealer_re_time, end_time, ",
        "remark_code, stat_no, ",
        "depict, flow_path)",
        "values (#{id,jdbcType=INTEGER}, #{dealerId,jdbcType=VARCHAR}, ",
        "#{noteNo,jdbcType=VARCHAR}, #{assetNum,jdbcType=DOUBLE}, ",
        "#{assetCoin,jdbcType=VARCHAR}, #{brokerage,jdbcType=DOUBLE}, ",
        "#{account,jdbcType=VARCHAR}, #{realNo,jdbcType=VARCHAR}, ",
        "#{realType,jdbcType=VARCHAR}, #{realDepict,jdbcType=VARCHAR}, ",
        "#{startTime,jdbcType=TIMESTAMP}, #{accountReTime,jdbcType=TIMESTAMP}, ",
        "#{dealerReTime,jdbcType=TIMESTAMP}, #{endTime,jdbcType=TIMESTAMP}, ",
        "#{remarkCode,jdbcType=VARCHAR}, #{statNo,jdbcType=INTEGER}, ",
        "#{depict,jdbcType=VARCHAR}, #{flowPath,jdbcType=VARCHAR})"
    })
    int insert(Note record);

    @InsertProvider(type=NoteSqlProvider.class, method="insertSelective")
    int insertSelective(Note record);

    @SelectProvider(type=NoteSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
        @Result(column="dealer_id", property="dealerId", jdbcType= JdbcType.VARCHAR),
        @Result(column="note_no", property="noteNo", jdbcType= JdbcType.VARCHAR),
        @Result(column="asset_num", property="assetNum", jdbcType= JdbcType.DOUBLE),
        @Result(column="asset_coin", property="assetCoin", jdbcType= JdbcType.VARCHAR),
        @Result(column="brokerage", property="brokerage", jdbcType= JdbcType.DOUBLE),
        @Result(column="account", property="account", jdbcType= JdbcType.VARCHAR),
        @Result(column="real_no", property="realNo", jdbcType= JdbcType.VARCHAR),
        @Result(column="real_type", property="realType", jdbcType= JdbcType.VARCHAR),
        @Result(column="real_depict", property="realDepict", jdbcType= JdbcType.VARCHAR),
        @Result(column="start_time", property="startTime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="account_re_time", property="accountReTime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="dealer_re_time", property="dealerReTime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="end_time", property="endTime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="remark_code", property="remarkCode", jdbcType= JdbcType.VARCHAR),
        @Result(column="stat_no", property="statNo", jdbcType= JdbcType.INTEGER),
        @Result(column="depict", property="depict", jdbcType= JdbcType.VARCHAR),
        @Result(column="flow_path", property="flowPath", jdbcType= JdbcType.VARCHAR)
    })
    List<Note> selectByExample(NoteExample example);
    @Select({
            "select",
            "count(1) AS count",
            "from note",
            "where dealer_id = #{param1,jdbcType=INTEGER}"
    })
    int selectCountBydealerId(String dealerId);
    @Select({
        "select",
        "id, dealer_id, note_no, asset_num, asset_coin, brokerage, account, real_no, ",
        "real_type, real_depict, start_time, account_re_time, dealer_re_time, end_time, ",
        "remark_code, stat_no, depict, flow_path",
        "from note",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
        @Result(column="dealer_id", property="dealerId", jdbcType= JdbcType.VARCHAR),
        @Result(column="note_no", property="noteNo", jdbcType= JdbcType.VARCHAR),
        @Result(column="asset_num", property="assetNum", jdbcType= JdbcType.DOUBLE),
        @Result(column="asset_coin", property="assetCoin", jdbcType= JdbcType.VARCHAR),
        @Result(column="brokerage", property="brokerage", jdbcType= JdbcType.DOUBLE),
        @Result(column="account", property="account", jdbcType= JdbcType.VARCHAR),
        @Result(column="real_no", property="realNo", jdbcType= JdbcType.VARCHAR),
        @Result(column="real_type", property="realType", jdbcType= JdbcType.VARCHAR),
        @Result(column="real_depict", property="realDepict", jdbcType= JdbcType.VARCHAR),
        @Result(column="start_time", property="startTime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="account_re_time", property="accountReTime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="dealer_re_time", property="dealerReTime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="end_time", property="endTime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="remark_code", property="remarkCode", jdbcType= JdbcType.VARCHAR),
        @Result(column="stat_no", property="statNo", jdbcType= JdbcType.INTEGER),
        @Result(column="depict", property="depict", jdbcType= JdbcType.VARCHAR),
        @Result(column="flow_path", property="flowPath", jdbcType= JdbcType.VARCHAR)
    })
    Note selectByPrimaryKey(Integer id);

    @Select({
            "select",
            "id, dealer_id, note_no, asset_num, asset_coin, brokerage, account, real_no, ",
            "real_type, real_depict, start_time, account_re_time, dealer_re_time, end_time, ",
            "remark_code, stat_no, depict, flow_path",
            "from note",
            "where note_no = #{param1,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
            @Result(column="dealer_id", property="dealerId", jdbcType= JdbcType.VARCHAR),
            @Result(column="note_no", property="noteNo", jdbcType= JdbcType.VARCHAR),
            @Result(column="asset_num", property="assetNum", jdbcType= JdbcType.DOUBLE),
            @Result(column="asset_coin", property="assetCoin", jdbcType= JdbcType.VARCHAR),
            @Result(column="brokerage", property="brokerage", jdbcType= JdbcType.DOUBLE),
            @Result(column="account", property="account", jdbcType= JdbcType.VARCHAR),
            @Result(column="real_no", property="realNo", jdbcType= JdbcType.VARCHAR),
            @Result(column="real_type", property="realType", jdbcType= JdbcType.VARCHAR),
            @Result(column="real_depict", property="realDepict", jdbcType= JdbcType.VARCHAR),
            @Result(column="start_time", property="startTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="account_re_time", property="accountReTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="dealer_re_time", property="dealerReTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="end_time", property="endTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="remark_code", property="remarkCode", jdbcType= JdbcType.VARCHAR),
            @Result(column="stat_no", property="statNo", jdbcType= JdbcType.INTEGER),
            @Result(column="depict", property="depict", jdbcType= JdbcType.VARCHAR),
            @Result(column="flow_path", property="flowPath", jdbcType= JdbcType.VARCHAR)
    })
    Note selectByNoteNo(String noteNo);

    @UpdateProvider(type=NoteSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Note record, @Param("example") NoteExample example);

    @UpdateProvider(type=NoteSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Note record, @Param("example") NoteExample example);

    @UpdateProvider(type=NoteSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Note record);

    @Update({
        "update note",
        "set dealer_id = #{dealerId,jdbcType=VARCHAR},",
          "note_no = #{noteNo,jdbcType=VARCHAR},",
          "asset_num = #{assetNum,jdbcType=DOUBLE},",
          "asset_coin = #{assetCoin,jdbcType=VARCHAR},",
          "brokerage = #{brokerage,jdbcType=DOUBLE},",
          "account = #{account,jdbcType=VARCHAR},",
          "real_no = #{realNo,jdbcType=VARCHAR},",
          "real_type = #{realType,jdbcType=VARCHAR},",
          "real_depict = #{realDepict,jdbcType=VARCHAR},",
          "start_time = #{startTime,jdbcType=TIMESTAMP},",
          "account_re_time = #{accountReTime,jdbcType=TIMESTAMP},",
          "dealer_re_time = #{dealerReTime,jdbcType=TIMESTAMP},",
          "end_time = #{endTime,jdbcType=TIMESTAMP},",
          "remark_code = #{remarkCode,jdbcType=VARCHAR},",
          "stat_no = #{statNo,jdbcType=INTEGER},",
          "depict = #{depict,jdbcType=VARCHAR},",
          "flow_path = #{flowPath,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Note record);
    @Select({
            "select",
            "count(*)",
            "from note",
            "where remark_code = #{param1,jdbcType=VARCHAR} limit 100"
    })
    int selectCodeCountByCode(String code);
}