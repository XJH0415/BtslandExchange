package info.btsland.exchange.mapper;

import info.btsland.exchange.model.UserRecord;
import info.btsland.exchange.model.UserRecordExample;
import info.btsland.exchange.model.UserRecordExample.Criteria;
import info.btsland.exchange.model.UserRecordExample.Criterion;

import java.util.List;
import java.util.Map;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class UserRecordSqlProvider {

    public String countByExample(UserRecordExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("user_record");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(UserRecordExample example) {
        BEGIN();
        DELETE_FROM("user_record");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(UserRecord record) {
        BEGIN();
        INSERT_INTO("user_record");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getDealerId() != null) {
            VALUES("dealer_id", "#{dealerId,jdbcType=VARCHAR}");
        }
        
        if (record.getInClinchCount() != null) {
            VALUES("in_clinch_count", "#{inClinchCount,jdbcType=INTEGER}");
        }
        
        if (record.getInHavingCount() != null) {
            VALUES("in_having_count", "#{inHavingCount,jdbcType=INTEGER}");
        }
        
        if (record.getInClinchTotal() != null) {
            VALUES("in_clinch_total", "#{inClinchTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getInHavingTotal() != null) {
            VALUES("in_having_total", "#{inHavingTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getOutClinchCount() != null) {
            VALUES("out_clinch_count", "#{outClinchCount,jdbcType=INTEGER}");
        }
        
        if (record.getOutHavingCount() != null) {
            VALUES("out_having_count", "#{outHavingCount,jdbcType=INTEGER}");
        }
        
        if (record.getOutClinchTotal() != null) {
            VALUES("out_clinch_total", "#{outClinchTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getOutHavingTotal() != null) {
            VALUES("out_having_total", "#{outHavingTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getTime() != null) {
            VALUES("time", "#{time,jdbcType=DOUBLE}");
        }
        
        return SQL();
    }

    public String selectByExample(UserRecordExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("dealer_id");
        SELECT("in_clinch_count");
        SELECT("in_having_count");
        SELECT("in_clinch_total");
        SELECT("in_having_total");
        SELECT("out_clinch_count");
        SELECT("out_having_count");
        SELECT("out_clinch_total");
        SELECT("out_having_total");
        SELECT("time");
        FROM("user_record");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        UserRecord record = (UserRecord) parameter.get("record");
        UserRecordExample example = (UserRecordExample) parameter.get("example");
        
        BEGIN();
        UPDATE("user_record");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getDealerId() != null) {
            SET("dealer_id = #{record.dealerId,jdbcType=VARCHAR}");
        }
        
        if (record.getInClinchCount() != null) {
            SET("in_clinch_count = #{record.inClinchCount,jdbcType=INTEGER}");
        }
        
        if (record.getInHavingCount() != null) {
            SET("in_having_count = #{record.inHavingCount,jdbcType=INTEGER}");
        }
        
        if (record.getInClinchTotal() != null) {
            SET("in_clinch_total = #{record.inClinchTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getInHavingTotal() != null) {
            SET("in_having_total = #{record.inHavingTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getOutClinchCount() != null) {
            SET("out_clinch_count = #{record.outClinchCount,jdbcType=INTEGER}");
        }
        
        if (record.getOutHavingCount() != null) {
            SET("out_having_count = #{record.outHavingCount,jdbcType=INTEGER}");
        }
        
        if (record.getOutClinchTotal() != null) {
            SET("out_clinch_total = #{record.outClinchTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getOutHavingTotal() != null) {
            SET("out_having_total = #{record.outHavingTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getTime() != null) {
            SET("time = #{record.time,jdbcType=DOUBLE}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("user_record");
        
        SET("id = #{record.id,jdbcType=INTEGER}");
        SET("dealer_id = #{record.dealerId,jdbcType=VARCHAR}");
        SET("in_clinch_count = #{record.inClinchCount,jdbcType=INTEGER}");
        SET("in_having_count = #{record.inHavingCount,jdbcType=INTEGER}");
        SET("in_clinch_total = #{record.inClinchTotal,jdbcType=DOUBLE}");
        SET("in_having_total = #{record.inHavingTotal,jdbcType=DOUBLE}");
        SET("out_clinch_count = #{record.outClinchCount,jdbcType=INTEGER}");
        SET("out_having_count = #{record.outHavingCount,jdbcType=INTEGER}");
        SET("out_clinch_total = #{record.outClinchTotal,jdbcType=DOUBLE}");
        SET("out_having_total = #{record.outHavingTotal,jdbcType=DOUBLE}");
        SET("time = #{record.time,jdbcType=DOUBLE}");
        
        UserRecordExample example = (UserRecordExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(UserRecord record) {
        BEGIN();
        UPDATE("user_record");
        
        if (record.getDealerId() != null) {
            SET("dealer_id = #{dealerId,jdbcType=VARCHAR}");
        }
        
        if (record.getInClinchCount() != null) {
            SET("in_clinch_count = #{inClinchCount,jdbcType=INTEGER}");
        }
        
        if (record.getInHavingCount() != null) {
            SET("in_having_count = #{inHavingCount,jdbcType=INTEGER}");
        }
        
        if (record.getInClinchTotal() != null) {
            SET("in_clinch_total = #{inClinchTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getInHavingTotal() != null) {
            SET("in_having_total = #{inHavingTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getOutClinchCount() != null) {
            SET("out_clinch_count = #{outClinchCount,jdbcType=INTEGER}");
        }
        
        if (record.getOutHavingCount() != null) {
            SET("out_having_count = #{outHavingCount,jdbcType=INTEGER}");
        }
        
        if (record.getOutClinchTotal() != null) {
            SET("out_clinch_total = #{outClinchTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getOutHavingTotal() != null) {
            SET("out_having_total = #{outHavingTotal,jdbcType=DOUBLE}");
        }
        
        if (record.getTime() != null) {
            SET("time = #{time,jdbcType=DOUBLE}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }

    protected void applyWhere(UserRecordExample example, boolean includeExamplePhrase) {
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