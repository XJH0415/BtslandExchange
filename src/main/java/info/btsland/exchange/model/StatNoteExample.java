package info.btsland.exchange.model;

import java.util.ArrayList;
import java.util.List;

public class StatNoteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StatNoteExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStatNoIsNull() {
            addCriterion("stat_no is null");
            return (Criteria) this;
        }

        public Criteria andStatNoIsNotNull() {
            addCriterion("stat_no is not null");
            return (Criteria) this;
        }

        public Criteria andStatNoEqualTo(Integer value) {
            addCriterion("stat_no =", value, "statNo");
            return (Criteria) this;
        }

        public Criteria andStatNoNotEqualTo(Integer value) {
            addCriterion("stat_no <>", value, "statNo");
            return (Criteria) this;
        }

        public Criteria andStatNoGreaterThan(Integer value) {
            addCriterion("stat_no >", value, "statNo");
            return (Criteria) this;
        }

        public Criteria andStatNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("stat_no >=", value, "statNo");
            return (Criteria) this;
        }

        public Criteria andStatNoLessThan(Integer value) {
            addCriterion("stat_no <", value, "statNo");
            return (Criteria) this;
        }

        public Criteria andStatNoLessThanOrEqualTo(Integer value) {
            addCriterion("stat_no <=", value, "statNo");
            return (Criteria) this;
        }

        public Criteria andStatNoIn(List<Integer> values) {
            addCriterion("stat_no in", values, "statNo");
            return (Criteria) this;
        }

        public Criteria andStatNoNotIn(List<Integer> values) {
            addCriterion("stat_no not in", values, "statNo");
            return (Criteria) this;
        }

        public Criteria andStatNoBetween(Integer value1, Integer value2) {
            addCriterion("stat_no between", value1, value2, "statNo");
            return (Criteria) this;
        }

        public Criteria andStatNoNotBetween(Integer value1, Integer value2) {
            addCriterion("stat_no not between", value1, value2, "statNo");
            return (Criteria) this;
        }

        public Criteria andDepictIsNull() {
            addCriterion("depict is null");
            return (Criteria) this;
        }

        public Criteria andDepictIsNotNull() {
            addCriterion("depict is not null");
            return (Criteria) this;
        }

        public Criteria andDepictEqualTo(String value) {
            addCriterion("depict =", value, "depict");
            return (Criteria) this;
        }

        public Criteria andDepictNotEqualTo(String value) {
            addCriterion("depict <>", value, "depict");
            return (Criteria) this;
        }

        public Criteria andDepictGreaterThan(String value) {
            addCriterion("depict >", value, "depict");
            return (Criteria) this;
        }

        public Criteria andDepictGreaterThanOrEqualTo(String value) {
            addCriterion("depict >=", value, "depict");
            return (Criteria) this;
        }

        public Criteria andDepictLessThan(String value) {
            addCriterion("depict <", value, "depict");
            return (Criteria) this;
        }

        public Criteria andDepictLessThanOrEqualTo(String value) {
            addCriterion("depict <=", value, "depict");
            return (Criteria) this;
        }

        public Criteria andDepictLike(String value) {
            addCriterion("depict like", value, "depict");
            return (Criteria) this;
        }

        public Criteria andDepictNotLike(String value) {
            addCriterion("depict not like", value, "depict");
            return (Criteria) this;
        }

        public Criteria andDepictIn(List<String> values) {
            addCriterion("depict in", values, "depict");
            return (Criteria) this;
        }

        public Criteria andDepictNotIn(List<String> values) {
            addCriterion("depict not in", values, "depict");
            return (Criteria) this;
        }

        public Criteria andDepictBetween(String value1, String value2) {
            addCriterion("depict between", value1, value2, "depict");
            return (Criteria) this;
        }

        public Criteria andDepictNotBetween(String value1, String value2) {
            addCriterion("depict not between", value1, value2, "depict");
            return (Criteria) this;
        }

        public Criteria andTabIsNull() {
            addCriterion("tab is null");
            return (Criteria) this;
        }

        public Criteria andTabIsNotNull() {
            addCriterion("tab is not null");
            return (Criteria) this;
        }

        public Criteria andTabEqualTo(String value) {
            addCriterion("tab =", value, "tab");
            return (Criteria) this;
        }

        public Criteria andTabNotEqualTo(String value) {
            addCriterion("tab <>", value, "tab");
            return (Criteria) this;
        }

        public Criteria andTabGreaterThan(String value) {
            addCriterion("tab >", value, "tab");
            return (Criteria) this;
        }

        public Criteria andTabGreaterThanOrEqualTo(String value) {
            addCriterion("tab >=", value, "tab");
            return (Criteria) this;
        }

        public Criteria andTabLessThan(String value) {
            addCriterion("tab <", value, "tab");
            return (Criteria) this;
        }

        public Criteria andTabLessThanOrEqualTo(String value) {
            addCriterion("tab <=", value, "tab");
            return (Criteria) this;
        }

        public Criteria andTabLike(String value) {
            addCriterion("tab like", value, "tab");
            return (Criteria) this;
        }

        public Criteria andTabNotLike(String value) {
            addCriterion("tab not like", value, "tab");
            return (Criteria) this;
        }

        public Criteria andTabIn(List<String> values) {
            addCriterion("tab in", values, "tab");
            return (Criteria) this;
        }

        public Criteria andTabNotIn(List<String> values) {
            addCriterion("tab not in", values, "tab");
            return (Criteria) this;
        }

        public Criteria andTabBetween(String value1, String value2) {
            addCriterion("tab between", value1, value2, "tab");
            return (Criteria) this;
        }

        public Criteria andTabNotBetween(String value1, String value2) {
            addCriterion("tab not between", value1, value2, "tab");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}