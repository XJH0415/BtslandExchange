package info.btsland.exchange.mapper;

import info.btsland.exchange.model.Note;
import info.btsland.exchange.model.NoteExample;
import info.btsland.exchange.model.NoteExample.Criteria;
import info.btsland.exchange.model.NoteExample.Criterion;

import java.util.List;
import java.util.Map;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class NoteSqlProvider {

    public String countByExample(NoteExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("note");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(NoteExample example) {
        BEGIN();
        DELETE_FROM("note");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(Note record) {
        BEGIN();
        INSERT_INTO("note");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getDealerId() != null) {
            VALUES("dealer_id", "#{dealerId,jdbcType=VARCHAR}");
        }
        
        if (record.getNoteNo() != null) {
            VALUES("note_no", "#{noteNo,jdbcType=VARCHAR}");
        }
        
        if (record.getAssetNum() != null) {
            VALUES("asset_num", "#{assetNum,jdbcType=DOUBLE}");
        }
        
        if (record.getAssetCoin() != null) {
            VALUES("asset_coin", "#{assetCoin,jdbcType=VARCHAR}");
        }
        
        if (record.getBrokerage() != null) {
            VALUES("brokerage", "#{brokerage,jdbcType=DOUBLE}");
        }
        
        if (record.getAccount() != null) {
            VALUES("account", "#{account,jdbcType=VARCHAR}");
        }
        
        if (record.getRealNo() != null) {
            VALUES("real_no", "#{realNo,jdbcType=VARCHAR}");
        }
        
        if (record.getRealType() != null) {
            VALUES("real_type", "#{realType,jdbcType=VARCHAR}");
        }
        
        if (record.getRealDepict() != null) {
            VALUES("real_depict", "#{realDepict,jdbcType=VARCHAR}");
        }
        
        if (record.getStartTime() != null) {
            VALUES("start_time", "#{startTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAccountReTime() != null) {
            VALUES("account_re_time", "#{accountReTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDealerReTime() != null) {
            VALUES("dealer_re_time", "#{dealerReTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEndTime() != null) {
            VALUES("end_time", "#{endTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRemarkCode() != null) {
            VALUES("remark_code", "#{remarkCode,jdbcType=VARCHAR}");
        }
        
        if (record.getStatNo() != null) {
            VALUES("stat_no", "#{statNo,jdbcType=INTEGER}");
        }
        
        if (record.getDepict() != null) {
            VALUES("depict", "#{depict,jdbcType=VARCHAR}");
        }
        
        if (record.getFlowPath() != null) {
            VALUES("flow_path", "#{flowPath,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    public String selectByExample(NoteExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("dealer_id");
        SELECT("note_no");
        SELECT("asset_num");
        SELECT("asset_coin");
        SELECT("brokerage");
        SELECT("account");
        SELECT("real_no");
        SELECT("real_type");
        SELECT("real_depict");
        SELECT("start_time");
        SELECT("account_re_time");
        SELECT("dealer_re_time");
        SELECT("end_time");
        SELECT("remark_code");
        SELECT("stat_no");
        SELECT("depict");
        SELECT("flow_path");
        FROM("note");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Note record = (Note) parameter.get("record");
        NoteExample example = (NoteExample) parameter.get("example");
        
        BEGIN();
        UPDATE("note");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getDealerId() != null) {
            SET("dealer_id = #{record.dealerId,jdbcType=VARCHAR}");
        }
        
        if (record.getNoteNo() != null) {
            SET("note_no = #{record.noteNo,jdbcType=VARCHAR}");
        }
        
        if (record.getAssetNum() != null) {
            SET("asset_num = #{record.assetNum,jdbcType=DOUBLE}");
        }
        
        if (record.getAssetCoin() != null) {
            SET("asset_coin = #{record.assetCoin,jdbcType=VARCHAR}");
        }
        
        if (record.getBrokerage() != null) {
            SET("brokerage = #{record.brokerage,jdbcType=DOUBLE}");
        }
        
        if (record.getAccount() != null) {
            SET("account = #{record.account,jdbcType=VARCHAR}");
        }
        
        if (record.getRealNo() != null) {
            SET("real_no = #{record.realNo,jdbcType=VARCHAR}");
        }
        
        if (record.getRealType() != null) {
            SET("real_type = #{record.realType,jdbcType=VARCHAR}");
        }
        
        if (record.getRealDepict() != null) {
            SET("real_depict = #{record.realDepict,jdbcType=VARCHAR}");
        }
        
        if (record.getStartTime() != null) {
            SET("start_time = #{record.startTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAccountReTime() != null) {
            SET("account_re_time = #{record.accountReTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDealerReTime() != null) {
            SET("dealer_re_time = #{record.dealerReTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEndTime() != null) {
            SET("end_time = #{record.endTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRemarkCode() != null) {
            SET("remark_code = #{record.remarkCode,jdbcType=VARCHAR}");
        }
        
        if (record.getStatNo() != null) {
            SET("stat_no = #{record.statNo,jdbcType=INTEGER}");
        }
        
        if (record.getDepict() != null) {
            SET("depict = #{record.depict,jdbcType=VARCHAR}");
        }
        
        if (record.getFlowPath() != null) {
            SET("flow_path = #{record.flowPath,jdbcType=VARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("note");
        
        SET("id = #{record.id,jdbcType=INTEGER}");
        SET("dealer_id = #{record.dealerId,jdbcType=VARCHAR}");
        SET("note_no = #{record.noteNo,jdbcType=VARCHAR}");
        SET("asset_num = #{record.assetNum,jdbcType=DOUBLE}");
        SET("asset_coin = #{record.assetCoin,jdbcType=VARCHAR}");
        SET("brokerage = #{record.brokerage,jdbcType=DOUBLE}");
        SET("account = #{record.account,jdbcType=VARCHAR}");
        SET("real_no = #{record.realNo,jdbcType=VARCHAR}");
        SET("real_type = #{record.realType,jdbcType=VARCHAR}");
        SET("real_depict = #{record.realDepict,jdbcType=VARCHAR}");
        SET("start_time = #{record.startTime,jdbcType=TIMESTAMP}");
        SET("account_re_time = #{record.accountReTime,jdbcType=TIMESTAMP}");
        SET("dealer_re_time = #{record.dealerReTime,jdbcType=TIMESTAMP}");
        SET("end_time = #{record.endTime,jdbcType=TIMESTAMP}");
        SET("remark_code = #{record.remarkCode,jdbcType=VARCHAR}");
        SET("stat_no = #{record.statNo,jdbcType=INTEGER}");
        SET("depict = #{record.depict,jdbcType=VARCHAR}");
        SET("flow_path = #{record.flowPath,jdbcType=VARCHAR}");
        
        NoteExample example = (NoteExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(Note record) {
        BEGIN();
        UPDATE("note");
        
        if (record.getDealerId() != null) {
            SET("dealer_id = #{dealerId,jdbcType=VARCHAR}");
        }
        
        if (record.getNoteNo() != null) {
            SET("note_no = #{noteNo,jdbcType=VARCHAR}");
        }
        
        if (record.getAssetNum() != null) {
            SET("asset_num = #{assetNum,jdbcType=DOUBLE}");
        }
        
        if (record.getAssetCoin() != null) {
            SET("asset_coin = #{assetCoin,jdbcType=VARCHAR}");
        }
        
        if (record.getBrokerage() != null) {
            SET("brokerage = #{brokerage,jdbcType=DOUBLE}");
        }
        
        if (record.getAccount() != null) {
            SET("account = #{account,jdbcType=VARCHAR}");
        }
        
        if (record.getRealNo() != null) {
            SET("real_no = #{realNo,jdbcType=VARCHAR}");
        }
        
        if (record.getRealType() != null) {
            SET("real_type = #{realType,jdbcType=VARCHAR}");
        }
        
        if (record.getRealDepict() != null) {
            SET("real_depict = #{realDepict,jdbcType=VARCHAR}");
        }
        
        if (record.getStartTime() != null) {
            SET("start_time = #{startTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAccountReTime() != null) {
            SET("account_re_time = #{accountReTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDealerReTime() != null) {
            SET("dealer_re_time = #{dealerReTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEndTime() != null) {
            SET("end_time = #{endTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRemarkCode() != null) {
            SET("remark_code = #{remarkCode,jdbcType=VARCHAR}");
        }
        
        if (record.getStatNo() != null) {
            SET("stat_no = #{statNo,jdbcType=INTEGER}");
        }
        
        if (record.getDepict() != null) {
            SET("depict = #{depict,jdbcType=VARCHAR}");
        }
        
        if (record.getFlowPath() != null) {
            SET("flow_path = #{flowPath,jdbcType=VARCHAR}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }

    protected void applyWhere(NoteExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}