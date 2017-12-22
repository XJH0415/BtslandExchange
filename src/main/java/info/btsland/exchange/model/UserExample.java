package info.btsland.exchange.model;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andDealerNameIsNull() {
            addCriterion("dealer_name is null");
            return (Criteria) this;
        }

        public Criteria andDealerNameIsNotNull() {
            addCriterion("dealer_name is not null");
            return (Criteria) this;
        }

        public Criteria andDealerNameEqualTo(String value) {
            addCriterion("dealer_name =", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameNotEqualTo(String value) {
            addCriterion("dealer_name <>", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameGreaterThan(String value) {
            addCriterion("dealer_name >", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameGreaterThanOrEqualTo(String value) {
            addCriterion("dealer_name >=", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameLessThan(String value) {
            addCriterion("dealer_name <", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameLessThanOrEqualTo(String value) {
            addCriterion("dealer_name <=", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameLike(String value) {
            addCriterion("dealer_name like", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameNotLike(String value) {
            addCriterion("dealer_name not like", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameIn(List<String> values) {
            addCriterion("dealer_name in", values, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameNotIn(List<String> values) {
            addCriterion("dealer_name not in", values, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameBetween(String value1, String value2) {
            addCriterion("dealer_name between", value1, value2, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameNotBetween(String value1, String value2) {
            addCriterion("dealer_name not between", value1, value2, "dealerName");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andBrokerageInIsNull() {
            addCriterion("brokerage_in is null");
            return (Criteria) this;
        }

        public Criteria andBrokerageInIsNotNull() {
            addCriterion("brokerage_in is not null");
            return (Criteria) this;
        }

        public Criteria andBrokerageInEqualTo(Double value) {
            addCriterion("brokerage_in =", value, "brokerageIn");
            return (Criteria) this;
        }

        public Criteria andBrokerageInNotEqualTo(Double value) {
            addCriterion("brokerage_in <>", value, "brokerageIn");
            return (Criteria) this;
        }

        public Criteria andBrokerageInGreaterThan(Double value) {
            addCriterion("brokerage_in >", value, "brokerageIn");
            return (Criteria) this;
        }

        public Criteria andBrokerageInGreaterThanOrEqualTo(Double value) {
            addCriterion("brokerage_in >=", value, "brokerageIn");
            return (Criteria) this;
        }

        public Criteria andBrokerageInLessThan(Double value) {
            addCriterion("brokerage_in <", value, "brokerageIn");
            return (Criteria) this;
        }

        public Criteria andBrokerageInLessThanOrEqualTo(Double value) {
            addCriterion("brokerage_in <=", value, "brokerageIn");
            return (Criteria) this;
        }

        public Criteria andBrokerageInIn(List<Double> values) {
            addCriterion("brokerage_in in", values, "brokerageIn");
            return (Criteria) this;
        }

        public Criteria andBrokerageInNotIn(List<Double> values) {
            addCriterion("brokerage_in not in", values, "brokerageIn");
            return (Criteria) this;
        }

        public Criteria andBrokerageInBetween(Double value1, Double value2) {
            addCriterion("brokerage_in between", value1, value2, "brokerageIn");
            return (Criteria) this;
        }

        public Criteria andBrokerageInNotBetween(Double value1, Double value2) {
            addCriterion("brokerage_in not between", value1, value2, "brokerageIn");
            return (Criteria) this;
        }

        public Criteria andBrokerageOutIsNull() {
            addCriterion("brokerage_out is null");
            return (Criteria) this;
        }

        public Criteria andBrokerageOutIsNotNull() {
            addCriterion("brokerage_out is not null");
            return (Criteria) this;
        }

        public Criteria andBrokerageOutEqualTo(Double value) {
            addCriterion("brokerage_out =", value, "brokerageOut");
            return (Criteria) this;
        }

        public Criteria andBrokerageOutNotEqualTo(Double value) {
            addCriterion("brokerage_out <>", value, "brokerageOut");
            return (Criteria) this;
        }

        public Criteria andBrokerageOutGreaterThan(Double value) {
            addCriterion("brokerage_out >", value, "brokerageOut");
            return (Criteria) this;
        }

        public Criteria andBrokerageOutGreaterThanOrEqualTo(Double value) {
            addCriterion("brokerage_out >=", value, "brokerageOut");
            return (Criteria) this;
        }

        public Criteria andBrokerageOutLessThan(Double value) {
            addCriterion("brokerage_out <", value, "brokerageOut");
            return (Criteria) this;
        }

        public Criteria andBrokerageOutLessThanOrEqualTo(Double value) {
            addCriterion("brokerage_out <=", value, "brokerageOut");
            return (Criteria) this;
        }

        public Criteria andBrokerageOutIn(List<Double> values) {
            addCriterion("brokerage_out in", values, "brokerageOut");
            return (Criteria) this;
        }

        public Criteria andBrokerageOutNotIn(List<Double> values) {
            addCriterion("brokerage_out not in", values, "brokerageOut");
            return (Criteria) this;
        }

        public Criteria andBrokerageOutBetween(Double value1, Double value2) {
            addCriterion("brokerage_out between", value1, value2, "brokerageOut");
            return (Criteria) this;
        }

        public Criteria andBrokerageOutNotBetween(Double value1, Double value2) {
            addCriterion("brokerage_out not between", value1, value2, "brokerageOut");
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

        public Criteria andStatIsNull() {
            addCriterion("stat is null");
            return (Criteria) this;
        }

        public Criteria andStatIsNotNull() {
            addCriterion("stat is not null");
            return (Criteria) this;
        }

        public Criteria andStatEqualTo(Integer value) {
            addCriterion("stat =", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatNotEqualTo(Integer value) {
            addCriterion("stat <>", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatGreaterThan(Integer value) {
            addCriterion("stat >", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatGreaterThanOrEqualTo(Integer value) {
            addCriterion("stat >=", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatLessThan(Integer value) {
            addCriterion("stat <", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatLessThanOrEqualTo(Integer value) {
            addCriterion("stat <=", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatIn(List<Integer> values) {
            addCriterion("stat in", values, "stat");
            return (Criteria) this;
        }

        public Criteria andStatNotIn(List<Integer> values) {
            addCriterion("stat not in", values, "stat");
            return (Criteria) this;
        }

        public Criteria andStatBetween(Integer value1, Integer value2) {
            addCriterion("stat between", value1, value2, "stat");
            return (Criteria) this;
        }

        public Criteria andStatNotBetween(Integer value1, Integer value2) {
            addCriterion("stat not between", value1, value2, "stat");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andLowerLimitInIsNull() {
            addCriterion("lower_limit_in is null");
            return (Criteria) this;
        }

        public Criteria andLowerLimitInIsNotNull() {
            addCriterion("lower_limit_in is not null");
            return (Criteria) this;
        }

        public Criteria andLowerLimitInEqualTo(Double value) {
            addCriterion("lower_limit_in =", value, "lowerLimitIn");
            return (Criteria) this;
        }

        public Criteria andLowerLimitInNotEqualTo(Double value) {
            addCriterion("lower_limit_in <>", value, "lowerLimitIn");
            return (Criteria) this;
        }

        public Criteria andLowerLimitInGreaterThan(Double value) {
            addCriterion("lower_limit_in >", value, "lowerLimitIn");
            return (Criteria) this;
        }

        public Criteria andLowerLimitInGreaterThanOrEqualTo(Double value) {
            addCriterion("lower_limit_in >=", value, "lowerLimitIn");
            return (Criteria) this;
        }

        public Criteria andLowerLimitInLessThan(Double value) {
            addCriterion("lower_limit_in <", value, "lowerLimitIn");
            return (Criteria) this;
        }

        public Criteria andLowerLimitInLessThanOrEqualTo(Double value) {
            addCriterion("lower_limit_in <=", value, "lowerLimitIn");
            return (Criteria) this;
        }

        public Criteria andLowerLimitInIn(List<Double> values) {
            addCriterion("lower_limit_in in", values, "lowerLimitIn");
            return (Criteria) this;
        }

        public Criteria andLowerLimitInNotIn(List<Double> values) {
            addCriterion("lower_limit_in not in", values, "lowerLimitIn");
            return (Criteria) this;
        }

        public Criteria andLowerLimitInBetween(Double value1, Double value2) {
            addCriterion("lower_limit_in between", value1, value2, "lowerLimitIn");
            return (Criteria) this;
        }

        public Criteria andLowerLimitInNotBetween(Double value1, Double value2) {
            addCriterion("lower_limit_in not between", value1, value2, "lowerLimitIn");
            return (Criteria) this;
        }

        public Criteria andUpperLimitOutIsNull() {
            addCriterion("upper_limit_out is null");
            return (Criteria) this;
        }

        public Criteria andUpperLimitOutIsNotNull() {
            addCriterion("upper_limit_out is not null");
            return (Criteria) this;
        }

        public Criteria andUpperLimitOutEqualTo(Double value) {
            addCriterion("upper_limit_out =", value, "upperLimitOut");
            return (Criteria) this;
        }

        public Criteria andUpperLimitOutNotEqualTo(Double value) {
            addCriterion("upper_limit_out <>", value, "upperLimitOut");
            return (Criteria) this;
        }

        public Criteria andUpperLimitOutGreaterThan(Double value) {
            addCriterion("upper_limit_out >", value, "upperLimitOut");
            return (Criteria) this;
        }

        public Criteria andUpperLimitOutGreaterThanOrEqualTo(Double value) {
            addCriterion("upper_limit_out >=", value, "upperLimitOut");
            return (Criteria) this;
        }

        public Criteria andUpperLimitOutLessThan(Double value) {
            addCriterion("upper_limit_out <", value, "upperLimitOut");
            return (Criteria) this;
        }

        public Criteria andUpperLimitOutLessThanOrEqualTo(Double value) {
            addCriterion("upper_limit_out <=", value, "upperLimitOut");
            return (Criteria) this;
        }

        public Criteria andUpperLimitOutIn(List<Double> values) {
            addCriterion("upper_limit_out in", values, "upperLimitOut");
            return (Criteria) this;
        }

        public Criteria andUpperLimitOutNotIn(List<Double> values) {
            addCriterion("upper_limit_out not in", values, "upperLimitOut");
            return (Criteria) this;
        }

        public Criteria andUpperLimitOutBetween(Double value1, Double value2) {
            addCriterion("upper_limit_out between", value1, value2, "upperLimitOut");
            return (Criteria) this;
        }

        public Criteria andUpperLimitOutNotBetween(Double value1, Double value2) {
            addCriterion("upper_limit_out not between", value1, value2, "upperLimitOut");
            return (Criteria) this;
        }

        public Criteria andLowerLimitOutIsNull() {
            addCriterion("lower_limit_out is null");
            return (Criteria) this;
        }

        public Criteria andLowerLimitOutIsNotNull() {
            addCriterion("lower_limit_out is not null");
            return (Criteria) this;
        }

        public Criteria andLowerLimitOutEqualTo(Double value) {
            addCriterion("lower_limit_out =", value, "lowerLimitOut");
            return (Criteria) this;
        }

        public Criteria andLowerLimitOutNotEqualTo(Double value) {
            addCriterion("lower_limit_out <>", value, "lowerLimitOut");
            return (Criteria) this;
        }

        public Criteria andLowerLimitOutGreaterThan(Double value) {
            addCriterion("lower_limit_out >", value, "lowerLimitOut");
            return (Criteria) this;
        }

        public Criteria andLowerLimitOutGreaterThanOrEqualTo(Double value) {
            addCriterion("lower_limit_out >=", value, "lowerLimitOut");
            return (Criteria) this;
        }

        public Criteria andLowerLimitOutLessThan(Double value) {
            addCriterion("lower_limit_out <", value, "lowerLimitOut");
            return (Criteria) this;
        }

        public Criteria andLowerLimitOutLessThanOrEqualTo(Double value) {
            addCriterion("lower_limit_out <=", value, "lowerLimitOut");
            return (Criteria) this;
        }

        public Criteria andLowerLimitOutIn(List<Double> values) {
            addCriterion("lower_limit_out in", values, "lowerLimitOut");
            return (Criteria) this;
        }

        public Criteria andLowerLimitOutNotIn(List<Double> values) {
            addCriterion("lower_limit_out not in", values, "lowerLimitOut");
            return (Criteria) this;
        }

        public Criteria andLowerLimitOutBetween(Double value1, Double value2) {
            addCriterion("lower_limit_out between", value1, value2, "lowerLimitOut");
            return (Criteria) this;
        }

        public Criteria andLowerLimitOutNotBetween(Double value1, Double value2) {
            addCriterion("lower_limit_out not between", value1, value2, "lowerLimitOut");
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