package info.btsland.exchange.model;

import java.util.ArrayList;
import java.util.List;

public class UserRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserRecordExample() {
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

        public Criteria andDealerIdIsNull() {
            addCriterion("dealer_id is null");
            return (Criteria) this;
        }

        public Criteria andDealerIdIsNotNull() {
            addCriterion("dealer_id is not null");
            return (Criteria) this;
        }

        public Criteria andDealerIdEqualTo(String value) {
            addCriterion("dealer_id =", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotEqualTo(String value) {
            addCriterion("dealer_id <>", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdGreaterThan(String value) {
            addCriterion("dealer_id >", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdGreaterThanOrEqualTo(String value) {
            addCriterion("dealer_id >=", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdLessThan(String value) {
            addCriterion("dealer_id <", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdLessThanOrEqualTo(String value) {
            addCriterion("dealer_id <=", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdLike(String value) {
            addCriterion("dealer_id like", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotLike(String value) {
            addCriterion("dealer_id not like", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdIn(List<String> values) {
            addCriterion("dealer_id in", values, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotIn(List<String> values) {
            addCriterion("dealer_id not in", values, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdBetween(String value1, String value2) {
            addCriterion("dealer_id between", value1, value2, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotBetween(String value1, String value2) {
            addCriterion("dealer_id not between", value1, value2, "dealerId");
            return (Criteria) this;
        }

        public Criteria andInClinchCountIsNull() {
            addCriterion("in_clinch_count is null");
            return (Criteria) this;
        }

        public Criteria andInClinchCountIsNotNull() {
            addCriterion("in_clinch_count is not null");
            return (Criteria) this;
        }

        public Criteria andInClinchCountEqualTo(Integer value) {
            addCriterion("in_clinch_count =", value, "inClinchCount");
            return (Criteria) this;
        }

        public Criteria andInClinchCountNotEqualTo(Integer value) {
            addCriterion("in_clinch_count <>", value, "inClinchCount");
            return (Criteria) this;
        }

        public Criteria andInClinchCountGreaterThan(Integer value) {
            addCriterion("in_clinch_count >", value, "inClinchCount");
            return (Criteria) this;
        }

        public Criteria andInClinchCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_clinch_count >=", value, "inClinchCount");
            return (Criteria) this;
        }

        public Criteria andInClinchCountLessThan(Integer value) {
            addCriterion("in_clinch_count <", value, "inClinchCount");
            return (Criteria) this;
        }

        public Criteria andInClinchCountLessThanOrEqualTo(Integer value) {
            addCriterion("in_clinch_count <=", value, "inClinchCount");
            return (Criteria) this;
        }

        public Criteria andInClinchCountIn(List<Integer> values) {
            addCriterion("in_clinch_count in", values, "inClinchCount");
            return (Criteria) this;
        }

        public Criteria andInClinchCountNotIn(List<Integer> values) {
            addCriterion("in_clinch_count not in", values, "inClinchCount");
            return (Criteria) this;
        }

        public Criteria andInClinchCountBetween(Integer value1, Integer value2) {
            addCriterion("in_clinch_count between", value1, value2, "inClinchCount");
            return (Criteria) this;
        }

        public Criteria andInClinchCountNotBetween(Integer value1, Integer value2) {
            addCriterion("in_clinch_count not between", value1, value2, "inClinchCount");
            return (Criteria) this;
        }

        public Criteria andInHavingCountIsNull() {
            addCriterion("in_having_count is null");
            return (Criteria) this;
        }

        public Criteria andInHavingCountIsNotNull() {
            addCriterion("in_having_count is not null");
            return (Criteria) this;
        }

        public Criteria andInHavingCountEqualTo(Integer value) {
            addCriterion("in_having_count =", value, "inHavingCount");
            return (Criteria) this;
        }

        public Criteria andInHavingCountNotEqualTo(Integer value) {
            addCriterion("in_having_count <>", value, "inHavingCount");
            return (Criteria) this;
        }

        public Criteria andInHavingCountGreaterThan(Integer value) {
            addCriterion("in_having_count >", value, "inHavingCount");
            return (Criteria) this;
        }

        public Criteria andInHavingCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_having_count >=", value, "inHavingCount");
            return (Criteria) this;
        }

        public Criteria andInHavingCountLessThan(Integer value) {
            addCriterion("in_having_count <", value, "inHavingCount");
            return (Criteria) this;
        }

        public Criteria andInHavingCountLessThanOrEqualTo(Integer value) {
            addCriterion("in_having_count <=", value, "inHavingCount");
            return (Criteria) this;
        }

        public Criteria andInHavingCountIn(List<Integer> values) {
            addCriterion("in_having_count in", values, "inHavingCount");
            return (Criteria) this;
        }

        public Criteria andInHavingCountNotIn(List<Integer> values) {
            addCriterion("in_having_count not in", values, "inHavingCount");
            return (Criteria) this;
        }

        public Criteria andInHavingCountBetween(Integer value1, Integer value2) {
            addCriterion("in_having_count between", value1, value2, "inHavingCount");
            return (Criteria) this;
        }

        public Criteria andInHavingCountNotBetween(Integer value1, Integer value2) {
            addCriterion("in_having_count not between", value1, value2, "inHavingCount");
            return (Criteria) this;
        }

        public Criteria andInClinchTotalIsNull() {
            addCriterion("in_clinch_total is null");
            return (Criteria) this;
        }

        public Criteria andInClinchTotalIsNotNull() {
            addCriterion("in_clinch_total is not null");
            return (Criteria) this;
        }

        public Criteria andInClinchTotalEqualTo(Double value) {
            addCriterion("in_clinch_total =", value, "inClinchTotal");
            return (Criteria) this;
        }

        public Criteria andInClinchTotalNotEqualTo(Double value) {
            addCriterion("in_clinch_total <>", value, "inClinchTotal");
            return (Criteria) this;
        }

        public Criteria andInClinchTotalGreaterThan(Double value) {
            addCriterion("in_clinch_total >", value, "inClinchTotal");
            return (Criteria) this;
        }

        public Criteria andInClinchTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("in_clinch_total >=", value, "inClinchTotal");
            return (Criteria) this;
        }

        public Criteria andInClinchTotalLessThan(Double value) {
            addCriterion("in_clinch_total <", value, "inClinchTotal");
            return (Criteria) this;
        }

        public Criteria andInClinchTotalLessThanOrEqualTo(Double value) {
            addCriterion("in_clinch_total <=", value, "inClinchTotal");
            return (Criteria) this;
        }

        public Criteria andInClinchTotalIn(List<Double> values) {
            addCriterion("in_clinch_total in", values, "inClinchTotal");
            return (Criteria) this;
        }

        public Criteria andInClinchTotalNotIn(List<Double> values) {
            addCriterion("in_clinch_total not in", values, "inClinchTotal");
            return (Criteria) this;
        }

        public Criteria andInClinchTotalBetween(Double value1, Double value2) {
            addCriterion("in_clinch_total between", value1, value2, "inClinchTotal");
            return (Criteria) this;
        }

        public Criteria andInClinchTotalNotBetween(Double value1, Double value2) {
            addCriterion("in_clinch_total not between", value1, value2, "inClinchTotal");
            return (Criteria) this;
        }

        public Criteria andInHavingTotalIsNull() {
            addCriterion("in_having_total is null");
            return (Criteria) this;
        }

        public Criteria andInHavingTotalIsNotNull() {
            addCriterion("in_having_total is not null");
            return (Criteria) this;
        }

        public Criteria andInHavingTotalEqualTo(Double value) {
            addCriterion("in_having_total =", value, "inHavingTotal");
            return (Criteria) this;
        }

        public Criteria andInHavingTotalNotEqualTo(Double value) {
            addCriterion("in_having_total <>", value, "inHavingTotal");
            return (Criteria) this;
        }

        public Criteria andInHavingTotalGreaterThan(Double value) {
            addCriterion("in_having_total >", value, "inHavingTotal");
            return (Criteria) this;
        }

        public Criteria andInHavingTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("in_having_total >=", value, "inHavingTotal");
            return (Criteria) this;
        }

        public Criteria andInHavingTotalLessThan(Double value) {
            addCriterion("in_having_total <", value, "inHavingTotal");
            return (Criteria) this;
        }

        public Criteria andInHavingTotalLessThanOrEqualTo(Double value) {
            addCriterion("in_having_total <=", value, "inHavingTotal");
            return (Criteria) this;
        }

        public Criteria andInHavingTotalIn(List<Double> values) {
            addCriterion("in_having_total in", values, "inHavingTotal");
            return (Criteria) this;
        }

        public Criteria andInHavingTotalNotIn(List<Double> values) {
            addCriterion("in_having_total not in", values, "inHavingTotal");
            return (Criteria) this;
        }

        public Criteria andInHavingTotalBetween(Double value1, Double value2) {
            addCriterion("in_having_total between", value1, value2, "inHavingTotal");
            return (Criteria) this;
        }

        public Criteria andInHavingTotalNotBetween(Double value1, Double value2) {
            addCriterion("in_having_total not between", value1, value2, "inHavingTotal");
            return (Criteria) this;
        }

        public Criteria andOutClinchCountIsNull() {
            addCriterion("out_clinch_count is null");
            return (Criteria) this;
        }

        public Criteria andOutClinchCountIsNotNull() {
            addCriterion("out_clinch_count is not null");
            return (Criteria) this;
        }

        public Criteria andOutClinchCountEqualTo(Integer value) {
            addCriterion("out_clinch_count =", value, "outClinchCount");
            return (Criteria) this;
        }

        public Criteria andOutClinchCountNotEqualTo(Integer value) {
            addCriterion("out_clinch_count <>", value, "outClinchCount");
            return (Criteria) this;
        }

        public Criteria andOutClinchCountGreaterThan(Integer value) {
            addCriterion("out_clinch_count >", value, "outClinchCount");
            return (Criteria) this;
        }

        public Criteria andOutClinchCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("out_clinch_count >=", value, "outClinchCount");
            return (Criteria) this;
        }

        public Criteria andOutClinchCountLessThan(Integer value) {
            addCriterion("out_clinch_count <", value, "outClinchCount");
            return (Criteria) this;
        }

        public Criteria andOutClinchCountLessThanOrEqualTo(Integer value) {
            addCriterion("out_clinch_count <=", value, "outClinchCount");
            return (Criteria) this;
        }

        public Criteria andOutClinchCountIn(List<Integer> values) {
            addCriterion("out_clinch_count in", values, "outClinchCount");
            return (Criteria) this;
        }

        public Criteria andOutClinchCountNotIn(List<Integer> values) {
            addCriterion("out_clinch_count not in", values, "outClinchCount");
            return (Criteria) this;
        }

        public Criteria andOutClinchCountBetween(Integer value1, Integer value2) {
            addCriterion("out_clinch_count between", value1, value2, "outClinchCount");
            return (Criteria) this;
        }

        public Criteria andOutClinchCountNotBetween(Integer value1, Integer value2) {
            addCriterion("out_clinch_count not between", value1, value2, "outClinchCount");
            return (Criteria) this;
        }

        public Criteria andOutHavingCountIsNull() {
            addCriterion("out_having_count is null");
            return (Criteria) this;
        }

        public Criteria andOutHavingCountIsNotNull() {
            addCriterion("out_having_count is not null");
            return (Criteria) this;
        }

        public Criteria andOutHavingCountEqualTo(Integer value) {
            addCriterion("out_having_count =", value, "outHavingCount");
            return (Criteria) this;
        }

        public Criteria andOutHavingCountNotEqualTo(Integer value) {
            addCriterion("out_having_count <>", value, "outHavingCount");
            return (Criteria) this;
        }

        public Criteria andOutHavingCountGreaterThan(Integer value) {
            addCriterion("out_having_count >", value, "outHavingCount");
            return (Criteria) this;
        }

        public Criteria andOutHavingCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("out_having_count >=", value, "outHavingCount");
            return (Criteria) this;
        }

        public Criteria andOutHavingCountLessThan(Integer value) {
            addCriterion("out_having_count <", value, "outHavingCount");
            return (Criteria) this;
        }

        public Criteria andOutHavingCountLessThanOrEqualTo(Integer value) {
            addCriterion("out_having_count <=", value, "outHavingCount");
            return (Criteria) this;
        }

        public Criteria andOutHavingCountIn(List<Integer> values) {
            addCriterion("out_having_count in", values, "outHavingCount");
            return (Criteria) this;
        }

        public Criteria andOutHavingCountNotIn(List<Integer> values) {
            addCriterion("out_having_count not in", values, "outHavingCount");
            return (Criteria) this;
        }

        public Criteria andOutHavingCountBetween(Integer value1, Integer value2) {
            addCriterion("out_having_count between", value1, value2, "outHavingCount");
            return (Criteria) this;
        }

        public Criteria andOutHavingCountNotBetween(Integer value1, Integer value2) {
            addCriterion("out_having_count not between", value1, value2, "outHavingCount");
            return (Criteria) this;
        }

        public Criteria andOutClinchTotalIsNull() {
            addCriterion("out_clinch_total is null");
            return (Criteria) this;
        }

        public Criteria andOutClinchTotalIsNotNull() {
            addCriterion("out_clinch_total is not null");
            return (Criteria) this;
        }

        public Criteria andOutClinchTotalEqualTo(Double value) {
            addCriterion("out_clinch_total =", value, "outClinchTotal");
            return (Criteria) this;
        }

        public Criteria andOutClinchTotalNotEqualTo(Double value) {
            addCriterion("out_clinch_total <>", value, "outClinchTotal");
            return (Criteria) this;
        }

        public Criteria andOutClinchTotalGreaterThan(Double value) {
            addCriterion("out_clinch_total >", value, "outClinchTotal");
            return (Criteria) this;
        }

        public Criteria andOutClinchTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("out_clinch_total >=", value, "outClinchTotal");
            return (Criteria) this;
        }

        public Criteria andOutClinchTotalLessThan(Double value) {
            addCriterion("out_clinch_total <", value, "outClinchTotal");
            return (Criteria) this;
        }

        public Criteria andOutClinchTotalLessThanOrEqualTo(Double value) {
            addCriterion("out_clinch_total <=", value, "outClinchTotal");
            return (Criteria) this;
        }

        public Criteria andOutClinchTotalIn(List<Double> values) {
            addCriterion("out_clinch_total in", values, "outClinchTotal");
            return (Criteria) this;
        }

        public Criteria andOutClinchTotalNotIn(List<Double> values) {
            addCriterion("out_clinch_total not in", values, "outClinchTotal");
            return (Criteria) this;
        }

        public Criteria andOutClinchTotalBetween(Double value1, Double value2) {
            addCriterion("out_clinch_total between", value1, value2, "outClinchTotal");
            return (Criteria) this;
        }

        public Criteria andOutClinchTotalNotBetween(Double value1, Double value2) {
            addCriterion("out_clinch_total not between", value1, value2, "outClinchTotal");
            return (Criteria) this;
        }

        public Criteria andOutHavingTotalIsNull() {
            addCriterion("out_having_total is null");
            return (Criteria) this;
        }

        public Criteria andOutHavingTotalIsNotNull() {
            addCriterion("out_having_total is not null");
            return (Criteria) this;
        }

        public Criteria andOutHavingTotalEqualTo(Double value) {
            addCriterion("out_having_total =", value, "outHavingTotal");
            return (Criteria) this;
        }

        public Criteria andOutHavingTotalNotEqualTo(Double value) {
            addCriterion("out_having_total <>", value, "outHavingTotal");
            return (Criteria) this;
        }

        public Criteria andOutHavingTotalGreaterThan(Double value) {
            addCriterion("out_having_total >", value, "outHavingTotal");
            return (Criteria) this;
        }

        public Criteria andOutHavingTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("out_having_total >=", value, "outHavingTotal");
            return (Criteria) this;
        }

        public Criteria andOutHavingTotalLessThan(Double value) {
            addCriterion("out_having_total <", value, "outHavingTotal");
            return (Criteria) this;
        }

        public Criteria andOutHavingTotalLessThanOrEqualTo(Double value) {
            addCriterion("out_having_total <=", value, "outHavingTotal");
            return (Criteria) this;
        }

        public Criteria andOutHavingTotalIn(List<Double> values) {
            addCriterion("out_having_total in", values, "outHavingTotal");
            return (Criteria) this;
        }

        public Criteria andOutHavingTotalNotIn(List<Double> values) {
            addCriterion("out_having_total not in", values, "outHavingTotal");
            return (Criteria) this;
        }

        public Criteria andOutHavingTotalBetween(Double value1, Double value2) {
            addCriterion("out_having_total between", value1, value2, "outHavingTotal");
            return (Criteria) this;
        }

        public Criteria andOutHavingTotalNotBetween(Double value1, Double value2) {
            addCriterion("out_having_total not between", value1, value2, "outHavingTotal");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Double value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Double value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Double value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Double value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Double value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Double value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Double> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Double> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Double value1, Double value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Double value1, Double value2) {
            addCriterion("time not between", value1, value2, "time");
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