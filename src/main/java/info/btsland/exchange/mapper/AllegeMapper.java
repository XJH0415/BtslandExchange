package info.btsland.exchange.mapper;

import info.btsland.exchange.model.Allege;
import info.btsland.exchange.model.AllegeExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface AllegeMapper {
    @SelectProvider(type=AllegeSqlProvider.class, method="countByExample")
    int countByExample(AllegeExample example);

    @DeleteProvider(type=AllegeSqlProvider.class, method="deleteByExample")
    int deleteByExample(AllegeExample example);

    @Delete({
        "delete from allege",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into allege (id, account, ",
        "dealer_id, depict, ",
        "note_no, stat_no)",
        "values (#{id,jdbcType=INTEGER}, #{account,jdbcType=VARCHAR}, ",
        "#{dealerId,jdbcType=VARCHAR}, #{depict,jdbcType=VARCHAR}, ",
        "#{noteNo,jdbcType=VARCHAR}, #{statNo,jdbcType=INTEGER})"
    })
    int insert(Allege record);

    @InsertProvider(type=AllegeSqlProvider.class, method="insertSelective")
    int insertSelective(Allege record);

    @SelectProvider(type=AllegeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
        @Result(column="account", property="account", jdbcType= JdbcType.VARCHAR),
        @Result(column="dealer_id", property="dealerId", jdbcType= JdbcType.VARCHAR),
        @Result(column="depict", property="depict", jdbcType= JdbcType.VARCHAR),
        @Result(column="note_no", property="noteNo", jdbcType= JdbcType.VARCHAR),
        @Result(column="stat_no", property="statNo", jdbcType= JdbcType.INTEGER)
    })
    List<Allege> selectByExample(AllegeExample example);

    @Select({
        "select",
        "id, account, dealer_id, depict, note_no, stat_no",
        "from allege",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
        @Result(column="account", property="account", jdbcType= JdbcType.VARCHAR),
        @Result(column="dealer_id", property="dealerId", jdbcType= JdbcType.VARCHAR),
        @Result(column="depict", property="depict", jdbcType= JdbcType.VARCHAR),
        @Result(column="note_no", property="noteNo", jdbcType= JdbcType.VARCHAR),
        @Result(column="stat_no", property="statNo", jdbcType= JdbcType.INTEGER)
    })
    Allege selectByPrimaryKey(Integer id);

    @UpdateProvider(type=AllegeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Allege record, @Param("example") AllegeExample example);

    @UpdateProvider(type=AllegeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Allege record, @Param("example") AllegeExample example);

    @UpdateProvider(type=AllegeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Allege record);

    @Update({
        "update allege",
        "set account = #{account,jdbcType=VARCHAR},",
          "dealer_id = #{dealerId,jdbcType=VARCHAR},",
          "depict = #{depict,jdbcType=VARCHAR},",
          "note_no = #{noteNo,jdbcType=VARCHAR},",
          "stat_no = #{statNo,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Allege record);
}