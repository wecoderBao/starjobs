package com.starjobs.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TUserWithdrawExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUserWithdrawExample() {
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

        public Criteria andCUserWithdrawIdIsNull() {
            addCriterion("\"c_user_ withdraw _id\" is null");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawIdIsNotNull() {
            addCriterion("\"c_user_ withdraw _id\" is not null");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawIdEqualTo(Integer value) {
            addCriterion("\"c_user_ withdraw _id\" =", value, "cUserWithdrawId");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawIdNotEqualTo(Integer value) {
            addCriterion("\"c_user_ withdraw _id\" <>", value, "cUserWithdrawId");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawIdGreaterThan(Integer value) {
            addCriterion("\"c_user_ withdraw _id\" >", value, "cUserWithdrawId");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"c_user_ withdraw _id\" >=", value, "cUserWithdrawId");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawIdLessThan(Integer value) {
            addCriterion("\"c_user_ withdraw _id\" <", value, "cUserWithdrawId");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawIdLessThanOrEqualTo(Integer value) {
            addCriterion("\"c_user_ withdraw _id\" <=", value, "cUserWithdrawId");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawIdIn(List<Integer> values) {
            addCriterion("\"c_user_ withdraw _id\" in", values, "cUserWithdrawId");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawIdNotIn(List<Integer> values) {
            addCriterion("\"c_user_ withdraw _id\" not in", values, "cUserWithdrawId");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawIdBetween(Integer value1, Integer value2) {
            addCriterion("\"c_user_ withdraw _id\" between", value1, value2, "cUserWithdrawId");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawIdNotBetween(Integer value1, Integer value2) {
            addCriterion("\"c_user_ withdraw _id\" not between", value1, value2, "cUserWithdrawId");
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

        public Criteria andCUserWithdrawMoneyIsNull() {
            addCriterion("\"c_user_ withdraw _money\" is null");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawMoneyIsNotNull() {
            addCriterion("\"c_user_ withdraw _money\" is not null");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawMoneyEqualTo(Integer value) {
            addCriterion("\"c_user_ withdraw _money\" =", value, "cUserWithdrawMoney");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawMoneyNotEqualTo(Integer value) {
            addCriterion("\"c_user_ withdraw _money\" <>", value, "cUserWithdrawMoney");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawMoneyGreaterThan(Integer value) {
            addCriterion("\"c_user_ withdraw _money\" >", value, "cUserWithdrawMoney");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"c_user_ withdraw _money\" >=", value, "cUserWithdrawMoney");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawMoneyLessThan(Integer value) {
            addCriterion("\"c_user_ withdraw _money\" <", value, "cUserWithdrawMoney");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("\"c_user_ withdraw _money\" <=", value, "cUserWithdrawMoney");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawMoneyIn(List<Integer> values) {
            addCriterion("\"c_user_ withdraw _money\" in", values, "cUserWithdrawMoney");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawMoneyNotIn(List<Integer> values) {
            addCriterion("\"c_user_ withdraw _money\" not in", values, "cUserWithdrawMoney");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawMoneyBetween(Integer value1, Integer value2) {
            addCriterion("\"c_user_ withdraw _money\" between", value1, value2, "cUserWithdrawMoney");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("\"c_user_ withdraw _money\" not between", value1, value2, "cUserWithdrawMoney");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawDateIsNull() {
            addCriterion("\"c_user_ withdraw _date\" is null");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawDateIsNotNull() {
            addCriterion("\"c_user_ withdraw _date\" is not null");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawDateEqualTo(Date value) {
            addCriterion("\"c_user_ withdraw _date\" =", value, "cUserWithdrawDate");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawDateNotEqualTo(Date value) {
            addCriterion("\"c_user_ withdraw _date\" <>", value, "cUserWithdrawDate");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawDateGreaterThan(Date value) {
            addCriterion("\"c_user_ withdraw _date\" >", value, "cUserWithdrawDate");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawDateGreaterThanOrEqualTo(Date value) {
            addCriterion("\"c_user_ withdraw _date\" >=", value, "cUserWithdrawDate");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawDateLessThan(Date value) {
            addCriterion("\"c_user_ withdraw _date\" <", value, "cUserWithdrawDate");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawDateLessThanOrEqualTo(Date value) {
            addCriterion("\"c_user_ withdraw _date\" <=", value, "cUserWithdrawDate");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawDateIn(List<Date> values) {
            addCriterion("\"c_user_ withdraw _date\" in", values, "cUserWithdrawDate");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawDateNotIn(List<Date> values) {
            addCriterion("\"c_user_ withdraw _date\" not in", values, "cUserWithdrawDate");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawDateBetween(Date value1, Date value2) {
            addCriterion("\"c_user_ withdraw _date\" between", value1, value2, "cUserWithdrawDate");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawDateNotBetween(Date value1, Date value2) {
            addCriterion("\"c_user_ withdraw _date\" not between", value1, value2, "cUserWithdrawDate");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawAfterIsNull() {
            addCriterion("\"c_user_ withdraw _after\" is null");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawAfterIsNotNull() {
            addCriterion("\"c_user_ withdraw _after\" is not null");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawAfterEqualTo(Integer value) {
            addCriterion("\"c_user_ withdraw _after\" =", value, "cUserWithdrawAfter");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawAfterNotEqualTo(Integer value) {
            addCriterion("\"c_user_ withdraw _after\" <>", value, "cUserWithdrawAfter");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawAfterGreaterThan(Integer value) {
            addCriterion("\"c_user_ withdraw _after\" >", value, "cUserWithdrawAfter");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawAfterGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"c_user_ withdraw _after\" >=", value, "cUserWithdrawAfter");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawAfterLessThan(Integer value) {
            addCriterion("\"c_user_ withdraw _after\" <", value, "cUserWithdrawAfter");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawAfterLessThanOrEqualTo(Integer value) {
            addCriterion("\"c_user_ withdraw _after\" <=", value, "cUserWithdrawAfter");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawAfterIn(List<Integer> values) {
            addCriterion("\"c_user_ withdraw _after\" in", values, "cUserWithdrawAfter");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawAfterNotIn(List<Integer> values) {
            addCriterion("\"c_user_ withdraw _after\" not in", values, "cUserWithdrawAfter");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawAfterBetween(Integer value1, Integer value2) {
            addCriterion("\"c_user_ withdraw _after\" between", value1, value2, "cUserWithdrawAfter");
            return (Criteria) this;
        }

        public Criteria andCUserWithdrawAfterNotBetween(Integer value1, Integer value2) {
            addCriterion("\"c_user_ withdraw _after\" not between", value1, value2, "cUserWithdrawAfter");
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