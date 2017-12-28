package info.btsland.exchange.mapper;

import info.btsland.exchange.model.RealAsset;
import info.btsland.exchange.model.RealAssetExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface RealAssetMapper {
    @SelectProvider(type=RealAssetSqlProvider.class, method="countByExample")
    int countByExample(RealAssetExample example);

    @DeleteProvider(type=RealAssetSqlProvider.class, method="deleteByExample")
    int deleteByExample(RealAssetExample example);

    @Delete({
        "delete from real_asset",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into real_asset (id, dealer_id, ",
        "real_asset_no, real_asset_type, ",
        "is_available, depict, ",
        "name, type)",
        "values (#{id,jdbcType=INTEGER}, #{dealerId,jdbcType=VARCHAR}, ",
        "#{realAssetNo,jdbcType=VARCHAR}, #{realAssetType,jdbcType=VARCHAR}, ",
        "#{isAvailable,jdbcType=INTEGER}, #{depict,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{type,jdbcType=INTEGER})"
    })
    int insert(RealAsset record);

    @InsertProvider(type=RealAssetSqlProvider.class, method="insertSelective")
    int insertSelective(RealAsset record);

    @SelectProvider(type=RealAssetSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
        @Result(column="dealer_id", property="dealerId", jdbcType= JdbcType.VARCHAR),
        @Result(column="real_asset_no", property="realAssetNo", jdbcType= JdbcType.VARCHAR),
        @Result(column="real_asset_type", property="realAssetType", jdbcType= JdbcType.VARCHAR),
        @Result(column="is_available", property="isAvailable", jdbcType= JdbcType.INTEGER),
        @Result(column="depict", property="depict", jdbcType= JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType= JdbcType.INTEGER)
    })
    List<RealAsset> selectByExample(RealAssetExample example);

    @Select({
        "select",
        "id, dealer_id, real_asset_no, real_asset_type, is_available, depict, name, type",
        "from real_asset",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
        @Result(column="dealer_id", property="dealerId", jdbcType= JdbcType.VARCHAR),
        @Result(column="real_asset_no", property="realAssetNo", jdbcType= JdbcType.VARCHAR),
        @Result(column="real_asset_type", property="realAssetType", jdbcType= JdbcType.VARCHAR),
        @Result(column="is_available", property="isAvailable", jdbcType= JdbcType.INTEGER),
        @Result(column="depict", property="depict", jdbcType= JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType= JdbcType.INTEGER)
    })
    RealAsset selectByPrimaryKey(Integer id);

    @UpdateProvider(type=RealAssetSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") RealAsset record, @Param("example") RealAssetExample example);

    @UpdateProvider(type=RealAssetSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") RealAsset record, @Param("example") RealAssetExample example);

    @UpdateProvider(type=RealAssetSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(RealAsset record);

    @Update({
        "update real_asset",
        "set dealer_id = #{dealerId,jdbcType=VARCHAR},",
          "real_asset_no = #{realAssetNo,jdbcType=VARCHAR},",
          "real_asset_type = #{realAssetType,jdbcType=VARCHAR},",
          "is_available = #{isAvailable,jdbcType=INTEGER},",
          "depict = #{depict,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(RealAsset record);
}