package com.starjobs.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TUserTokenExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUserTokenExample() {
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

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Integer value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Integer value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Integer value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Integer value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Integer> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Integer> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Integer value1, Integer value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_id not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCTokenValueIsNull() {
            addCriterion("c_token_value is null");
            return (Criteria) this;
        }

        public Criteria andCTokenValueIsNotNull() {
            addCriterion("c_token_value is not null");
            return (Criteria) this;
        }

        public Criteria andCTokenValueEqualTo(String value) {
            addCriterion("c_token_value =", value, "cTokenValue");
            return (Criteria) this;
        }

        public Criteria andCTokenValueNotEqualTo(String value) {
            addCriterion("c_token_value <>", value, "cTokenValue");
            return (Criteria) this;
        }

        public Criteria andCTokenValueGreaterThan(String value) {
            addCriterion("c_token_value >", value, "cTokenValue");
            return (Criteria) this;
        }

        public Criteria andCTokenValueGreaterThanOrEqualTo(String value) {
            addCriterion("c_token_value >=", value, "cTokenValue");
            return (Criteria) this;
        }

        public Criteria andCTokenValueLessThan(String value) {
            addCriterion("c_token_value <", value, "cTokenValue");
            return (Criteria) this;
        }

        public Criteria andCTokenValueLessThanOrEqualTo(String value) {
            addCriterion("c_token_value <=", value, "cTokenValue");
            return (Criteria) this;
        }

        public Criteria andCTokenValueLike(String value) {
            addCriterion("c_token_value like", value, "cTokenValue");
            return (Criteria) this;
        }

        public Criteria andCTokenValueNotLike(String value) {
            addCriterion("c_token_value not like", value, "cTokenValue");
            return (Criteria) this;
        }

        public Criteria andCTokenValueIn(List<String> values) {
            addCriterion("c_token_value in", values, "cTokenValue");
            return (Criteria) this;
        }

        public Criteria andCTokenValueNotIn(List<String> values) {
            addCriterion("c_token_value not in", values, "cTokenValue");
            return (Criteria) this;
        }

        public Criteria andCTokenValueBetween(String value1, String value2) {
            addCriterion("c_token_value between", value1, value2, "cTokenValue");
            return (Criteria) this;
        }

        public Criteria andCTokenValueNotBetween(String value1, String value2) {
            addCriterion("c_token_value not between", value1, value2, "cTokenValue");
            return (Criteria) this;
        }

        public Criteria andCPhoneNumIsNull() {
            addCriterion("c_phone_num is null");
            return (Criteria) this;
        }

        public Criteria andCPhoneNumIsNotNull() {
            addCriterion("c_phone_num is not null");
            return (Criteria) this;
        }

        public Criteria andCPhoneNumEqualTo(String value) {
            addCriterion("c_phone_num =", value, "cPhoneNum");
            return (Criteria) this;
        }

        public Criteria andCPhoneNumNotEqualTo(String value) {
            addCriterion("c_phone_num <>", value, "cPhoneNum");
            return (Criteria) this;
        }

        public Criteria andCPhoneNumGreaterThan(String value) {
            addCriterion("c_phone_num >", value, "cPhoneNum");
            return (Criteria) this;
        }

        public Criteria andCPhoneNumGreaterThanOrEqualTo(String value) {
            addCriterion("c_phone_num >=", value, "cPhoneNum");
            return (Criteria) this;
        }

        public Criteria andCPhoneNumLessThan(String value) {
            addCriterion("c_phone_num <", value, "cPhoneNum");
            return (Criteria) this;
        }

        public Criteria andCPhoneNumLessThanOrEqualTo(String value) {
            addCriterion("c_phone_num <=", value, "cPhoneNum");
            return (Criteria) this;
        }

        public Criteria andCPhoneNumLike(String value) {
            addCriterion("c_phone_num like", value, "cPhoneNum");
            return (Criteria) this;
        }

        public Criteria andCPhoneNumNotLike(String value) {
            addCriterion("c_phone_num not like", value, "cPhoneNum");
            return (Criteria) this;
        }

        public Criteria andCPhoneNumIn(List<String> values) {
            addCriterion("c_phone_num in", values, "cPhoneNum");
            return (Criteria) this;
        }

        public Criteria andCPhoneNumNotIn(List<String> values) {
            addCriterion("c_phone_num not in", values, "cPhoneNum");
            return (Criteria) this;
        }

        public Criteria andCPhoneNumBetween(String value1, String value2) {
            addCriterion("c_phone_num between", value1, value2, "cPhoneNum");
            return (Criteria) this;
        }

        public Criteria andCPhoneNumNotBetween(String value1, String value2) {
            addCriterion("c_phone_num not between", value1, value2, "cPhoneNum");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeIsNull() {
            addCriterion("c_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeIsNotNull() {
            addCriterion("c_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeEqualTo(Date value) {
            addCriterion("c_create_time =", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeNotEqualTo(Date value) {
            addCriterion("c_create_time <>", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeGreaterThan(Date value) {
            addCriterion("c_create_time >", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("c_create_time >=", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeLessThan(Date value) {
            addCriterion("c_create_time <", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("c_create_time <=", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeIn(List<Date> values) {
            addCriterion("c_create_time in", values, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeNotIn(List<Date> values) {
            addCriterion("c_create_time not in", values, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeBetween(Date value1, Date value2) {
            addCriterion("c_create_time between", value1, value2, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("c_create_time not between", value1, value2, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCTokenExpireIsNull() {
            addCriterion("c_token_expire is null");
            return (Criteria) this;
        }

        public Criteria andCTokenExpireIsNotNull() {
            addCriterion("c_token_expire is not null");
            return (Criteria) this;
        }

        public Criteria andCTokenExpireEqualTo(Integer value) {
            addCriterion("c_token_expire =", value, "cTokenExpire");
            return (Criteria) this;
        }

        public Criteria andCTokenExpireNotEqualTo(Integer value) {
            addCriterion("c_token_expire <>", value, "cTokenExpire");
            return (Criteria) this;
        }

        public Criteria andCTokenExpireGreaterThan(Integer value) {
            addCriterion("c_token_expire >", value, "cTokenExpire");
            return (Criteria) this;
        }

        public Criteria andCTokenExpireGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_token_expire >=", value, "cTokenExpire");
            return (Criteria) this;
        }

        public Criteria andCTokenExpireLessThan(Integer value) {
            addCriterion("c_token_expire <", value, "cTokenExpire");
            return (Criteria) this;
        }

        public Criteria andCTokenExpireLessThanOrEqualTo(Integer value) {
            addCriterion("c_token_expire <=", value, "cTokenExpire");
            return (Criteria) this;
        }

        public Criteria andCTokenExpireIn(List<Integer> values) {
            addCriterion("c_token_expire in", values, "cTokenExpire");
            return (Criteria) this;
        }

        public Criteria andCTokenExpireNotIn(List<Integer> values) {
            addCriterion("c_token_expire not in", values, "cTokenExpire");
            return (Criteria) this;
        }

        public Criteria andCTokenExpireBetween(Integer value1, Integer value2) {
            addCriterion("c_token_expire between", value1, value2, "cTokenExpire");
            return (Criteria) this;
        }

        public Criteria andCTokenExpireNotBetween(Integer value1, Integer value2) {
            addCriterion("c_token_expire not between", value1, value2, "cTokenExpire");
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