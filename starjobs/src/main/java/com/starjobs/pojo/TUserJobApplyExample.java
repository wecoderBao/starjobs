package com.starjobs.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TUserJobApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUserJobApplyExample() {
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

        public Criteria andCApplyIdIsNull() {
            addCriterion("c_apply_id is null");
            return (Criteria) this;
        }

        public Criteria andCApplyIdIsNotNull() {
            addCriterion("c_apply_id is not null");
            return (Criteria) this;
        }

        public Criteria andCApplyIdEqualTo(Integer value) {
            addCriterion("c_apply_id =", value, "cApplyId");
            return (Criteria) this;
        }

        public Criteria andCApplyIdNotEqualTo(Integer value) {
            addCriterion("c_apply_id <>", value, "cApplyId");
            return (Criteria) this;
        }

        public Criteria andCApplyIdGreaterThan(Integer value) {
            addCriterion("c_apply_id >", value, "cApplyId");
            return (Criteria) this;
        }

        public Criteria andCApplyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_apply_id >=", value, "cApplyId");
            return (Criteria) this;
        }

        public Criteria andCApplyIdLessThan(Integer value) {
            addCriterion("c_apply_id <", value, "cApplyId");
            return (Criteria) this;
        }

        public Criteria andCApplyIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_apply_id <=", value, "cApplyId");
            return (Criteria) this;
        }

        public Criteria andCApplyIdIn(List<Integer> values) {
            addCriterion("c_apply_id in", values, "cApplyId");
            return (Criteria) this;
        }

        public Criteria andCApplyIdNotIn(List<Integer> values) {
            addCriterion("c_apply_id not in", values, "cApplyId");
            return (Criteria) this;
        }

        public Criteria andCApplyIdBetween(Integer value1, Integer value2) {
            addCriterion("c_apply_id between", value1, value2, "cApplyId");
            return (Criteria) this;
        }

        public Criteria andCApplyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_apply_id not between", value1, value2, "cApplyId");
            return (Criteria) this;
        }

        public Criteria andCUserIdIsNull() {
            addCriterion("c_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCUserIdIsNotNull() {
            addCriterion("c_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCUserIdEqualTo(Integer value) {
            addCriterion("c_user_id =", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdNotEqualTo(Integer value) {
            addCriterion("c_user_id <>", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdGreaterThan(Integer value) {
            addCriterion("c_user_id >", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_user_id >=", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdLessThan(Integer value) {
            addCriterion("c_user_id <", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_user_id <=", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdIn(List<Integer> values) {
            addCriterion("c_user_id in", values, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdNotIn(List<Integer> values) {
            addCriterion("c_user_id not in", values, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdBetween(Integer value1, Integer value2) {
            addCriterion("c_user_id between", value1, value2, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_user_id not between", value1, value2, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCJobIdIsNull() {
            addCriterion("c_job_id is null");
            return (Criteria) this;
        }

        public Criteria andCJobIdIsNotNull() {
            addCriterion("c_job_id is not null");
            return (Criteria) this;
        }

        public Criteria andCJobIdEqualTo(Integer value) {
            addCriterion("c_job_id =", value, "cJobId");
            return (Criteria) this;
        }

        public Criteria andCJobIdNotEqualTo(Integer value) {
            addCriterion("c_job_id <>", value, "cJobId");
            return (Criteria) this;
        }

        public Criteria andCJobIdGreaterThan(Integer value) {
            addCriterion("c_job_id >", value, "cJobId");
            return (Criteria) this;
        }

        public Criteria andCJobIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_job_id >=", value, "cJobId");
            return (Criteria) this;
        }

        public Criteria andCJobIdLessThan(Integer value) {
            addCriterion("c_job_id <", value, "cJobId");
            return (Criteria) this;
        }

        public Criteria andCJobIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_job_id <=", value, "cJobId");
            return (Criteria) this;
        }

        public Criteria andCJobIdIn(List<Integer> values) {
            addCriterion("c_job_id in", values, "cJobId");
            return (Criteria) this;
        }

        public Criteria andCJobIdNotIn(List<Integer> values) {
            addCriterion("c_job_id not in", values, "cJobId");
            return (Criteria) this;
        }

        public Criteria andCJobIdBetween(Integer value1, Integer value2) {
            addCriterion("c_job_id between", value1, value2, "cJobId");
            return (Criteria) this;
        }

        public Criteria andCJobIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_job_id not between", value1, value2, "cJobId");
            return (Criteria) this;
        }

        public Criteria andCApplyTimeIsNull() {
            addCriterion("c_apply_time is null");
            return (Criteria) this;
        }

        public Criteria andCApplyTimeIsNotNull() {
            addCriterion("c_apply_time is not null");
            return (Criteria) this;
        }

        public Criteria andCApplyTimeEqualTo(Date value) {
            addCriterion("c_apply_time =", value, "cApplyTime");
            return (Criteria) this;
        }

        public Criteria andCApplyTimeNotEqualTo(Date value) {
            addCriterion("c_apply_time <>", value, "cApplyTime");
            return (Criteria) this;
        }

        public Criteria andCApplyTimeGreaterThan(Date value) {
            addCriterion("c_apply_time >", value, "cApplyTime");
            return (Criteria) this;
        }

        public Criteria andCApplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("c_apply_time >=", value, "cApplyTime");
            return (Criteria) this;
        }

        public Criteria andCApplyTimeLessThan(Date value) {
            addCriterion("c_apply_time <", value, "cApplyTime");
            return (Criteria) this;
        }

        public Criteria andCApplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("c_apply_time <=", value, "cApplyTime");
            return (Criteria) this;
        }

        public Criteria andCApplyTimeIn(List<Date> values) {
            addCriterion("c_apply_time in", values, "cApplyTime");
            return (Criteria) this;
        }

        public Criteria andCApplyTimeNotIn(List<Date> values) {
            addCriterion("c_apply_time not in", values, "cApplyTime");
            return (Criteria) this;
        }

        public Criteria andCApplyTimeBetween(Date value1, Date value2) {
            addCriterion("c_apply_time between", value1, value2, "cApplyTime");
            return (Criteria) this;
        }

        public Criteria andCApplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("c_apply_time not between", value1, value2, "cApplyTime");
            return (Criteria) this;
        }

        public Criteria andCApplyStateIsNull() {
            addCriterion("c_apply_state is null");
            return (Criteria) this;
        }

        public Criteria andCApplyStateIsNotNull() {
            addCriterion("c_apply_state is not null");
            return (Criteria) this;
        }

        public Criteria andCApplyStateEqualTo(String value) {
            addCriterion("c_apply_state =", value, "cApplyState");
            return (Criteria) this;
        }

        public Criteria andCApplyStateNotEqualTo(String value) {
            addCriterion("c_apply_state <>", value, "cApplyState");
            return (Criteria) this;
        }

        public Criteria andCApplyStateGreaterThan(String value) {
            addCriterion("c_apply_state >", value, "cApplyState");
            return (Criteria) this;
        }

        public Criteria andCApplyStateGreaterThanOrEqualTo(String value) {
            addCriterion("c_apply_state >=", value, "cApplyState");
            return (Criteria) this;
        }

        public Criteria andCApplyStateLessThan(String value) {
            addCriterion("c_apply_state <", value, "cApplyState");
            return (Criteria) this;
        }

        public Criteria andCApplyStateLessThanOrEqualTo(String value) {
            addCriterion("c_apply_state <=", value, "cApplyState");
            return (Criteria) this;
        }

        public Criteria andCApplyStateLike(String value) {
            addCriterion("c_apply_state like", value, "cApplyState");
            return (Criteria) this;
        }

        public Criteria andCApplyStateNotLike(String value) {
            addCriterion("c_apply_state not like", value, "cApplyState");
            return (Criteria) this;
        }

        public Criteria andCApplyStateIn(List<String> values) {
            addCriterion("c_apply_state in", values, "cApplyState");
            return (Criteria) this;
        }

        public Criteria andCApplyStateNotIn(List<String> values) {
            addCriterion("c_apply_state not in", values, "cApplyState");
            return (Criteria) this;
        }

        public Criteria andCApplyStateBetween(String value1, String value2) {
            addCriterion("c_apply_state between", value1, value2, "cApplyState");
            return (Criteria) this;
        }

        public Criteria andCApplyStateNotBetween(String value1, String value2) {
            addCriterion("c_apply_state not between", value1, value2, "cApplyState");
            return (Criteria) this;
        }

        public Criteria andCApplyDescIsNull() {
            addCriterion("c_apply_desc is null");
            return (Criteria) this;
        }

        public Criteria andCApplyDescIsNotNull() {
            addCriterion("c_apply_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCApplyDescEqualTo(String value) {
            addCriterion("c_apply_desc =", value, "cApplyDesc");
            return (Criteria) this;
        }

        public Criteria andCApplyDescNotEqualTo(String value) {
            addCriterion("c_apply_desc <>", value, "cApplyDesc");
            return (Criteria) this;
        }

        public Criteria andCApplyDescGreaterThan(String value) {
            addCriterion("c_apply_desc >", value, "cApplyDesc");
            return (Criteria) this;
        }

        public Criteria andCApplyDescGreaterThanOrEqualTo(String value) {
            addCriterion("c_apply_desc >=", value, "cApplyDesc");
            return (Criteria) this;
        }

        public Criteria andCApplyDescLessThan(String value) {
            addCriterion("c_apply_desc <", value, "cApplyDesc");
            return (Criteria) this;
        }

        public Criteria andCApplyDescLessThanOrEqualTo(String value) {
            addCriterion("c_apply_desc <=", value, "cApplyDesc");
            return (Criteria) this;
        }

        public Criteria andCApplyDescLike(String value) {
            addCriterion("c_apply_desc like", value, "cApplyDesc");
            return (Criteria) this;
        }

        public Criteria andCApplyDescNotLike(String value) {
            addCriterion("c_apply_desc not like", value, "cApplyDesc");
            return (Criteria) this;
        }

        public Criteria andCApplyDescIn(List<String> values) {
            addCriterion("c_apply_desc in", values, "cApplyDesc");
            return (Criteria) this;
        }

        public Criteria andCApplyDescNotIn(List<String> values) {
            addCriterion("c_apply_desc not in", values, "cApplyDesc");
            return (Criteria) this;
        }

        public Criteria andCApplyDescBetween(String value1, String value2) {
            addCriterion("c_apply_desc between", value1, value2, "cApplyDesc");
            return (Criteria) this;
        }

        public Criteria andCApplyDescNotBetween(String value1, String value2) {
            addCriterion("c_apply_desc not between", value1, value2, "cApplyDesc");
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