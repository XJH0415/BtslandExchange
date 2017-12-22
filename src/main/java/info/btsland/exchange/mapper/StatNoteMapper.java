package info.btsland.exchange.mapper;

import info.btsland.exchange.model.StatNote;
import info.btsland.exchange.model.StatNoteExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface StatNoteMapper {
    @SelectProvider(type=StatNoteSqlProvider.class, method="countByExample")
    int countByExample(StatNoteExample example);

    @DeleteProvider(type=StatNoteSqlProvider.class, method="deleteByExample")
    int deleteByExample(StatNoteExample example);

    @Delete({
        "delete from stat_note",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into stat_note (id, stat_no, ",
        "depict, tab)",
        "values (#{id,jdbcType=INTEGER}, #{statNo,jdbcType=INTEGER}, ",
        "#{depict,jdbcType=VARCHAR}, #{tab,jdbcType=VARCHAR})"
    })
    int insert(StatNote record);

    @InsertProvider(type=StatNoteSqlProvider.class, method="insertSelective")
    int insertSelective(StatNote record);

    @SelectProvider(type=StatNoteSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
        @Result(column="stat_no", property="statNo", jdbcType= JdbcType.INTEGER),
        @Result(column="depict", property="depict", jdbcType= JdbcType.VARCHAR),
        @Result(column="tab", property="tab", jdbcType= JdbcType.VARCHAR)
    })
    List<StatNote> selectByExample(StatNoteExample example);

    @Select({
        "select",
        "id, stat_no, depict, tab",
        "from stat_note",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
        @Result(column="stat_no", property="statNo", jdbcType= JdbcType.INTEGER),
        @Result(column="depict", property="depict", jdbcType= JdbcType.VARCHAR),
        @Result(column="tab", property="tab", jdbcType= JdbcType.VARCHAR)
    })
    StatNote selectByPrimaryKey(Integer id);

    @UpdateProvider(type=StatNoteSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") StatNote record, @Param("example") StatNoteExample example);

    @UpdateProvider(type=StatNoteSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") StatNote record, @Param("example") StatNoteExample example);

    @UpdateProvider(type=StatNoteSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(StatNote record);

    @Update({
        "update stat_note",
        "set stat_no = #{statNo,jdbcType=INTEGER},",
          "depict = #{depict,jdbcType=VARCHAR},",
          "tab = #{tab,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(StatNote record);
}