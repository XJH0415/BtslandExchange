package info.btsland.exchange.mapper;

import info.btsland.exchange.model.Allege;
import info.btsland.exchange.model.AllegeExample;
import info.btsland.exchange.model.AllegeExample.Criteria;
import info.btsland.exchange.model.AllegeExample.Criterion;

import java.util.List;
import java.util.Map;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class AllegeSqlProvider {

    public String countByExample(AllegeExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("allege");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(AllegeExample example) {
        BEGIN();
        DELETE_FROM("allege");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(Allege record) {
        BEGIN();
        INSERT_INTO("allege");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getAccount() != null) {
            VALUES("account", "#{account,jdbcType=VARCHAR}");
        }
        
        if (record.getDealerId() != null) {
            VALUES("dealer_id", "#{dealerId,jdbcType=VARCHAR}");
        }
        
        if (record.getDepict() != null) {
            VALUES("depict", "#{depict,jdbcType=VARCHAR}");
        }
        
        if (record.getNoteNo() != null) {
            VALUES("note_no", "#{noteNo,jdbcType=VARCHAR}");
        }
        
        if (record.getStatNo() != null) {
            VALUES("stat_no", "#{statNo,jdbcType=INTEGER}");
        }
        
        return SQL();
    }

    public String selectByExample(AllegeExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("account");
        SELECT("dealer_id");
        SELECT("depict");
        SELECT("note_no");
        SELECT("stat_no");
        FROM("allege");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Allege record = (Allege) parameter.get("record");
        AllegeExample example = (AllegeExample) parameter.get("example");
        
        BEGIN();
        UPDATE("allege");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getAccount() != null) {
            SET("account = #{record.account,jdbcType=VARCHAR}");
        }
        
        if (record.getDealerId() != null) {
            SET("dealer_id = #{record.dealerId,jdbcType=VARCHAR}");
        }
        
        if (record.getDepict() != null) {
            SET("depict = #{record.depict,jdbcType=VARCHAR}");
        }
        
        if (record.getNoteNo() != null) {
            SET("note_no = #{record.noteNo,jdbcType=VARCHAR}");
        }
        
        if (record.getStatNo() != null) {
            SET("stat_no = #{record.statNo,jdbcType=INTEGER}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("allege");
        
        SET("id = #{record.id,jdbcType=INTEGER}");
        SET("account = #{record.account,jdbcType=VARCHAR}");
        SET("dealer_id = #{record.dealerId,jdbcType=VARCHAR}");
        SET("depict = #{record.depict,jdbcType=VARCHAR}");
        SET("note_no = #{record.noteNo,jdbcType=VARCHAR}");
        SET("stat_no = #{record.statNo,jdbcType=INTEGER}");
        
        AllegeExample example = (AllegeExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(Allege record) {
        BEGIN();
        UPDATE("allege");
        
        if (record.getAccount() != null) {
            SET("account = #{account,jdbcType=VARCHAR}");
        }
        
        if (record.getDealerId() != null) {
            SET("dealer_id = #{dealerId,jdbcType=VARCHAR}");
        }
        
        if (record.getDepict() != null) {
            SET("depict = #{depict,jdbcType=VARCHAR}");
        }
        
        if (record.getNoteNo() != null) {
            SET("note_no = #{noteNo,jdbcType=VARCHAR}");
        }
        
        if (record.getStatNo() != null) {
            SET("stat_no = #{statNo,jdbcType=INTEGER}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }

    protected void applyWhere(AllegeExample example, boolean includeExamplePhrase) {
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