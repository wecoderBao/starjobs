package com.starjobs.pojo;

import java.util.ArrayList;
import java.util.List;

public class TFriendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TFriendExample() {
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

        public Criteria andCUidIsNull() {
            addCriterion("c_uid is null");
            return (Criteria) this;
        }

        public Criteria andCUidIsNotNull() {
            addCriterion("c_uid is not null");
            return (Criteria) this;
        }

        public Criteria andCUidEqualTo(String value) {
            addCriterion("c_uid =", value, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidNotEqualTo(String value) {
            addCriterion("c_uid <>", value, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidGreaterThan(String value) {
            addCriterion("c_uid >", value, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidGreaterThanOrEqualTo(String value) {
            addCriterion("c_uid >=", value, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidLessThan(String value) {
            addCriterion("c_uid <", value, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidLessThanOrEqualTo(String value) {
            addCriterion("c_uid <=", value, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidLike(String value) {
            addCriterion("c_uid like", value, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidNotLike(String value) {
            addCriterion("c_uid not like", value, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidIn(List<String> values) {
            addCriterion("c_uid in", values, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidNotIn(List<String> values) {
            addCriterion("c_uid not in", values, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidBetween(String value1, String value2) {
            addCriterion("c_uid between", value1, value2, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidNotBetween(String value1, String value2) {
            addCriterion("c_uid not between", value1, value2, "cUid");
            return (Criteria) this;
        }

        public Criteria andCFidIsNull() {
            addCriterion("c_fid is null");
            return (Criteria) this;
        }

        public Criteria andCFidIsNotNull() {
            addCriterion("c_fid is not null");
            return (Criteria) this;
        }

        public Criteria andCFidEqualTo(String value) {
            addCriterion("c_fid =", value, "cFid");
            return (Criteria) this;
        }

        public Criteria andCFidNotEqualTo(String value) {
            addCriterion("c_fid <>", value, "cFid");
            return (Criteria) this;
        }

        public Criteria andCFidGreaterThan(String value) {
            addCriterion("c_fid >", value, "cFid");
            return (Criteria) this;
        }

        public Criteria andCFidGreaterThanOrEqualTo(String value) {
            addCriterion("c_fid >=", value, "cFid");
            return (Criteria) this;
        }

        public Criteria andCFidLessThan(String value) {
            addCriterion("c_fid <", value, "cFid");
            return (Criteria) this;
        }

        public Criteria andCFidLessThanOrEqualTo(String value) {
            addCriterion("c_fid <=", value, "cFid");
            return (Criteria) this;
        }

        public Criteria andCFidLike(String value) {
            addCriterion("c_fid like", value, "cFid");
            return (Criteria) this;
        }

        public Criteria andCFidNotLike(String value) {
            addCriterion("c_fid not like", value, "cFid");
            return (Criteria) this;
        }

        public Criteria andCFidIn(List<String> values) {
            addCriterion("c_fid in", values, "cFid");
            return (Criteria) this;
        }

        public Criteria andCFidNotIn(List<String> values) {
            addCriterion("c_fid not in", values, "cFid");
            return (Criteria) this;
        }

        public Criteria andCFidBetween(String value1, String value2) {
            addCriterion("c_fid between", value1, value2, "cFid");
            return (Criteria) this;
        }

        public Criteria andCFidNotBetween(String value1, String value2) {
            addCriterion("c_fid not between", value1, value2, "cFid");
            return (Criteria) this;
        }

        public Criteria andCStateIsNull() {
            addCriterion("c_state is null");
            return (Criteria) this;
        }

        public Criteria andCStateIsNotNull() {
            addCriterion("c_state is not null");
            return (Criteria) this;
        }

        public Criteria andCStateEqualTo(String value) {
            addCriterion("c_state =", value, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateNotEqualTo(String value) {
            addCriterion("c_state <>", value, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateGreaterThan(String value) {
            addCriterion("c_state >", value, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateGreaterThanOrEqualTo(String value) {
            addCriterion("c_state >=", value, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateLessThan(String value) {
            addCriterion("c_state <", value, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateLessThanOrEqualTo(String value) {
            addCriterion("c_state <=", value, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateLike(String value) {
            addCriterion("c_state like", value, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateNotLike(String value) {
            addCriterion("c_state not like", value, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateIn(List<String> values) {
            addCriterion("c_state in", values, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateNotIn(List<String> values) {
            addCriterion("c_state not in", values, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateBetween(String value1, String value2) {
            addCriterion("c_state between", value1, value2, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateNotBetween(String value1, String value2) {
            addCriterion("c_state not between", value1, value2, "cState");
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