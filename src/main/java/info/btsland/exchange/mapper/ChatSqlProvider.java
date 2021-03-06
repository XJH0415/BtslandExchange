package info.btsland.exchange.mapper;

import info.btsland.exchange.model.Chat;
import info.btsland.exchange.model.ChatExample;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import java.util.List;
import java.util.Map;

public class ChatSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chat
     *
     * @mbggenerated
     */
    public String countByExample(ChatExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("chat");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chat
     *
     * @mbggenerated
     */
    public String deleteByExample(ChatExample example) {
        BEGIN();
        DELETE_FROM("chat");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chat
     *
     * @mbggenerated
     */
    public String insertSelective(Chat record) {
        BEGIN();
        INSERT_INTO("chat");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getFromUser() != null) {
            VALUES("from_user", "#{fromUser,jdbcType=VARCHAR}");
        }
        
        if (record.getToUser() != null) {
            VALUES("to_user", "#{toUser,jdbcType=VARCHAR}");
        }
        
        if (record.getContext() != null) {
            VALUES("context", "#{context,jdbcType=VARCHAR}");
        }
        
        if (record.getTime() != null) {
            VALUES("time", "#{time,jdbcType=TIMESTAMP}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chat
     *
     * @mbggenerated
     */
    public String selectByExample(ChatExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("from_user");
        SELECT("to_user");
        SELECT("context");
        SELECT("time");
        FROM("chat");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chat
     *
     * @mbggenerated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        Chat record = (Chat) parameter.get("record");
        ChatExample example = (ChatExample) parameter.get("example");
        
        BEGIN();
        UPDATE("chat");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getFromUser() != null) {
            SET("from_user = #{record.fromUser,jdbcType=VARCHAR}");
        }
        
        if (record.getToUser() != null) {
            SET("to_user = #{record.toUser,jdbcType=VARCHAR}");
        }
        
        if (record.getContext() != null) {
            SET("context = #{record.context,jdbcType=VARCHAR}");
        }
        
        if (record.getTime() != null) {
            SET("time = #{record.time,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chat
     *
     * @mbggenerated
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("chat");
        
        SET("id = #{record.id,jdbcType=INTEGER}");
        SET("from_user = #{record.fromUser,jdbcType=VARCHAR}");
        SET("to_user = #{record.toUser,jdbcType=VARCHAR}");
        SET("context = #{record.context,jdbcType=VARCHAR}");
        SET("time = #{record.time,jdbcType=TIMESTAMP}");
        
        ChatExample example = (ChatExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chat
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(Chat record) {
        BEGIN();
        UPDATE("chat");
        
        if (record.getFromUser() != null) {
            SET("from_user = #{fromUser,jdbcType=VARCHAR}");
        }
        
        if (record.getToUser() != null) {
            SET("to_user = #{toUser,jdbcType=VARCHAR}");
        }
        
        if (record.getContext() != null) {
            SET("context = #{context,jdbcType=VARCHAR}");
        }
        
        if (record.getTime() != null) {
            SET("time = #{time,jdbcType=TIMESTAMP}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chat
     *
     * @mbggenerated
     */
    protected void applyWhere(ChatExample example, boolean includeExamplePhrase) {
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
        List<ChatExample.Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            ChatExample.Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<ChatExample.Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    ChatExample.Criterion criterion = criterions.get(j);
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