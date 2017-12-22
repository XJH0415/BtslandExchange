package info.btsland.exchange.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoteExample() {
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

        public Criteria andNoteNoIsNull() {
            addCriterion("note_no is null");
            return (Criteria) this;
        }

        public Criteria andNoteNoIsNotNull() {
            addCriterion("note_no is not null");
            return (Criteria) this;
        }

        public Criteria andNoteNoEqualTo(String value) {
            addCriterion("note_no =", value, "noteNo");
            return (Criteria) this;
        }

        public Criteria andNoteNoNotEqualTo(String value) {
            addCriterion("note_no <>", value, "noteNo");
            return (Criteria) this;
        }

        public Criteria andNoteNoGreaterThan(String value) {
            addCriterion("note_no >", value, "noteNo");
            return (Criteria) this;
        }

        public Criteria andNoteNoGreaterThanOrEqualTo(String value) {
            addCriterion("note_no >=", value, "noteNo");
            return (Criteria) this;
        }

        public Criteria andNoteNoLessThan(String value) {
            addCriterion("note_no <", value, "noteNo");
            return (Criteria) this;
        }

        public Criteria andNoteNoLessThanOrEqualTo(String value) {
            addCriterion("note_no <=", value, "noteNo");
            return (Criteria) this;
        }

        public Criteria andNoteNoLike(String value) {
            addCriterion("note_no like", value, "noteNo");
            return (Criteria) this;
        }

        public Criteria andNoteNoNotLike(String value) {
            addCriterion("note_no not like", value, "noteNo");
            return (Criteria) this;
        }

        public Criteria andNoteNoIn(List<String> values) {
            addCriterion("note_no in", values, "noteNo");
            return (Criteria) this;
        }

        public Criteria andNoteNoNotIn(List<String> values) {
            addCriterion("note_no not in", values, "noteNo");
            return (Criteria) this;
        }

        public Criteria andNoteNoBetween(String value1, String value2) {
            addCriterion("note_no between", value1, value2, "noteNo");
            return (Criteria) this;
        }

        public Criteria andNoteNoNotBetween(String value1, String value2) {
            addCriterion("note_no not between", value1, value2, "noteNo");
            return (Criteria) this;
        }

        public Criteria andAssetNumIsNull() {
            addCriterion("asset_num is null");
            return (Criteria) this;
        }

        public Criteria andAssetNumIsNotNull() {
            addCriterion("asset_num is not null");
            return (Criteria) this;
        }

        public Criteria andAssetNumEqualTo(Double value) {
            addCriterion("asset_num =", value, "assetNum");
            return (Criteria) this;
        }

        public Criteria andAssetNumNotEqualTo(Double value) {
            addCriterion("asset_num <>", value, "assetNum");
            return (Criteria) this;
        }

        public Criteria andAssetNumGreaterThan(Double value) {
            addCriterion("asset_num >", value, "assetNum");
            return (Criteria) this;
        }

        public Criteria andAssetNumGreaterThanOrEqualTo(Double value) {
            addCriterion("asset_num >=", value, "assetNum");
            return (Criteria) this;
        }

        public Criteria andAssetNumLessThan(Double value) {
            addCriterion("asset_num <", value, "assetNum");
            return (Criteria) this;
        }

        public Criteria andAssetNumLessThanOrEqualTo(Double value) {
            addCriterion("asset_num <=", value, "assetNum");
            return (Criteria) this;
        }

        public Criteria andAssetNumIn(List<Double> values) {
            addCriterion("asset_num in", values, "assetNum");
            return (Criteria) this;
        }

        public Criteria andAssetNumNotIn(List<Double> values) {
            addCriterion("asset_num not in", values, "assetNum");
            return (Criteria) this;
        }

        public Criteria andAssetNumBetween(Double value1, Double value2) {
            addCriterion("asset_num between", value1, value2, "assetNum");
            return (Criteria) this;
        }

        public Criteria andAssetNumNotBetween(Double value1, Double value2) {
            addCriterion("asset_num not between", value1, value2, "assetNum");
            return (Criteria) this;
        }

        public Criteria andAssetCoinIsNull() {
            addCriterion("asset_coin is null");
            return (Criteria) this;
        }

        public Criteria andAssetCoinIsNotNull() {
            addCriterion("asset_coin is not null");
            return (Criteria) this;
        }

        public Criteria andAssetCoinEqualTo(String value) {
            addCriterion("asset_coin =", value, "assetCoin");
            return (Criteria) this;
        }

        public Criteria andAssetCoinNotEqualTo(String value) {
            addCriterion("asset_coin <>", value, "assetCoin");
            return (Criteria) this;
        }

        public Criteria andAssetCoinGreaterThan(String value) {
            addCriterion("asset_coin >", value, "assetCoin");
            return (Criteria) this;
        }

        public Criteria andAssetCoinGreaterThanOrEqualTo(String value) {
            addCriterion("asset_coin >=", value, "assetCoin");
            return (Criteria) this;
        }

        public Criteria andAssetCoinLessThan(String value) {
            addCriterion("asset_coin <", value, "assetCoin");
            return (Criteria) this;
        }

        public Criteria andAssetCoinLessThanOrEqualTo(String value) {
            addCriterion("asset_coin <=", value, "assetCoin");
            return (Criteria) this;
        }

        public Criteria andAssetCoinLike(String value) {
            addCriterion("asset_coin like", value, "assetCoin");
            return (Criteria) this;
        }

        public Criteria andAssetCoinNotLike(String value) {
            addCriterion("asset_coin not like", value, "assetCoin");
            return (Criteria) this;
        }

        public Criteria andAssetCoinIn(List<String> values) {
            addCriterion("asset_coin in", values, "assetCoin");
            return (Criteria) this;
        }

        public Criteria andAssetCoinNotIn(List<String> values) {
            addCriterion("asset_coin not in", values, "assetCoin");
            return (Criteria) this;
        }

        public Criteria andAssetCoinBetween(String value1, String value2) {
            addCriterion("asset_coin between", value1, value2, "assetCoin");
            return (Criteria) this;
        }

        public Criteria andAssetCoinNotBetween(String value1, String value2) {
            addCriterion("asset_coin not between", value1, value2, "assetCoin");
            return (Criteria) this;
        }

        public Criteria andBrokerageIsNull() {
            addCriterion("brokerage is null");
            return (Criteria) this;
        }

        public Criteria andBrokerageIsNotNull() {
            addCriterion("brokerage is not null");
            return (Criteria) this;
        }

        public Criteria andBrokerageEqualTo(Double value) {
            addCriterion("brokerage =", value, "brokerage");
            return (Criteria) this;
        }

        public Criteria andBrokerageNotEqualTo(Double value) {
            addCriterion("brokerage <>", value, "brokerage");
            return (Criteria) this;
        }

        public Criteria andBrokerageGreaterThan(Double value) {
            addCriterion("brokerage >", value, "brokerage");
            return (Criteria) this;
        }

        public Criteria andBrokerageGreaterThanOrEqualTo(Double value) {
            addCriterion("brokerage >=", value, "brokerage");
            return (Criteria) this;
        }

        public Criteria andBrokerageLessThan(Double value) {
            addCriterion("brokerage <", value, "brokerage");
            return (Criteria) this;
        }

        public Criteria andBrokerageLessThanOrEqualTo(Double value) {
            addCriterion("brokerage <=", value, "brokerage");
            return (Criteria) this;
        }

        public Criteria andBrokerageIn(List<Double> values) {
            addCriterion("brokerage in", values, "brokerage");
            return (Criteria) this;
        }

        public Criteria andBrokerageNotIn(List<Double> values) {
            addCriterion("brokerage not in", values, "brokerage");
            return (Criteria) this;
        }

        public Criteria andBrokerageBetween(Double value1, Double value2) {
            addCriterion("brokerage between", value1, value2, "brokerage");
            return (Criteria) this;
        }

        public Criteria andBrokerageNotBetween(Double value1, Double value2) {
            addCriterion("brokerage not between", value1, value2, "brokerage");
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

        public Criteria andRealNoIsNull() {
            addCriterion("real_no is null");
            return (Criteria) this;
        }

        public Criteria andRealNoIsNotNull() {
            addCriterion("real_no is not null");
            return (Criteria) this;
        }

        public Criteria andRealNoEqualTo(String value) {
            addCriterion("real_no =", value, "realNo");
            return (Criteria) this;
        }

        public Criteria andRealNoNotEqualTo(String value) {
            addCriterion("real_no <>", value, "realNo");
            return (Criteria) this;
        }

        public Criteria andRealNoGreaterThan(String value) {
            addCriterion("real_no >", value, "realNo");
            return (Criteria) this;
        }

        public Criteria andRealNoGreaterThanOrEqualTo(String value) {
            addCriterion("real_no >=", value, "realNo");
            return (Criteria) this;
        }

        public Criteria andRealNoLessThan(String value) {
            addCriterion("real_no <", value, "realNo");
            return (Criteria) this;
        }

        public Criteria andRealNoLessThanOrEqualTo(String value) {
            addCriterion("real_no <=", value, "realNo");
            return (Criteria) this;
        }

        public Criteria andRealNoLike(String value) {
            addCriterion("real_no like", value, "realNo");
            return (Criteria) this;
        }

        public Criteria andRealNoNotLike(String value) {
            addCriterion("real_no not like", value, "realNo");
            return (Criteria) this;
        }

        public Criteria andRealNoIn(List<String> values) {
            addCriterion("real_no in", values, "realNo");
            return (Criteria) this;
        }

        public Criteria andRealNoNotIn(List<String> values) {
            addCriterion("real_no not in", values, "realNo");
            return (Criteria) this;
        }

        public Criteria andRealNoBetween(String value1, String value2) {
            addCriterion("real_no between", value1, value2, "realNo");
            return (Criteria) this;
        }

        public Criteria andRealNoNotBetween(String value1, String value2) {
            addCriterion("real_no not between", value1, value2, "realNo");
            return (Criteria) this;
        }

        public Criteria andRealTypeIsNull() {
            addCriterion("real_type is null");
            return (Criteria) this;
        }

        public Criteria andRealTypeIsNotNull() {
            addCriterion("real_type is not null");
            return (Criteria) this;
        }

        public Criteria andRealTypeEqualTo(String value) {
            addCriterion("real_type =", value, "realType");
            return (Criteria) this;
        }

        public Criteria andRealTypeNotEqualTo(String value) {
            addCriterion("real_type <>", value, "realType");
            return (Criteria) this;
        }

        public Criteria andRealTypeGreaterThan(String value) {
            addCriterion("real_type >", value, "realType");
            return (Criteria) this;
        }

        public Criteria andRealTypeGreaterThanOrEqualTo(String value) {
            addCriterion("real_type >=", value, "realType");
            return (Criteria) this;
        }

        public Criteria andRealTypeLessThan(String value) {
            addCriterion("real_type <", value, "realType");
            return (Criteria) this;
        }

        public Criteria andRealTypeLessThanOrEqualTo(String value) {
            addCriterion("real_type <=", value, "realType");
            return (Criteria) this;
        }

        public Criteria andRealTypeLike(String value) {
            addCriterion("real_type like", value, "realType");
            return (Criteria) this;
        }

        public Criteria andRealTypeNotLike(String value) {
            addCriterion("real_type not like", value, "realType");
            return (Criteria) this;
        }

        public Criteria andRealTypeIn(List<String> values) {
            addCriterion("real_type in", values, "realType");
            return (Criteria) this;
        }

        public Criteria andRealTypeNotIn(List<String> values) {
            addCriterion("real_type not in", values, "realType");
            return (Criteria) this;
        }

        public Criteria andRealTypeBetween(String value1, String value2) {
            addCriterion("real_type between", value1, value2, "realType");
            return (Criteria) this;
        }

        public Criteria andRealTypeNotBetween(String value1, String value2) {
            addCriterion("real_type not between", value1, value2, "realType");
            return (Criteria) this;
        }

        public Criteria andRealDepictIsNull() {
            addCriterion("real_depict is null");
            return (Criteria) this;
        }

        public Criteria andRealDepictIsNotNull() {
            addCriterion("real_depict is not null");
            return (Criteria) this;
        }

        public Criteria andRealDepictEqualTo(String value) {
            addCriterion("real_depict =", value, "realDepict");
            return (Criteria) this;
        }

        public Criteria andRealDepictNotEqualTo(String value) {
            addCriterion("real_depict <>", value, "realDepict");
            return (Criteria) this;
        }

        public Criteria andRealDepictGreaterThan(String value) {
            addCriterion("real_depict >", value, "realDepict");
            return (Criteria) this;
        }

        public Criteria andRealDepictGreaterThanOrEqualTo(String value) {
            addCriterion("real_depict >=", value, "realDepict");
            return (Criteria) this;
        }

        public Criteria andRealDepictLessThan(String value) {
            addCriterion("real_depict <", value, "realDepict");
            return (Criteria) this;
        }

        public Criteria andRealDepictLessThanOrEqualTo(String value) {
            addCriterion("real_depict <=", value, "realDepict");
            return (Criteria) this;
        }

        public Criteria andRealDepictLike(String value) {
            addCriterion("real_depict like", value, "realDepict");
            return (Criteria) this;
        }

        public Criteria andRealDepictNotLike(String value) {
            addCriterion("real_depict not like", value, "realDepict");
            return (Criteria) this;
        }

        public Criteria andRealDepictIn(List<String> values) {
            addCriterion("real_depict in", values, "realDepict");
            return (Criteria) this;
        }

        public Criteria andRealDepictNotIn(List<String> values) {
            addCriterion("real_depict not in", values, "realDepict");
            return (Criteria) this;
        }

        public Criteria andRealDepictBetween(String value1, String value2) {
            addCriterion("real_depict between", value1, value2, "realDepict");
            return (Criteria) this;
        }

        public Criteria andRealDepictNotBetween(String value1, String value2) {
            addCriterion("real_depict not between", value1, value2, "realDepict");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andAccountReTimeIsNull() {
            addCriterion("account_re_time is null");
            return (Criteria) this;
        }

        public Criteria andAccountReTimeIsNotNull() {
            addCriterion("account_re_time is not null");
            return (Criteria) this;
        }

        public Criteria andAccountReTimeEqualTo(Date value) {
            addCriterion("account_re_time =", value, "accountReTime");
            return (Criteria) this;
        }

        public Criteria andAccountReTimeNotEqualTo(Date value) {
            addCriterion("account_re_time <>", value, "accountReTime");
            return (Criteria) this;
        }

        public Criteria andAccountReTimeGreaterThan(Date value) {
            addCriterion("account_re_time >", value, "accountReTime");
            return (Criteria) this;
        }

        public Criteria andAccountReTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("account_re_time >=", value, "accountReTime");
            return (Criteria) this;
        }

        public Criteria andAccountReTimeLessThan(Date value) {
            addCriterion("account_re_time <", value, "accountReTime");
            return (Criteria) this;
        }

        public Criteria andAccountReTimeLessThanOrEqualTo(Date value) {
            addCriterion("account_re_time <=", value, "accountReTime");
            return (Criteria) this;
        }

        public Criteria andAccountReTimeIn(List<Date> values) {
            addCriterion("account_re_time in", values, "accountReTime");
            return (Criteria) this;
        }

        public Criteria andAccountReTimeNotIn(List<Date> values) {
            addCriterion("account_re_time not in", values, "accountReTime");
            return (Criteria) this;
        }

        public Criteria andAccountReTimeBetween(Date value1, Date value2) {
            addCriterion("account_re_time between", value1, value2, "accountReTime");
            return (Criteria) this;
        }

        public Criteria andAccountReTimeNotBetween(Date value1, Date value2) {
            addCriterion("account_re_time not between", value1, value2, "accountReTime");
            return (Criteria) this;
        }

        public Criteria andDealerReTimeIsNull() {
            addCriterion("dealer_re_time is null");
            return (Criteria) this;
        }

        public Criteria andDealerReTimeIsNotNull() {
            addCriterion("dealer_re_time is not null");
            return (Criteria) this;
        }

        public Criteria andDealerReTimeEqualTo(Date value) {
            addCriterion("dealer_re_time =", value, "dealerReTime");
            return (Criteria) this;
        }

        public Criteria andDealerReTimeNotEqualTo(Date value) {
            addCriterion("dealer_re_time <>", value, "dealerReTime");
            return (Criteria) this;
        }

        public Criteria andDealerReTimeGreaterThan(Date value) {
            addCriterion("dealer_re_time >", value, "dealerReTime");
            return (Criteria) this;
        }

        public Criteria andDealerReTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dealer_re_time >=", value, "dealerReTime");
            return (Criteria) this;
        }

        public Criteria andDealerReTimeLessThan(Date value) {
            addCriterion("dealer_re_time <", value, "dealerReTime");
            return (Criteria) this;
        }

        public Criteria andDealerReTimeLessThanOrEqualTo(Date value) {
            addCriterion("dealer_re_time <=", value, "dealerReTime");
            return (Criteria) this;
        }

        public Criteria andDealerReTimeIn(List<Date> values) {
            addCriterion("dealer_re_time in", values, "dealerReTime");
            return (Criteria) this;
        }

        public Criteria andDealerReTimeNotIn(List<Date> values) {
            addCriterion("dealer_re_time not in", values, "dealerReTime");
            return (Criteria) this;
        }

        public Criteria andDealerReTimeBetween(Date value1, Date value2) {
            addCriterion("dealer_re_time between", value1, value2, "dealerReTime");
            return (Criteria) this;
        }

        public Criteria andDealerReTimeNotBetween(Date value1, Date value2) {
            addCriterion("dealer_re_time not between", value1, value2, "dealerReTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andRemarkCodeIsNull() {
            addCriterion("remark_code is null");
            return (Criteria) this;
        }

        public Criteria andRemarkCodeIsNotNull() {
            addCriterion("remark_code is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkCodeEqualTo(String value) {
            addCriterion("remark_code =", value, "remarkCode");
            return (Criteria) this;
        }

        public Criteria andRemarkCodeNotEqualTo(String value) {
            addCriterion("remark_code <>", value, "remarkCode");
            return (Criteria) this;
        }

        public Criteria andRemarkCodeGreaterThan(String value) {
            addCriterion("remark_code >", value, "remarkCode");
            return (Criteria) this;
        }

        public Criteria andRemarkCodeGreaterThanOrEqualTo(String value) {
            addCriterion("remark_code >=", value, "remarkCode");
            return (Criteria) this;
        }

        public Criteria andRemarkCodeLessThan(String value) {
            addCriterion("remark_code <", value, "remarkCode");
            return (Criteria) this;
        }

        public Criteria andRemarkCodeLessThanOrEqualTo(String value) {
            addCriterion("remark_code <=", value, "remarkCode");
            return (Criteria) this;
        }

        public Criteria andRemarkCodeLike(String value) {
            addCriterion("remark_code like", value, "remarkCode");
            return (Criteria) this;
        }

        public Criteria andRemarkCodeNotLike(String value) {
            addCriterion("remark_code not like", value, "remarkCode");
            return (Criteria) this;
        }

        public Criteria andRemarkCodeIn(List<String> values) {
            addCriterion("remark_code in", values, "remarkCode");
            return (Criteria) this;
        }

        public Criteria andRemarkCodeNotIn(List<String> values) {
            addCriterion("remark_code not in", values, "remarkCode");
            return (Criteria) this;
        }

        public Criteria andRemarkCodeBetween(String value1, String value2) {
            addCriterion("remark_code between", value1, value2, "remarkCode");
            return (Criteria) this;
        }

        public Criteria andRemarkCodeNotBetween(String value1, String value2) {
            addCriterion("remark_code not between", value1, value2, "remarkCode");
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

        public Criteria andFlowPathIsNull() {
            addCriterion("flow_path is null");
            return (Criteria) this;
        }

        public Criteria andFlowPathIsNotNull() {
            addCriterion("flow_path is not null");
            return (Criteria) this;
        }

        public Criteria andFlowPathEqualTo(String value) {
            addCriterion("flow_path =", value, "flowPath");
            return (Criteria) this;
        }

        public Criteria andFlowPathNotEqualTo(String value) {
            addCriterion("flow_path <>", value, "flowPath");
            return (Criteria) this;
        }

        public Criteria andFlowPathGreaterThan(String value) {
            addCriterion("flow_path >", value, "flowPath");
            return (Criteria) this;
        }

        public Criteria andFlowPathGreaterThanOrEqualTo(String value) {
            addCriterion("flow_path >=", value, "flowPath");
            return (Criteria) this;
        }

        public Criteria andFlowPathLessThan(String value) {
            addCriterion("flow_path <", value, "flowPath");
            return (Criteria) this;
        }

        public Criteria andFlowPathLessThanOrEqualTo(String value) {
            addCriterion("flow_path <=", value, "flowPath");
            return (Criteria) this;
        }

        public Criteria andFlowPathLike(String value) {
            addCriterion("flow_path like", value, "flowPath");
            return (Criteria) this;
        }

        public Criteria andFlowPathNotLike(String value) {
            addCriterion("flow_path not like", value, "flowPath");
            return (Criteria) this;
        }

        public Criteria andFlowPathIn(List<String> values) {
            addCriterion("flow_path in", values, "flowPath");
            return (Criteria) this;
        }

        public Criteria andFlowPathNotIn(List<String> values) {
            addCriterion("flow_path not in", values, "flowPath");
            return (Criteria) this;
        }

        public Criteria andFlowPathBetween(String value1, String value2) {
            addCriterion("flow_path between", value1, value2, "flowPath");
            return (Criteria) this;
        }

        public Criteria andFlowPathNotBetween(String value1, String value2) {
            addCriterion("flow_path not between", value1, value2, "flowPath");
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