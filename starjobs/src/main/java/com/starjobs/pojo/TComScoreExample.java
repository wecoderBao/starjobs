package com.starjobs.pojo;

import java.util.ArrayList;
import java.util.List;

public class TComScoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TComScoreExample() {
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

        public Criteria andCComIdIsNull() {
            addCriterion("c_com_id is null");
            return (Criteria) this;
        }

        public Criteria andCComIdIsNotNull() {
            addCriterion("c_com_id is not null");
            return (Criteria) this;
        }

        public Criteria andCComIdEqualTo(Integer value) {
            addCriterion("c_com_id =", value, "cComId");
            return (Criteria) this;
        }

        public Criteria andCComIdNotEqualTo(Integer value) {
            addCriterion("c_com_id <>", value, "cComId");
            return (Criteria) this;
        }

        public Criteria andCComIdGreaterThan(Integer value) {
            addCriterion("c_com_id >", value, "cComId");
            return (Criteria) this;
        }

        public Criteria andCComIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_com_id >=", value, "cComId");
            return (Criteria) this;
        }

        public Criteria andCComIdLessThan(Integer value) {
            addCriterion("c_com_id <", value, "cComId");
            return (Criteria) this;
        }

        public Criteria andCComIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_com_id <=", value, "cComId");
            return (Criteria) this;
        }

        public Criteria andCComIdIn(List<Integer> values) {
            addCriterion("c_com_id in", values, "cComId");
            return (Criteria) this;
        }

        public Criteria andCComIdNotIn(List<Integer> values) {
            addCriterion("c_com_id not in", values, "cComId");
            return (Criteria) this;
        }

        public Criteria andCComIdBetween(Integer value1, Integer value2) {
            addCriterion("c_com_id between", value1, value2, "cComId");
            return (Criteria) this;
        }

        public Criteria andCComIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_com_id not between", value1, value2, "cComId");
            return (Criteria) this;
        }

        public Criteria andCTotalUserIsNull() {
            addCriterion("c_total_user is null");
            return (Criteria) this;
        }

        public Criteria andCTotalUserIsNotNull() {
            addCriterion("c_total_user is not null");
            return (Criteria) this;
        }

        public Criteria andCTotalUserEqualTo(Integer value) {
            addCriterion("c_total_user =", value, "cTotalUser");
            return (Criteria) this;
        }

        public Criteria andCTotalUserNotEqualTo(Integer value) {
            addCriterion("c_total_user <>", value, "cTotalUser");
            return (Criteria) this;
        }

        public Criteria andCTotalUserGreaterThan(Integer value) {
            addCriterion("c_total_user >", value, "cTotalUser");
            return (Criteria) this;
        }

        public Criteria andCTotalUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_total_user >=", value, "cTotalUser");
            return (Criteria) this;
        }

        public Criteria andCTotalUserLessThan(Integer value) {
            addCriterion("c_total_user <", value, "cTotalUser");
            return (Criteria) this;
        }

        public Criteria andCTotalUserLessThanOrEqualTo(Integer value) {
            addCriterion("c_total_user <=", value, "cTotalUser");
            return (Criteria) this;
        }

        public Criteria andCTotalUserIn(List<Integer> values) {
            addCriterion("c_total_user in", values, "cTotalUser");
            return (Criteria) this;
        }

        public Criteria andCTotalUserNotIn(List<Integer> values) {
            addCriterion("c_total_user not in", values, "cTotalUser");
            return (Criteria) this;
        }

        public Criteria andCTotalUserBetween(Integer value1, Integer value2) {
            addCriterion("c_total_user between", value1, value2, "cTotalUser");
            return (Criteria) this;
        }

        public Criteria andCTotalUserNotBetween(Integer value1, Integer value2) {
            addCriterion("c_total_user not between", value1, value2, "cTotalUser");
            return (Criteria) this;
        }

        public Criteria andCTotalScoreIsNull() {
            addCriterion("c_total_score is null");
            return (Criteria) this;
        }

        public Criteria andCTotalScoreIsNotNull() {
            addCriterion("c_total_score is not null");
            return (Criteria) this;
        }

        public Criteria andCTotalScoreEqualTo(Integer value) {
            addCriterion("c_total_score =", value, "cTotalScore");
            return (Criteria) this;
        }

        public Criteria andCTotalScoreNotEqualTo(Integer value) {
            addCriterion("c_total_score <>", value, "cTotalScore");
            return (Criteria) this;
        }

        public Criteria andCTotalScoreGreaterThan(Integer value) {
            addCriterion("c_total_score >", value, "cTotalScore");
            return (Criteria) this;
        }

        public Criteria andCTotalScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_total_score >=", value, "cTotalScore");
            return (Criteria) this;
        }

        public Criteria andCTotalScoreLessThan(Integer value) {
            addCriterion("c_total_score <", value, "cTotalScore");
            return (Criteria) this;
        }

        public Criteria andCTotalScoreLessThanOrEqualTo(Integer value) {
            addCriterion("c_total_score <=", value, "cTotalScore");
            return (Criteria) this;
        }

        public Criteria andCTotalScoreIn(List<Integer> values) {
            addCriterion("c_total_score in", values, "cTotalScore");
            return (Criteria) this;
        }

        public Criteria andCTotalScoreNotIn(List<Integer> values) {
            addCriterion("c_total_score not in", values, "cTotalScore");
            return (Criteria) this;
        }

        public Criteria andCTotalScoreBetween(Integer value1, Integer value2) {
            addCriterion("c_total_score between", value1, value2, "cTotalScore");
            return (Criteria) this;
        }

        public Criteria andCTotalScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("c_total_score not between", value1, value2, "cTotalScore");
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