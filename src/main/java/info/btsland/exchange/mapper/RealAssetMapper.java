package info.btsland.exchange.mapper;

import info.btsland.exchange.model.RealAsset;
import info.btsland.exchange.model.RealAssetExample;
import java.util.List;
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
        "is_available, depict)",
        "values (#{id,jdbcType=INTEGER}, #{dealerId,jdbcType=VARCHAR}, ",
        "#{realAssetNo,jdbcType=VARCHAR}, #{realAssetType,jdbcType=VARCHAR}, ",
        "#{isAvailable,jdbcType=INTEGER}, #{depict,jdbcType=VARCHAR})"
    })
    int insert(RealAsset record);

    @InsertProvider(type=RealAssetSqlProvider.class, method="insertSelective")
    int insertSelective(RealAsset record);

    @SelectProvider(type=RealAssetSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="dealer_id", property="dealerId", jdbcType=JdbcType.VARCHAR),
        @Result(column="real_asset_no", property="realAssetNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="real_asset_type", property="realAssetType", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_available", property="isAvailable", jdbcType=JdbcType.INTEGER),
        @Result(column="depict", property="depict", jdbcType=JdbcType.VARCHAR)
    })
    List<RealAsset> selectByExample(RealAssetExample example);

    @Select({
        "select",
        "id, dealer_id, real_asset_no, real_asset_type, is_available, depict",
        "from real_asset",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="dealer_id", property="dealerId", jdbcType=JdbcType.VARCHAR),
        @Result(column="real_asset_no", property="realAssetNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="real_asset_type", property="realAssetType", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_available", property="isAvailable", jdbcType=JdbcType.INTEGER),
        @Result(column="depict", property="depict", jdbcType=JdbcType.VARCHAR)
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
          "depict = #{depict,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(RealAsset record);
}