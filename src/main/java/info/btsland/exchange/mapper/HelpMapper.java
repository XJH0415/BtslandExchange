package info.btsland.exchange.mapper;

import info.btsland.exchange.model.Help;
import info.btsland.exchange.model.HelpExample;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface HelpMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table help
     *
     * @mbggenerated
     */
    @SelectProvider(type=HelpSqlProvider.class, method="countByExample")
    int countByExample(HelpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table help
     *
     * @mbggenerated
     */
    @DeleteProvider(type=HelpSqlProvider.class, method="deleteByExample")
    int deleteByExample(HelpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table help
     *
     * @mbggenerated
     */
    @Delete({
        "delete from help",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table help
     *
     * @mbggenerated
     */
    @Insert({
        "insert into help (id, help_id, ",
        "dealer_id)",
        "values (#{id,jdbcType=INTEGER}, #{helpId,jdbcType=VARCHAR}, ",
        "#{dealerId,jdbcType=VARCHAR})"
    })
    int insert(Help record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table help
     *
     * @mbggenerated
     */
    @InsertProvider(type=HelpSqlProvider.class, method="insertSelective")
    int insertSelective(Help record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table help
     *
     * @mbggenerated
     */
    @SelectProvider(type=HelpSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="help_id", property="helpId", jdbcType=JdbcType.VARCHAR),
        @Result(column="dealer_id", property="dealerId", jdbcType=JdbcType.VARCHAR)
    })
    List<Help> selectByExample(HelpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table help
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, help_id, dealer_id",
        "from help",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="help_id", property="helpId", jdbcType=JdbcType.VARCHAR),
        @Result(column="dealer_id", property="dealerId", jdbcType=JdbcType.VARCHAR)
    })
    Help selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table help
     *
     * @mbggenerated
     */
    @UpdateProvider(type=HelpSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Help record, @Param("example") HelpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table help
     *
     * @mbggenerated
     */
    @UpdateProvider(type=HelpSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Help record, @Param("example") HelpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table help
     *
     * @mbggenerated
     */
    @UpdateProvider(type=HelpSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Help record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table help
     *
     * @mbggenerated
     */
    @Update({
        "update help",
        "set help_id = #{helpId,jdbcType=VARCHAR},",
          "dealer_id = #{dealerId,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Help record);
}