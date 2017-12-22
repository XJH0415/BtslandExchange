package info.btsland.exchange.mapper;

import info.btsland.exchange.model.User;
import info.btsland.exchange.model.UserExample;
import info.btsland.exchange.model.UserExample.Criteria;
import info.btsland.exchange.model.UserExample.Criterion;

import java.util.List;
import java.util.Map;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class UserSqlProvider {

    public String countByExample(UserExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("user");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(UserExample example) {
        BEGIN();
        DELETE_FROM("user");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(User record) {
        BEGIN();
        INSERT_INTO("user");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getDealerId() != null) {
            VALUES("dealer_id", "#{dealerId,jdbcType=VARCHAR}");
        }
        
        if (record.getDealerName() != null) {
            VALUES("dealer_name", "#{dealerName,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            VALUES("password", "#{password,jdbcType=VARCHAR}");
        }
        
        if (record.getAccount() != null) {
            VALUES("account", "#{account,jdbcType=VARCHAR}");
        }
        
        if (record.getBrokerageIn() != null) {
            VALUES("brokerage_in", "#{brokerageIn,jdbcType=DOUBLE}");
        }
        
        if (record.getBrokerageOut() != null) {
            VALUES("brokerage_out", "#{brokerageOut,jdbcType=DOUBLE}");
        }
        
        if (record.getDepict() != null) {
            VALUES("depict", "#{depict,jdbcType=VARCHAR}");
        }
        
        if (record.getStat() != null) {
            VALUES("stat", "#{stat,jdbcType=INTEGER}");
        }
        
        if (record.getType() != null) {
            VALUES("type", "#{type,jdbcType=INTEGER}");
        }
        
        if (record.getLowerLimitIn() != null) {
            VALUES("lower_limit_in", "#{lowerLimitIn,jdbcType=DOUBLE}");
        }
        
        if (record.getUpperLimitOut() != null) {
            VALUES("upper_limit_out", "#{upperLimitOut,jdbcType=DOUBLE}");
        }
        
        if (record.getLowerLimitOut() != null) {
            VALUES("lower_limit_out", "#{lowerLimitOut,jdbcType=DOUBLE}");
        }
        
        return SQL();
    }

    public String selectByExample(UserExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("dealer_id");
        SELECT("dealer_name");
        SELECT("password");
        SELECT("account");
        SELECT("brokerage_in");
        SELECT("brokerage_out");
        SELECT("depict");
        SELECT("stat");
        SELECT("type");
        SELECT("lower_limit_in");
        SELECT("upper_limit_out");
        SELECT("lower_limit_out");
        FROM("user");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        User record = (User) parameter.get("record");
        UserExample example = (UserExample) parameter.get("example");
        
        BEGIN();
        UPDATE("user");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getDealerId() != null) {
            SET("dealer_id = #{record.dealerId,jdbcType=VARCHAR}");
        }
        
        if (record.getDealerName() != null) {
            SET("dealer_name = #{record.dealerName,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            SET("password = #{record.password,jdbcType=VARCHAR}");
        }
        
        if (record.getAccount() != null) {
            SET("account = #{record.account,jdbcType=VARCHAR}");
        }
        
        if (record.getBrokerageIn() != null) {
            SET("brokerage_in = #{record.brokerageIn,jdbcType=DOUBLE}");
        }
        
        if (record.getBrokerageOut() != null) {
            SET("brokerage_out = #{record.brokerageOut,jdbcType=DOUBLE}");
        }
        
        if (record.getDepict() != null) {
            SET("depict = #{record.depict,jdbcType=VARCHAR}");
        }
        
        if (record.getStat() != null) {
            SET("stat = #{record.stat,jdbcType=INTEGER}");
        }
        
        if (record.getType() != null) {
            SET("type = #{record.type,jdbcType=INTEGER}");
        }
        
        if (record.getLowerLimitIn() != null) {
            SET("lower_limit_in = #{record.lowerLimitIn,jdbcType=DOUBLE}");
        }
        
        if (record.getUpperLimitOut() != null) {
            SET("upper_limit_out = #{record.upperLimitOut,jdbcType=DOUBLE}");
        }
        
        if (record.getLowerLimitOut() != null) {
            SET("lower_limit_out = #{record.lowerLimitOut,jdbcType=DOUBLE}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("user");
        
        SET("id = #{record.id,jdbcType=INTEGER}");
        SET("dealer_id = #{record.dealerId,jdbcType=VARCHAR}");
        SET("dealer_name = #{record.dealerName,jdbcType=VARCHAR}");
        SET("password = #{record.password,jdbcType=VARCHAR}");
        SET("account = #{record.account,jdbcType=VARCHAR}");
        SET("brokerage_in = #{record.brokerageIn,jdbcType=DOUBLE}");
        SET("brokerage_out = #{record.brokerageOut,jdbcType=DOUBLE}");
        SET("depict = #{record.depict,jdbcType=VARCHAR}");
        SET("stat = #{record.stat,jdbcType=INTEGER}");
        SET("type = #{record.type,jdbcType=INTEGER}");
        SET("lower_limit_in = #{record.lowerLimitIn,jdbcType=DOUBLE}");
        SET("upper_limit_out = #{record.upperLimitOut,jdbcType=DOUBLE}");
        SET("lower_limit_out = #{record.lowerLimitOut,jdbcType=DOUBLE}");
        
        UserExample example = (UserExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(User record) {
        BEGIN();
        UPDATE("user");
        
        if (record.getDealerId() != null) {
            SET("dealer_id = #{dealerId,jdbcType=VARCHAR}");
        }
        
        if (record.getDealerName() != null) {
            SET("dealer_name = #{dealerName,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            SET("password = #{password,jdbcType=VARCHAR}");
        }
        
        if (record.getAccount() != null) {
            SET("account = #{account,jdbcType=VARCHAR}");
        }
        
        if (record.getBrokerageIn() != null) {
            SET("brokerage_in = #{brokerageIn,jdbcType=DOUBLE}");
        }
        
        if (record.getBrokerageOut() != null) {
            SET("brokerage_out = #{brokerageOut,jdbcType=DOUBLE}");
        }
        
        if (record.getDepict() != null) {
            SET("depict = #{depict,jdbcType=VARCHAR}");
        }
        
        if (record.getStat() != null) {
            SET("stat = #{stat,jdbcType=INTEGER}");
        }
        
        if (record.getType() != null) {
            SET("type = #{type,jdbcType=INTEGER}");
        }
        
        if (record.getLowerLimitIn() != null) {
            SET("lower_limit_in = #{lowerLimitIn,jdbcType=DOUBLE}");
        }
        
        if (record.getUpperLimitOut() != null) {
            SET("upper_limit_out = #{upperLimitOut,jdbcType=DOUBLE}");
        }
        
        if (record.getLowerLimitOut() != null) {
            SET("lower_limit_out = #{lowerLimitOut,jdbcType=DOUBLE}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }

    protected void applyWhere(UserExample example, boolean includeExamplePhrase) {
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